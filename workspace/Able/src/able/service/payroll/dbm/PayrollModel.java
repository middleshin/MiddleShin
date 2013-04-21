package able.service.payroll.dbm;

import java.sql.Date;

import able.service.employee.dbm.EmployeeModel;

public class PayrollModel {
	
	private PayYmdModel payYmdModel;
	private EmployeeModel employeeModel;
	
	private long payroll_id ;
	private long pay_ymd_id ;
	private long emp_id;
	private String salary_type_cd;
	private String org_cd;
	private String pay_org_cd;
	private String pos_grd_cd;
	private String duty_cd;
	private String pos_cd;
	private String acc_cd;
	private long psum;
	private long dsum;
	private long tsum;
	private long real_amt;
	private long mod_user_id;
	private Date mod_date;
	private String bank_cd;
	private String account_no;
	private long psum1;
	private long psum2;
	private String notice;
	private String retire_yn;
	
	public PayYmdModel getPayYmdModel() {
		return payYmdModel;
	}
	public void setPayYmdModel(PayYmdModel payYmdModel) {
		this.payYmdModel = payYmdModel;
	}
	public EmployeeModel getEmployeeModel() {
		return employeeModel;
	}
	public void setEmployeeModel(EmployeeModel employeeModel) {
		this.employeeModel = employeeModel;
	}
	
	public long getPayroll_id() {
		return payroll_id;
	}
	public void setPayroll_id(long payroll_id) {
		this.payroll_id = payroll_id;
	}
	public long getPay_ymd_id() {
		return pay_ymd_id;
	}
	public void setPay_ymd_id(long pay_ymd_id) {
		this.pay_ymd_id = pay_ymd_id;
	}
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getSalary_type_cd() {
		return salary_type_cd;
	}
	public void setSalary_type_cd(String salary_type_cd) {
		this.salary_type_cd = salary_type_cd;
	}
	public String getOrg_cd() {
		return org_cd;
	}
	public void setOrg_cd(String org_cd) {
		this.org_cd = org_cd;
	}
	public String getPay_org_cd() {
		return pay_org_cd;
	}
	public void setPay_org_cd(String pay_org_cd) {
		this.pay_org_cd = pay_org_cd;
	}
	public String getPos_grd_cd() {
		return pos_grd_cd;
	}
	public void setPos_grd_cd(String pos_grd_cd) {
		this.pos_grd_cd = pos_grd_cd;
	}
	public String getDuty_cd() {
		return duty_cd;
	}
	public void setDuty_cd(String duty_cd) {
		this.duty_cd = duty_cd;
	}
	public String getPos_cd() {
		return pos_cd;
	}
	public void setPos_cd(String pos_cd) {
		this.pos_cd = pos_cd;
	}
	public String getAcc_cd() {
		return acc_cd;
	}
	public void setAcc_cd(String acc_cd) {
		this.acc_cd = acc_cd;
	}
	public long getPsum() {
		return psum;
	}
	public void setPsum(long psum) {
		this.psum = psum;
	}
	public long getDsum() {
		return dsum;
	}
	public void setDsum(long dsum) {
		this.dsum = dsum;
	}
	public long getTsum() {
		return tsum;
	}
	public void setTsum(long tsum) {
		this.tsum = tsum;
	}
	public long getReal_amt() {
		return real_amt;
	}
	public void setReal_amt(long real_amt) {
		this.real_amt = real_amt;
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
	public String getBank_cd() {
		return bank_cd;
	}
	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public long getPsum1() {
		return psum1;
	}
	public void setPsum1(long psum1) {
		this.psum1 = psum1;
	}
	public long getPsum2() {
		return psum2;
	}
	public void setPsum2(long psum2) {
		this.psum2 = psum2;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getRetire_yn() {
		return retire_yn;
	}
	public void setRetire_yn(String retire_yn) {
		this.retire_yn = retire_yn;
	}

	
	
}
