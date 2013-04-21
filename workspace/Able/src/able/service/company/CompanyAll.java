package able.service.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import able.frame.ServiceAbstract;
import able.frame.ServiceResult;

public class CompanyAll  extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
	
/*		
		PrintWriter pw = response.getWriter();

		try {
			Company company = new Company();
			List<CompanyModel> list = company.getCompanyAll(sqlSession); 
			
			// ResponseMapper.objectToJson(list, pw);
		}
		catch (Exception e) {
			pw.println("error"); 
			pw.println(e);
		}
*/	
	
	}
}
