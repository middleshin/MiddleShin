package able.frame;

import java.sql.SQLException;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.ibatis.jdbc.SqlBuilder;
import org.apache.ibatis.jdbc.SqlRunner;
import org.apache.ibatis.session.SqlSession;

import able.frame.dbm.ColListModel;

public class SqlService {
	
	// 화면으로부터 받아올수도 있으며, 
	// 회사별 기본 포멧이나 회사별 칼럼별 포멧을 지정할 수도 있다. 
	String dateFormat = "yyyy-mm-dd";

	public Integer insert(SqlSession sqlSession, String tableName, HashMap<String, String> data, String keyColumnName) {
		String isInsert = "N"; // update 가능한지 확인  
		String insertSql = ""; 
		String keyColName = keyColumnName.toLowerCase(); 
		Long seq = null ;
		
		// column list 가져오기, table name을 넘긴다.  
		List<ColListModel> colList = sqlSession.selectList("selectColList", tableName.toUpperCase());
		Iterator<ColListModel> cols = colList.iterator();

		SqlBuilder.BEGIN();
		SqlBuilder.INSERT_INTO(tableName); 
		
		while(cols.hasNext()){
			ColListModel col = new ColListModel(); 
			col = cols.next(); 
			String columnName 	= col.getColumnName().toLowerCase(); 
			String dataType 	= col.getDataType();  
			String nullable 	= col.getNullable(); 

			if(data.containsKey(columnName)){
				
				isInsert = "Y" ;

				if(columnName.equals(keyColName)){
					seq  = sqlSession.selectOne("selectSeqId");
					SqlBuilder.VALUES(columnName, seq.toString());
				}
				else { 
					if("NUMBER".equals(dataType)) { 
						SqlBuilder.VALUES(columnName, data.get(columnName));
					}
					
					if("DATE".equals(dataType)) { 
						// format은 별도로 작성해야 한다. 
						// oracle일 경우만 적용되어 있음.   
						SqlBuilder.VALUES(columnName, "to_date('" + data.get(columnName) + "', '" + dateFormat + "')");
					}
					
					if("VARCHAR2".equals(dataType)) { 
						SqlBuilder.VALUES(columnName, "'" + data.get(columnName) + "'");
					}
				} 
			}
			else {
				if(nullable.equals("N")){
					System.out.println("nullable column : " + columnName);
					return -1;   
				}
			}
		}
		
		if("Y".equals(isInsert)) {

			try {
				insertSql = SqlBuilder.SQL();
				System.out.println(insertSql);
				
				SqlRunner runner = new SqlRunner(sqlSession.getConnection());
				runner.insert(insertSql);
				return 1 ;  
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
				return -1 ; 
			} 
		} 
		else {
			System.out.println("no inserted column");
			return -1;  
		}
	}
	
	public Integer update(SqlSession sqlSession, String tableName, HashMap<String, String> data, String keyColumnName){
		String isUpdate = "N"; // update 가능한지 확인  
		String updateSql = null ; 
		String keyColName = keyColumnName.toLowerCase();
		
		// column list 가져오기, table name을 넘긴다.  
		List<ColListModel> colList = sqlSession.selectList("selectColList", tableName.toUpperCase());
		Iterator<ColListModel> cols = colList.iterator();

		SqlBuilder.BEGIN();
		SqlBuilder.UPDATE(tableName); 
		
		while(cols.hasNext()){
			ColListModel col = new ColListModel(); 
			col = cols.next(); 
			String columnName 	= col.getColumnName().toLowerCase(); 
			String dataType 	= col.getDataType();  
			String nullable 	= col.getNullable(); 
			
			if(data.containsKey(columnName)){
				
				isUpdate = "Y" ;
				  
				if("NUMBER".equals(dataType)) { 

					SqlBuilder.SET(columnName + " = " + data.get(columnName));

					if(columnName.equals(keyColName)){
						//SqlBuilder.WHERE(columnName + " = ${" + utils.toLong(data.get(columnName))); 
						SqlBuilder.WHERE(columnName + " = " + data.get(columnName) );
					}
				}
				if("DATE".equals(dataType)) { 
					// format은 별도로 작성해야 한다. - oracle일 경우  
					SqlBuilder.SET(columnName + " = to_date('" + data.get(columnName) + "', '" + dateFormat + "')");
					
				}
				if("VARCHAR2".equals(dataType)) { 
					SqlBuilder.SET(columnName + " = '" + data.get(columnName) + "'");
					if(columnName.equals(keyColName)){
						//SqlBuilder.WHERE(columnName + " = ${" + utils.toLong(data.get(columnName))); 
						SqlBuilder.WHERE(columnName + " = '" + data.get(columnName) + "'");
					}

				}
			}
			else {
				if(nullable.equals("N")){
					System.out.println("nullable column : " + columnName);
					return -1; 
				}
			}
		}
		
		if("Y".equals(isUpdate)) {
		
			updateSql = SqlBuilder.SQL(); 
			
			System.out.println(updateSql);
			
			try {
				SqlRunner runner = new SqlRunner(sqlSession.getConnection());
				runner.update(updateSql);
				return 1; 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
				return -1; 
			} 
		} 

		System.out.println("no updated column");
		return -1; 
	}

	public Integer delete(SqlSession sqlSession, String tableName, String keyColumnName, String keyId) {

		String deleteSql = ""; 
		String keyColName = keyColumnName.toLowerCase();
		
		SqlBuilder.BEGIN();
		SqlBuilder.DELETE_FROM(tableName); 
		SqlBuilder.WHERE(keyColName + " = " + keyId);
			
		deleteSql = SqlBuilder.SQL(); 
			
		try {
			SqlRunner runner = new SqlRunner(sqlSession.getConnection());
			runner.delete(deleteSql);
			return 1; 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			return -1;  
		} 
	}
	
}