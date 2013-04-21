package able.service.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;

public class CompanyByName  extends ServiceAbstract {

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
/*

		try {
			HashMap<String, Object> parameter = new HashMap<String, Object>();
			parameter.put("company_nm", "우리%");
			
			@SuppressWarnings("unchecked") 
			List<CompanyModel> list = sqlSession.selectList("CompanyByName", parameter); 
			
			CompanyModel company = new CompanyModel();
			
			company = list.get(0);
			
			String company_name = company.getCompany_nm();
			
			pw.println("result is " + company_name);
		}
		catch (Exception e) {
			pw.println(e);
		}
*/ 
	}
	
}
