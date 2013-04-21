package able.service.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.UsrModel;

public class SelectUsrByComId extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		Long comId = Long.parseLong(request.getParameter("comId")); 

		UsrModel usr = new UsrModel(); 
		usr.setComId(comId); 
		
		Admin admin = new Admin();
		List<Object> usrList = admin.selectUsrByComId(sqlSession, usr);
		result.setResult(1, "get User List", usrList); 
	}
}