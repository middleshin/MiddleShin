package able.frame;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

public class ServiceBroker {
	
	private PrintWriter printWriter = null ;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{

		SqlSession sqlSession = null; // final에서 close 한다.  

		// set Encoding to UTF-8 
		//request.setCharacterEncoding("UTF-8");
		//response.setCharacterEncoding("UTF-8");
		// response.setContentType("text/html;charset=UTF-8");
    	String ServiceName = request.getParameter("serviceName") ;
    	
	    try {
	    	ServiceAbstract service = createService(ServiceName); 
	    	System.out.println("Service Name : " + ServiceName); 
	    	
	    	// myBatis SqlSession loader 
			sqlSession = DatabaseFactory.openSession() ;

			// execute service Class
			ServiceResult result = new ServiceResult(); 
			service.execute(sqlSession, request, result);

			// sql session commit or rollback ; 
			if (result.getCode() > 0){
				// 프로세스가 정상인 경우 return code는 반드시 0보다 큰 값을 넘겨야 한다. 
				sqlSession.commit(true); 
			}
			else {
				sqlSession.rollback(true);
			}

			// 처리 결과를 resoponse에 JSON으로 변환하여 담아서 리턴한다. 
			try {
				ResponseMapper rm = new ResponseMapper();
				System.out.println(rm.objectToJson(result)); 
				
				// convert to json type 
				getPrintWriter(response).print(rm.objectToJson(result)) ;
			}
			catch (Exception e) {
				System.out.println(e);
			}
	    } 
	    catch(Exception e) { // exception을 종류별로 나열한다. 
	    	e.printStackTrace();
			response.sendRedirect("../login.jsp");
	    } 
	    finally {
	    	sqlSession.clearCache(); 	
	    	sqlSession.close(); 
	    } 
	}

	
	private ServiceAbstract createService(String seviceName) throws Exception {
		Class<?> serviceClass = null;
		
		// service class가 있는 위치를 정확히 찾아줘야 한다. 
		// 서비스 클래스가 많아지면 서브 디렉토리로 나누어야 한다. 
		// (.으로 구분하겠지요.)
		
	    String classPath = "able.service." + seviceName ; // class location path 
	    try { 
	    	serviceClass = Class.forName(classPath);
	    } 
	    catch (ClassNotFoundException e) {
	    	System.out.println(classPath + " - Class Not Found"); 
	    }
	    
	    return (ServiceAbstract) serviceClass.newInstance(); 
	}
	
	private PrintWriter getPrintWriter(HttpServletResponse response) {

		try {
			printWriter = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// System.out.println(e);
		}

		return printWriter;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}


