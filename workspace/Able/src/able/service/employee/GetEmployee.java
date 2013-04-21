package able.service.employee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import able.frame.ServiceAbstract;
import able.frame.ServiceResult;


public class GetEmployee  extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

	/*	Long emp_id = null;

		EmployeeModel argument = new EmployeeModel(); 
		EmployeeModel empModel = new EmployeeModel();

		// String to Long parse 
		emp_id = Long.parseLong(request.getParameter("emp_id"));
		argument.setEmp_id(emp_id); 
		
		Employee emp = new Employee();
		empModel = emp.getEmployee(sqlSession, argument);

		List<Object> list = new ArrayList<Object>(); 
		
		list.add(empModel); 
		result.setResult(1, "retrieve employee", list); */
		
	}
}


