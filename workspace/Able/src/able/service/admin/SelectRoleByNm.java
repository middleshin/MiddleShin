package able.service.admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.RoleModel;

public class SelectRoleByNm extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		RoleModel role = new RoleModel();
		String roleNm = request.getParameter("roleNm"); 
		role.setRoleNm(roleNm); 
		
		Admin admin = new Admin();
		
		List<Object> list = admin.selectRoleByNm(sqlSession, role);
		 
		result.setResult(list.size(), "get Role List", list); 
	}
}


