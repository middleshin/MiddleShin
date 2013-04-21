package able.service.admin.dbm;

import java.sql.Date;

public class ComModel {
	
	Long 	comId;
	String 	comLocNm;
	String 	comEngNm;
	String 	comBizNo;
	Date 	comAnnivDt;
	String 	comCeoNm;
	String 	comNote;

	
	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public String getComLocNm() {
		return comLocNm;
	}
	
	public void setComLocNm(String comLocNm) {
		this.comLocNm = comLocNm;
	}
	
	public Date getComAnnivDt() {
		return comAnnivDt;
	}
	
	public void setComAnnivDt(Date comAnnivDt) {
		this.comAnnivDt = comAnnivDt;
	}
	
	public String getComBizNo() {
		return comBizNo;
	}
	
	public void setComBizNo(String comBizNo) {
		this.comBizNo = comBizNo;
	}
	
	public String getComEngNm() {
		return comEngNm;
	}
	
	public void setComEngNm(String comEngNm) {
		this.comEngNm = comEngNm;
	}
	
	public String getComCeoNm() {
		
		return comCeoNm;
	}
	
	public void setComCeoNm(String comCeoNm) {
		this.comCeoNm = comCeoNm;
	}
	
	public String getComNote() {
		return comNote;
	}
	
	public void setComNote(String comNote) {
		this.comNote = comNote;
	}
	
}
