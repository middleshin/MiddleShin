package able.service.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.RoleMenuModel;

public class SelectRoleMenuByRoleId extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		RoleMenuModel roleMenu = new RoleMenuModel(); 
		Long roleId = Long.parseLong(request.getParameter("selectedRoleId")); 
		roleMenu.setRoleId(roleId); 
		
		Admin admin = new Admin();
		List<Object> menuList = admin.selectRoleMenuByRoleId(sqlSession, roleMenu);  
		
		result.setResult(1, "Retrieve Role Menu List By Role Id", menuList);
		 
	}
}

