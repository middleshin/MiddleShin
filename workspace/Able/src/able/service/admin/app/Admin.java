package able.service.admin.app;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import able.frame.SqlService;
import able.service.admin.dbm.ComModel;
import able.service.admin.dbm.ContrModel;
import able.service.admin.dbm.MenuModel;
import able.service.admin.dbm.RoleMenuModel;
import able.service.admin.dbm.RoleModel;
import able.service.admin.dbm.UsrModel;
import able.service.admin.dbm.VuModel;

public class Admin {

	public void admin(){
	}

/* Company ***************************************************************/
	public ComModel selectComById(SqlSession sqlSession,  Long comId){
		return sqlSession.selectOne("selectComById", comId); 
	}

	public List<Object> selectComByName(SqlSession sqlSession,  String comNm){
		return sqlSession.selectList("selectComByName", comNm); 
	}

	public int insertCom(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "com", data, "comId");
	}

	public Integer updateCom(SqlSession sqlSession, HashMap<String, String> data) {
		// SqlService.update call   
		SqlService sqlService = new SqlService();
		return sqlService.update(sqlSession, "com", data, "comId"); 
	}
	
	public int deleteCom(SqlSession sqlSession, String keyId) {
		// child data check 
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "com", "comId", keyId);
	}

/* Contract ***********************************************************************/ 
	public ContrModel selectContrById(SqlSession sqlSession,  Long contrId){
		return sqlSession.selectOne("selectContrById", contrId); 
	}

	public List<Object> selectContrByComId(SqlSession sqlSession, Long comId){
		return  sqlSession.selectList("selectContrByComId", comId) ; 
	}
	
	public int insertContr(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "contr", data, "contrId");
	}

	public Integer updateContr(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		// update(sqlSession, tableName, data, keyColumnName) 
		return sqlService.update(sqlSession, "contr", data, "contrId"); 
	}
	
	public int deleteContr(SqlSession sqlSession, String keyValue) {
		// delete(sqlSession, tableName, keyColumnName, keyValue) 
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "contr", "contrId", keyValue);
	}

/* View *****************************************************************/
	public List<Object> selectVuByNm(SqlSession sqlSession, VuModel vu){
		return  sqlSession.selectList("selectVuByNm", vu) ; 
	}

	public VuModel selectVuById(SqlSession sqlSession, VuModel vu){
		return  sqlSession.selectOne("selectVuById", vu) ; 
	}

	public int insertVu(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "vu", data, "vuId");
	}

	public Integer updateVu(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		// update(sqlSession, tableName, data, keyColumnName) 
		return sqlService.update(sqlSession, "vu", data, "vuId"); 
	}
	
	public int deleteVu(SqlSession sqlSession, String keyValue) {
		// delete(sqlSession, tableName, keyColumnName, keyValue) 
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "vu", "vuId", keyValue);
	}

/* User ***********************************************************************/ 
	public UsrModel selectUsrById(SqlSession sqlSession,  UsrModel usr){
		return sqlSession.selectOne("selectUsrById", usr); 
	}

	public List<Object> selectUsrByComId(SqlSession sqlSession, UsrModel usr){
		return  sqlSession.selectList("selectUsrByComId", usr) ; 
	}

	public List<Object> selectUsrByUsrNm(SqlSession sqlSession, UsrModel usr){
		return  sqlSession.selectList("selectUsrByUsrNm", usr) ; 
	}

	
	public int insertUsr(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "usr", data, "usrId");
	}

	public Integer updateUsr(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		// update(sqlSession, tableName, data, keyColumnName) 
		return sqlService.update(sqlSession, "usr", data, "usrId"); 
	}
	
	public int deleteUsr(SqlSession sqlSession, String keyValue) {
		// delete(sqlSession, tableName, keyColumnName, keyValue) 
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "usr", "usrId", keyValue);
	}

	
/* Role Service ********************************************************/
	public RoleModel selectRoleById(SqlSession sqlSession,  RoleModel role){
		return sqlSession.selectOne("selectRoleById", role); 
	}

	public List<Object> selectRoleByNm(SqlSession sqlSession, RoleModel role){
		return  sqlSession.selectList("selectRoleByNm", role) ; 
	}

	public int insertRole(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "role", data, "roleId");
	}

	public Integer updateRole(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		// update(sqlSession, tableName, data, keyColumnName) 
		return sqlService.update(sqlSession, "role", data, "roleId"); 
	}
	
	public int deleteRole(SqlSession sqlSession, String keyValue) {
		// delete(sqlSession, tableName, keyColumnName, keyValue) 
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "role", "roleId", keyValue);
	}


/* Menu Service ********************************************************/
	public MenuModel selectMenuById(SqlSession sqlSession,  MenuModel menu){
		return sqlSession.selectOne("selectMenuById", menu); 
	}

	public List<Object> selectMenuByNm(SqlSession sqlSession, MenuModel menu){
		return  sqlSession.selectList("selectMenuByNm", menu) ; 
	}

	public int insertMenu(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "menu", data, "menuId");
	}

	public Integer updateMenu(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		// update(sqlSession, tableName, data, keyColumnName) 
		return sqlService.update(sqlSession, "menu", data, "menuId"); 
	}
	
	public int deleteMenu(SqlSession sqlSession, String keyValue) {
		// delete(sqlSession, tableName, keyColumnName, keyValue) 
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "menu", "menuId", keyValue);
	}

	
/* RoleMenu Service ********************************************************/
	
	public List<Object> selectRoleMenuByRoleId(SqlSession sqlSession,  RoleMenuModel roleMenu){
		return sqlSession.selectList("selectRoleMenuByRoleId", roleMenu); 
	}

	public List<Object> selectRoleMenuByAll(SqlSession sqlSession,  RoleMenuModel roleMenu){
		return sqlSession.selectList("selectRoleMenuByAll", roleMenu); 
	}

	public int insertRoleMenu(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.insert(sqlSession, "RoleMenu", data, "roleMenuId");
	}

	public Integer updateRoleMenu(SqlSession sqlSession, HashMap<String, String> data) {
		SqlService sqlService = new SqlService();
		return sqlService.update(sqlSession, "RoleMenu", data, "roleMenuId"); 
	}
	
	public int deleteRoleMenu(SqlSession sqlSession, String keyValue) {
		SqlService sqlService = new SqlService();
		return sqlService.delete(sqlSession, "RoleMenu", "roleMenuId", keyValue);
	}

	
	/*	
	public List<Object> getComList(SqlSession sqlSession, HashMap<String, String> arg){

		SqlRunner runner = new SqlRunner(sqlSession.getConnection());
		String sql = "";
		
		sql = "select * from com"; 
		
		try {
			List<Map<String,Object>> result = runner.selectAll(sql);
			List<Object> list = new ArrayList<Object>();   
			
			ObjectMapper m = new ObjectMapper();
			
			Iterator<Map<String, Object>> rows = result.iterator();
			
			while(rows.hasNext()){
				// json.convertValue를 참조하였음. 
				ComModel com = m.convertValue(rows.next(), ComModel.class);	
				list.add(com); 
			}

			return  list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null; 

		// return  sqlSession.selectList("selectCom", arg) ; 
	}
*/
	
/*	Map을 클래스로 바꾸는 함수 
	public static Map<String, Object> ConvertObjectToMap(Object obj) throws 
    IllegalAccessException, 
    IllegalArgumentException, 
    InvocationTargetException {
        Class<?> pomclass = obj.getClass();
        pomclass = obj.getClass();
        Method[] methods = obj.getClass().getMethods();


        Map<String, Object> map = new HashMap<String, Object>();
        for (Method m : methods) {
           if (m.getName().startsWith("get") && !m.getName().startsWith("getClass")) {
              Object value = (Object) m.invoke(obj);
              map.put(m.getName().substring(3), (Object) value);
           }
        }
    return map;
}
This is how to call it
   Test test = new Test()
   Map<String, Object> map = ConvertObjectToMap(test);
*/

}
