package able.service.employee.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Org {

	public List<Object> getOrgList(SqlSession sqlSession){
		return  sqlSession.selectList("selectOrg") ; 
	}
	
}
