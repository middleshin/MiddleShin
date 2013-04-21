package able.service.employee.dbm;

import java.sql.Date;

public class EmployeeModel {

	private long emp_id; 
	private String company_cd ; 
	private String emp_no ; 
	private String emp_nm  ; 
	private String eng_nm ; 
	private String chi_nm ; 
	private String ctz_no ; 
	private String emp_kind_cd ; 
	private String hire_cd ; 
	private String in_offi_yn ; 
	private String sex_cd ; 
	private Date birth_ymd ; 
	private String solar_type ; 
	private String pos_grd_cd ; 
	private Date pos_grd_ymd;  
	private Date next_pos_grd_ymd; 
	private String pos_cd ;
	private Date pos_ymd; 
	private Long yearnum; 
	private Date yearnum_ymd ; 
	private Date next_yearnum_ymd; 
	private String org_cd ;
	private Date org_ymd; 
	private String pay_kind_cd;
	private String pay_org_cd;
	private String work_org_cd;
	private Date work_org_ymd;
	private String duty_cd; 
	private Date duty_ymd; 
	private String call_cd; 
	private Date call_ymd; 
	private String job_cd; 
	private Date job_ymd; 
	private Date hire_ymd; 
	private Date annual_cal_ymd; 
	private Date retire_ymd; 
	private Date retire_plan_ymd; 
	private String retire_type_cd; 
	private Date training_s_ymd;
	private Date training_e_ymd; 
	private String emp_kind_sub_cd;
	private String repreduty_cd;
	private String file_nm;
	private String file_id;
	private long annual_dd;
	private long mod_user_id;
	private Date mod_date;
	private String op_group_cd;
	private Date op_group_ymd;
	
	
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getCompany_cd() {
		return company_cd;
	}
	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_nm() {
		return emp_nm;
	}
	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}
	public String getEng_nm() {
		return eng_nm;
	}
	public void setEng_nm(String eng_nm) {
		this.eng_nm = eng_nm;
	}
	public String getChi_nm() {
		return chi_nm;
	}
	public void setChi_nm(String chi_nm) {
		this.chi_nm = chi_nm;
	}
	public String getCtz_no() {
		return ctz_no;
	}
	public void setCtz_no(String ctz_no) {
		this.ctz_no = ctz_no;
	}
	public String getEmp_kind_cd() {
		return emp_kind_cd;
	}
	public void setEmp_kind_cd(String emp_kind_cd) {
		this.emp_kind_cd = emp_kind_cd;
	}
	public String getHire_cd() {
		return hire_cd;
	}
	public void setHire_cd(String hire_cd) {
		this.hire_cd = hire_cd;
	}
	public String getIn_offi_yn() {
		return in_offi_yn;
	}
	public void setIn_offi_yn(String in_offi_yn) {
		this.in_offi_yn = in_offi_yn;
	}
	public String getSex_cd() {
		return sex_cd;
	}
	public void setSex_cd(String sex_cd) {
		this.sex_cd = sex_cd;
	}
	public Date getBirth_ymd() {
		return birth_ymd;
	}
	public void setBirth_ymd(Date birth_ymd) {
		this.birth_ymd = birth_ymd;
	}
	public String getSolar_type() {
		return solar_type;
	}
	public void setSolar_type(String solar_type) {
		this.solar_type = solar_type;
	}
	public String getPos_grd_cd() {
		return pos_grd_cd;
	}
	public void setPos_grd_cd(String pos_grd_cd) {
		this.pos_grd_cd = pos_grd_cd;
	}
	public Date getPos_grd_ymd() {
		return pos_grd_ymd;
	}
	public void setPos_grd_ymd(Date pos_grd_ymd) {
		this.pos_grd_ymd = pos_grd_ymd;
	}
	public Date getNext_pos_grd_ymd() {
		return next_pos_grd_ymd;
	}
	public void setNext_pos_grd_ymd(Date next_pos_grd_ymd) {
		this.next_pos_grd_ymd = next_pos_grd_ymd;
	}
	public String getPos_cd() {
		return pos_cd;
	}
	public void setPos_cd(String pos_cd) {
		this.pos_cd = pos_cd;
	}
	public Date getPos_ymd() {
		return pos_ymd;
	}
	public void setPos_ymd(Date pos_ymd) {
		this.pos_ymd = pos_ymd;
	}
	public Long getYearnum() {
		return yearnum;
	}
	public void setYearnum(Long yearnum) {
		this.yearnum = yearnum;
	}
	public Date getYearnum_ymd() {
		return yearnum_ymd;
	}
	public void setYearnum_ymd(Date yearnum_ymd) {
		this.yearnum_ymd = yearnum_ymd;
	}
	public Date getNext_yearnum_ymd() {
		return next_yearnum_ymd;
	}
	public void setNext_yearnum_ymd(Date next_yearnum_ymd) {
		this.next_yearnum_ymd = next_yearnum_ymd;
	}
	public String getOrg_cd() {
		return org_cd;
	}
	public void setOrg_cd(String org_cd) {
		this.org_cd = org_cd;
	}
	public Date getOrg_ymd() {
		return org_ymd;
	}
	public void setOrg_ymd(Date org_ymd) {
		this.org_ymd = org_ymd;
	}
	public String getPay_kind_cd() {
		return pay_kind_cd;
	}
	public void setPay_kind_cd(String pay_kind_cd) {
		this.pay_kind_cd = pay_kind_cd;
	}
	public String getPay_org_cd() {
		return pay_org_cd;
	}
	public void setPay_org_cd(String pay_org_cd) {
		this.pay_org_cd = pay_org_cd;
	}
	public String getWork_org_cd() {
		return work_org_cd;
	}
	public void setWork_org_cd(String work_org_cd) {
		this.work_org_cd = work_org_cd;
	}
	public Date getWork_org_ymd() {
		return work_org_ymd;
	}
	public void setWork_org_ymd(Date work_org_ymd) {
		this.work_org_ymd = work_org_ymd;
	}
	public String getDuty_cd() {
		return duty_cd;
	}
	public void setDuty_cd(String duty_cd) {
		this.duty_cd = duty_cd;
	}
	public Date getDuty_ymd() {
		return duty_ymd;
	}
	public void setDuty_ymd(Date duty_ymd) {
		this.duty_ymd = duty_ymd;
	}
	public String getCall_cd() {
		return call_cd;
	}
	public void setCall_cd(String call_cd) {
		this.call_cd = call_cd;
	}
	public Date getCall_ymd() {
		return call_ymd;
	}
	public void setCall_ymd(Date call_ymd) {
		this.call_ymd = call_ymd;
	}
	public String getJob_cd() {
		return job_cd;
	}
	public void setJob_cd(String job_cd) {
		this.job_cd = job_cd;
	}
	public Date getJob_ymd() {
		return job_ymd;
	}
	public void setJob_ymd(Date job_ymd) {
		this.job_ymd = job_ymd;
	}
	public Date getHire_ymd() {
		return hire_ymd;
	}
	public void setHire_ymd(Date hire_ymd) {
		this.hire_ymd = hire_ymd;
	}
	public Date getAnnual_cal_ymd() {
		return annual_cal_ymd;
	}
	public void setAnnual_cal_ymd(Date annual_cal_ymd) {
		this.annual_cal_ymd = annual_cal_ymd;
	}
	public Date getRetire_ymd() {
		return retire_ymd;
	}
	public void setRetire_ymd(Date retire_ymd) {
		this.retire_ymd = retire_ymd;
	}
	public Date getRetire_plan_ymd() {
		return retire_plan_ymd;
	}
	public void setRetire_plan_ymd(Date retire_plan_ymd) {
		this.retire_plan_ymd = retire_plan_ymd;
	}
	public String getRetire_type_cd() {
		return retire_type_cd;
	}
	public void setRetire_type_cd(String retire_type_cd) {
		this.retire_type_cd = retire_type_cd;
	}
	public Date getTraining_s_ymd() {
		return training_s_ymd;
	}
	public void setTraining_s_ymd(Date training_s_ymd) {
		this.training_s_ymd = training_s_ymd;
	}
	public Date getTraining_e_ymd() {
		return training_e_ymd;
	}
	public void setTraining_e_ymd(Date training_e_ymd) {
		this.training_e_ymd = training_e_ymd;
	}
	public String getEmp_kind_sub_cd() {
		return emp_kind_sub_cd;
	}
	public void setEmp_kind_sub_cd(String emp_kind_sub_cd) {
		this.emp_kind_sub_cd = emp_kind_sub_cd;
	}
	public String getRepreduty_cd() {
		return repreduty_cd;
	}
	public void setRepreduty_cd(String repreduty_cd) {
		this.repreduty_cd = repreduty_cd;
	}
	public String getFile_nm() {
		return file_nm;
	}
	public void setFile_nm(String file_nm) {
		this.file_nm = file_nm;
	}
	public String getFile_id() {
		return file_id;
	}
	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}
	public long getAnnual_dd() {
		return annual_dd;
	}
	public void setAnnual_dd(long annual_dd) {
		this.annual_dd = annual_dd;
	}
	public long getMod_user_id() {
		return mod_user_id;
	}
	public void setMod_user_id(long mod_user_id) {
		this.mod_user_id = mod_user_id;
	}
	public Date getMod_date() {
		return mod_date;
	}
	public void setMod_date(Date mod_date) {
		this.mod_date = mod_date;
	}
	public String getOp_group_cd() {
		return op_group_cd;
	}
	public void setOp_group_cd(String op_group_cd) {
		this.op_group_cd = op_group_cd;
	}
	public Date getOp_group_ymd() {
		return op_group_ymd;
	}
	public void setOp_group_ymd(Date op_group_ymd) {
		this.op_group_ymd = op_group_ymd;
	}

}
