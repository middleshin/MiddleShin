package able.service.admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.VuModel;

public class SelectVuByNm extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {
		
		String vuNm = request.getParameter("vuNm"); 
		VuModel vu = new VuModel(); 
		
		vu.setVuNm(vuNm); 
		
		Admin admin = new Admin();
		//List<Object> list = admin.selectComByName(sqlSession, comLocName);
		List<Object> list = admin.selectVuByNm(sqlSession, vu);
		 
		result.setResult(list.size(), "get View List", list); 
	}
}


