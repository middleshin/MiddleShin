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

public class InsertContr extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

		// 필요한 경우 data에 대한 값을 변경하여 넘겨주어야 한다. 
		Utils utils = new Utils() ;
		HashMap<String, String> data = utils.parmToDBName(request);
		
		Admin admin = new Admin();
		
		int rtn = 0; 
		rtn = admin.insertContr(sqlSession, data);
		
		System.out.println("return : " + rtn ); 
		if(rtn > -1){
			result.setResult(1, "insert OK", null); 
		}
		else{
			result.setResult(-1, "계약정보 등록에 오류가 발생하였습니다.", null);
		}

	}

}
