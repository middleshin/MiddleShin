package able.service.admin.dbm;

import java.sql.Date;

public class UsrModel {
	Long 	usrId;
	Long 	comId;
	String 	usrNm;
	String 	usrLoginId;
	String 	usrPasswd;	
	Date 	usrStartDt;
	Date 	usrCloseDt;
	
	ComModel comModel;

	public Long getUsrId() {
		return usrId;
	}

	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}

	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrLoginId() {
		return usrLoginId;
	}

	public void setUsrLoginId(String usrLoginId) {
		this.usrLoginId = usrLoginId;
	}

	public String getUsrPasswd() {
		return usrPasswd;
	}

	public void setUsrPasswd(String usrPasswd) {
		this.usrPasswd = usrPasswd;
	}

	public Date getUsrStartDt() {
		return usrStartDt;
	}

	public void setUsrStartDt(Date usrStartDt) {
		this.usrStartDt = usrStartDt;
	}

	public Date getUsrCloseDt() {
		return usrCloseDt;
	}

	public void setUsrCloseDt(Date usrCloseDt) {
		this.usrCloseDt = usrCloseDt;
	}

	public ComModel getComModel() {
		return comModel;
	}

	public void setComModel(ComModel comModel) {
		this.comModel = comModel;
	}

}
