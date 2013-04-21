package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;
import able.service.admin.dbm.ComModel;

public class SelectComById extends ServiceAbstract { 
	
	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
	throws ServletException, IOException {

		Long comId = Long.parseLong(request.getParameter("comId"));

		if (comId == null){
			result.setResult(-100, "ID를 찾을 수 없습니다.", null);
		}
		else { 
			Admin admin= new Admin();
			ComModel comModel = admin.selectComById(sqlSession, comId);
			if(comModel==null){
				result.setResult(-1, "company retrieve fail", null);
			}
			else {
				result.setResult(1, "retrieve com model", comModel);
			}
		}
	}
}


