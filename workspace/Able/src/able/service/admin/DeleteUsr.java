package able.service.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.service.admin.app.Admin;

public class DeleteUsr extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

		Admin admin = new Admin();

		// 삭제하기 위한 Key값을 넘겨준다. 
		String usrId = request.getParameter("usrId"); 
		 
		if(admin.deleteUsr(sqlSession, usrId) > 0){
			result.setResult(1, "사용자 정보를 삭제하였습니다.", null); 
		}
		else{
			result.setResult(-1, "사용자 정보 삭제에 실패하였습니다.", null);
		}
	}
}
