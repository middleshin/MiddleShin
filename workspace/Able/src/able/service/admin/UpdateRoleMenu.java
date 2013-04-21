package able.service.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.frame.Utils;
import able.service.admin.app.Admin;

public class UpdateRoleMenu extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

		System.out.println(request.getQueryString()); 
		
		String key = null; 
		String[] value = null; 

		//  parameter를 순서대로 뽑아서 비교하고 정리해야 한다. 
		Map<String, String[]> map = request.getParameterMap();
		
		Iterator<String> it = map.keySet().iterator(); 

		while(it.hasNext()){
			key=it.next();
			value=map.get(key);
			for(int i=0;i<value.length;i++){
				System.out.println(key + ":" + value[i]); 
			}
		}

		result.setResult(1, "Update Ok", null);
		
	/*	
		int rows = 0; 
		Utils utils = new Utils() ;

		Admin admin = new Admin();
		
		// update 칼럼에 대한 체크가 필요함. 모든 칼럼이 정상인지 확인해야 함.  
		// - 이거 어디서 하지? 여기서 해야 하나? 아니면 admin에서 해야 하나?  
 		
		HashMap<String, String> data = utils.parmToDBName(request);
		 
		rows = admin.updateRole(sqlSession, data); 
		
		if( rows > 0){
			result.setResult(rows, "Update Ok", null); 
		}
		else{
			result.setResult(rows, "Update Fail", null);
		}
	*/
	}
	
		
}