package able.service.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.employee.app.Org;

public class GetOrgList extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {


			Org org = new Org();
			List<Object> list = org.getOrgList(sqlSession);

			result.setResult(list.size(), "", list);
			
		}

}
