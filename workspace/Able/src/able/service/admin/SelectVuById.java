package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.VuModel;

public class SelectVuById extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		Long vuId = Long.parseLong(request.getParameter("vuId")); 
		VuModel vu = new VuModel(); 
		
		vu.setVuId(vuId); 
		
		Admin admin = new Admin();
		VuModel vuModel = admin.selectVuById(sqlSession, vu);
		result.setResult(1, "get View List", vuModel); 
	}
}