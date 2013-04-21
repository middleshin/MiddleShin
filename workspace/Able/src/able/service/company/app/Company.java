package able.service.company.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import able.service.company.dbm.CompanyModel;




public class Company {

	public List<CompanyModel> getCompanyAll( SqlSession sqlSession){
		
		return  sqlSession.selectList("CompanyAll") ; 
	}
}
