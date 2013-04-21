package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.RoleModel;

public class SelectRoleById extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		RoleModel role = new RoleModel();
		Long roleId = Long.parseLong(request.getParameter("roleId"));
		// if roleId == null check 
		role.setRoleId(roleId); 
		
		Admin admin = new Admin();
		RoleModel roleModel = admin.selectRoleById(sqlSession, role);
		 
		result.setResult(1, "get Role List", roleModel); 
	}
}


