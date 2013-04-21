package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.UsrModel;

public class SelectUsrById extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		Long usrId = Long.parseLong(request.getParameter("usrId")); 

		UsrModel usr = new UsrModel(); 
		usr.setUsrId(usrId); 
		
		Admin admin = new Admin();
		UsrModel usrList = admin.selectUsrById(sqlSession, usr);
		result.setResult(1, "get User List", usrList); 
	}
}