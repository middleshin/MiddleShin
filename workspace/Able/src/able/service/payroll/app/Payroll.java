package able.service.payroll.app;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import able.service.payroll.dbm.PayrollModel;



public class Payroll {

	public List<PayrollModel> getPayrollAll( SqlSession sqlSession){
		
		return null; 
		// return  sqlSession.selectList("selectPayrollAlll") ; 
	}
}
