package able.service.company.dbm;

import java.sql.Date;

public class CompanyModel {

	private long company_id ; 
	private String company_nm;
	private String biz_no;
	private String homepage_url;  
	private Date reg_date ;
	private Date foundation_day; 
	private Date ext_date; 
	private String ext_reason; 

	public long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}
	public String getCompany_nm() {
		return company_nm;
	}
	public void setCompany_nm(String company_nm) {
		this.company_nm = company_nm;
	}
	public String getBiz_no() {
		return biz_no;
	}
	public void setBiz_no(String biz_no) {
		this.biz_no = biz_no;
	}
	public String getHomepage_url() {
		return homepage_url;
	}
	public void setHomepage_url(String homepage_url) {
		this.homepage_url = homepage_url;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getFoundation_day() {
		return foundation_day;
	}
	public void setFoundation_day(Date foundation_day) {
		this.foundation_day = foundation_day;
	}
	public Date getExt_date() {
		return ext_date;
	}
	public void setExt_date(Date ext_date) {
		this.ext_date = ext_date;
	}
	public String getExt_reason() {
		return ext_reason;
	}
	public void setExt_reason(String ext_reason) {
		this.ext_reason = ext_reason;
	}
	
	
	
}
