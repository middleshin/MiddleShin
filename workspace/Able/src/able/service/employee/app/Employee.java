package able.service.employee.app;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import able.service.employee.dbm.EmployeeModel;

public class Employee {

	public void getEmlpoyeeList() {
	}

	// 사원 리스트 조회하기 
	
	public List<Object> getEmployeeList(SqlSession sqlSession){
		return  sqlSession.selectList("selectEmployeeAll") ; 
	}
	
	// 한명 만 조회하기 
	public EmployeeModel getEmployee( SqlSession sqlSession, EmployeeModel employeeModel) {
		// employeeModel로 형변환 해서 리턴한다.
		return  (EmployeeModel)sqlSession.selectOne("selectEmployeeAll", employeeModel) ; 
	}
	
	public Integer updateEmployee( SqlSession sqlSession, EmployeeModel employeeModel) {
		// update employee - 컬럼이 많아서 힘드네....
	
		Integer i = sqlSession.update("updateEmployee", employeeModel);
		
		System.out.println("employee.updateEmployee : " + i );
		return i;  
	}

}



