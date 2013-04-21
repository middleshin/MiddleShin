package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.ContrModel;

public class SelectContrById extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) throws ServletException, IOException {

		Long contrId ; 
		contrId = Long.parseLong(request.getParameter("contrId")); 
		Admin admin = new Admin(); 
		
		ContrModel contrModel = admin.selectContrById(sqlSession, contrId);
		
		if(contrModel==null){
			result.setResult(-1, "계약 조회 오류", null);
		}
		else {
			result.setResult(1, "", contrModel); // 메세지 없음. 
		}
	}
}
