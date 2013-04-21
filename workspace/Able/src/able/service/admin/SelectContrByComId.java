package able.service.admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;

public class SelectContrByComId extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

		Long comId ; 
		comId = Long.parseLong(request.getParameter("comId")); 
		Admin admin = new Admin(); 
		
		List<Object> list = admin.selectContrByComId(sqlSession, comId);
		
		result.setResult(list.size(), "", list);
	}
}
