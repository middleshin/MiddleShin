package able.frame;

import java.util.HashMap;
import org.apache.ibatis.session.SqlSession;
import com.fasterxml.jackson.databind.JsonNode;

public class Service {
	
	JsonNode resultData = null;  
	
	public void execute(String serviceName, HashMap<Object, Object> param) {  
		
		// myBatis SqlSession loader		
		SqlSession sqlSession = DatabaseFactory.openSession() ;
 		
		// Service Class Info(path) 
    	ServiceAbstract serviceClass = null; 
    	String classPath = "able.service." + serviceName ; // class location path
    	
    	// create service class 
	    try {
	    	Class<?> classLoader = Class.forName(classPath);
	    	serviceClass = (ServiceAbstract)classLoader.newInstance();
	    } 
	    catch (ClassNotFoundException e) {
	    	System.out.println(classPath + " - Class Not Found"); 
	    } catch (InstantiationException e) {
			// TODO Auto-generated catch block
	    	System.out.println(classPath + " - Class InstantiationException");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println(classPath + " - Class IllegalAccessException");
			e.printStackTrace();
		}

		// execute service Class
		ServiceResult result = new ServiceResult(); 
		serviceClass.execute(sqlSession, param, result);

		// sql session commit or Rollback ; 
		if (result.getCode() > 0){
			// 프로세스가 정상인 경우 return Code는 반드시 0보다 큰 값을 넘겨야 한다. 
			sqlSession.commit(true); 
		}
		else {
			sqlSession.rollback(true);
		}

		// 처리 결과를 resoponse에 JSON으로 변환하여 담아서 리턴한다. 
		try {
			ResponseMapper rm = new ResponseMapper();
			System.out.println(rm.objectToJson(result)); 
			resultData = rm.toJson(result.getData()); 
			// convert to json type 

		}
		catch (Exception e) {
			System.out.println(e);
		}

			
	}

	
}


