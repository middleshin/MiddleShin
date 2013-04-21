package able.service.admin;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.frame.Utils;
import able.service.admin.app.Admin;

public class UpdateContr extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

		int rows = 0; 
		Utils utils = new Utils() ;

		Admin admin = new Admin();
		HashMap<String, String> data = utils.parmToDBName(request);
		 
		rows = admin.updateContr(sqlSession, data); 
		
		if( rows > 0){
			result.setResult(rows, "Update Ok", null); 
		}
		else{
			result.setResult(rows, "Update Fail", null);
		}

	}
}
