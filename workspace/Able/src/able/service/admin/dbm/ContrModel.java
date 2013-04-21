package able.service.admin.dbm;

import java.sql.Date;

public class ContrModel {

	Long 	contrId;
	Long 	comId; 
	String 	contrNm;
	String 	contrTypeCd;
	Date	contrSignDt;
	Date	contrStartDt;
	Date 	contrCloseDt;
	String	contrNote;
	
	ComModel comModel;

	public Long getContrId() {
		return contrId;
	}
	public void setContrId(Long contrId) {
		this.contrId = contrId;
	}
	public Long getComId() {
		return comId;
	}
	public void setComId(Long comId) {
		this.comId = comId;
	}
	public String getContrNm() {
		return contrNm;
	}
	public void setContrNm(String contrNm) {
		this.contrNm = contrNm;
	}
	public String getContrTypeCd() {
		return contrTypeCd;
	}
	public void setContrTypeCd(String contrTypeCd) {
		this.contrTypeCd = contrTypeCd;
	}
	public Date getContrSignDt() {
		return contrSignDt;
	}
	public void setContrSignDt(Date contrSignDt) {
		this.contrSignDt = contrSignDt;
	}
	public Date getContrStartDt() {
		return contrStartDt;
	}
	public void setContrStartDt(Date contrStartDt) {
		this.contrStartDt = contrStartDt;
	}
	public Date getContrCloseDt() {
		return contrCloseDt;
	}
	public void setContrCloseDt(Date contrCloseDt) {
		this.contrCloseDt = contrCloseDt;
	}
	public String getContrNote() {
		return contrNote;
	}
	public void setContrNote(String contrNote) {
		this.contrNote = contrNote;
	}
	public ComModel getComModel() {
		return comModel;
	}
	public void setComModel(ComModel comModel) {
		this.comModel = comModel;
	}
}
