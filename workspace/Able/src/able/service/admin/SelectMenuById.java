package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.MenuModel;

public class SelectMenuById extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		Long menuId = Long.parseLong(request.getParameter("menuId")); 

		MenuModel menu = new MenuModel(); 
		menu.setMenuId(menuId); 
		
		Admin admin = new Admin();
		MenuModel  menuModel = admin.selectMenuById(sqlSession, menu);
		result.setResult(1, "Select Menu Model", menuModel); 
	}
}