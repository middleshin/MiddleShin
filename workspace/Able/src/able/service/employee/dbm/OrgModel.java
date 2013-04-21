package able.service.employee.dbm;

import java.sql.Date;

public class OrgModel {
	
	String OrmOrgCd;
	String OrmOrgNm;
	Date OrmStaYmd;
	Date OrmEndYmd;
	
	public String getOrmOrgCd() {
		return OrmOrgCd;
	}
	public void setOrmOrgCd(String ormOrgCd) {
		OrmOrgCd = ormOrgCd;
	}
	public String getOrmOrgNm() {
		return OrmOrgNm;
	}
	public void setOrmOrgNm(String ormOrgNm) {
		OrmOrgNm = ormOrgNm;
	}
	public Date getOrmStaYmd() {
		return OrmStaYmd;
	}
	public void setOrmStaYmd(Date ormStaYmd) {
		OrmStaYmd = ormStaYmd;
	}
	public Date getOrmEndYmd() {
		return OrmEndYmd;
	}
	public void setOrmEndYmd(Date ormEndYmd) {
		OrmEndYmd = ormEndYmd;
	}
	

	
}
