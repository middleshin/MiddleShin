package able.service.employee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import able.frame.ServiceAbstract;
import able.frame.ServiceResult;
import able.frame.Utils;
import able.service.employee.app.Employee;
import able.service.employee.dbm.EmployeeModel;

public class UpdateEmployee  extends ServiceAbstract { 

	public void execute(SqlSession sqlSession, HttpServletRequest request, ServiceResult result) 
			throws ServletException, IOException {

		Utils util = new Utils() ;
		Employee emp = new Employee(); 
		
		//  sql Argument 
		EmployeeModel argument = new EmployeeModel(); 

		argument.setEmp_id(util.toLong(request.getParameter("emp_id")));
		argument.setCompany_cd(request.getParameter("company_cd"));
		argument.setEmp_no(request.getParameter("emp_no"));
		argument.setEmp_nm(request.getParameter("emp_nm"));
		argument.setEng_nm(request.getParameter("eng_nm"));
		argument.setChi_nm(request.getParameter("chi_nm"));
		argument.setCtz_no(request.getParameter("ctz_no"));
		argument.setEmp_kind_cd(request.getParameter("emp_kind_cd"));
		argument.setHire_cd(request.getParameter("hire_cd"));
		argument.setIn_offi_yn(request.getParameter("in_offi_yn"));
		argument.setSex_cd(request.getParameter("sex_cd"));
		argument.setBirth_ymd(util.toDate(request.getParameter("birth_ymd")));
		argument.setSolar_type(request.getParameter("solar_type"));
		argument.setPos_grd_cd(request.getParameter("pos_grd_cd"));
		argument.setPos_grd_ymd(util.toDate(request.getParameter("pos_grd_ymd")));
		argument.setNext_pos_grd_ymd(util.toDate(request.getParameter("next_pos_grd_ymd")));
		argument.setPos_ymd(util.toDate(request.getParameter("pos_ymd")));
		argument.setYearnum(util.toLong(request.getParameter("yearnum")));
		argument.setYearnum_ymd(util.toDate(request.getParameter("yearnum_ymd")));
		argument.setNext_yearnum_ymd(util.toDate(request.getParameter("next_yearnum_ymd")));
		argument.setOrg_cd(request.getParameter("org_cd"));
		argument.setOrg_ymd(util.toDate(request.getParameter("org_ymd")));
		argument.setPay_kind_cd(request.getParameter("pay_kind_cd"));
		argument.setPay_org_cd(request.getParameter("pay_org_cd"));
		argument.setWork_org_cd(request.getParameter("work_org_cd"));
		argument.setWork_org_ymd(util.toDate(request.getParameter("work_org_ymd")));
		argument.setDuty_ymd(util.toDate(request.getParameter("duty_ymd")));
		argument.setCall_cd(request.getParameter("call_cd"));
		argument.setCall_ymd(util.toDate(request.getParameter("call_ymd")));
		argument.setJob_ymd(util.toDate(request.getParameter("job_ymd")));
		argument.setHire_ymd(util.toDate(request.getParameter("hire_ymd")));
		argument.setAnnual_cal_ymd(util.toDate(request.getParameter("annual_cal_ymd")));
		argument.setRetire_ymd(util.toDate(request.getParameter("retire_ymd")));
		argument.setRetire_plan_ymd(util.toDate(request.getParameter("retire_plan_ymd")));
		argument.setRetire_type_cd(request.getParameter("retire_type_cd"));
		argument.setTraining_s_ymd(util.toDate(request.getParameter("training_s_ymd")));
		argument.setTraining_e_ymd(util.toDate(request.getParameter("training_e_ymd")));
		argument.setEmp_kind_sub_cd(request.getParameter("emp_kind_sub_cd"));
		argument.setRepreduty_cd(request.getParameter("repreduty_cd"));
		argument.setFile_nm(request.getParameter("file_nm"));
		argument.setFile_id(request.getParameter("file_id"));
		argument.setAnnual_dd(util.toLong(request.getParameter("annual_dd")));
		argument.setMod_user_id(util.toLong(request.getParameter("mod_user_id")));
		argument.setMod_date(util.toDate(request.getParameter("mod_date")));
		argument.setOp_group_cd(request.getParameter("op_group_cd"));
		argument.setOp_group_ymd(util.toDate(request.getParameter("op_group_ymd")));
		
		// update employee 
		if(emp.updateEmployee(sqlSession, argument)>0){
			result.setResult(1, "update employee", null); 
		}

	}	
}


