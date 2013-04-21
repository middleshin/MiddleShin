package able.frame;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException; 
import org.apache.ibatis.session.SqlSession;

public abstract class ServiceAbstract {
	
    public void execute(SqlSession sqlSession, HashMap<Object, Object> param, ServiceResult result)  
    		throws ServletException, IOException {
    }

}

