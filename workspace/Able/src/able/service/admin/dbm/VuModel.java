package able.service.admin.dbm;

import java.sql.Date;

public class VuModel {
	Long vuId;
	String vuNm;
	String vuFilePath;
	Date vuRegDt;
	String vuNote;
	
	public Long getVuId() {
		return vuId;
	}
	public void setVuId(Long vuId) {
		this.vuId = vuId;
	}
	public String getVuNm() {
		return vuNm;
	}
	public void setVuNm(String vuNm) {
		this.vuNm = vuNm;
	}
	public String getVuFilePath() {
		return vuFilePath;
	}
	public void setVuFilePath(String vuFilePath) {
		this.vuFilePath = vuFilePath;
	}
	public Date getVuRegDt() {
		return vuRegDt;
	}
	public void setVuRegDt(Date vuRegDt) {
		this.vuRegDt = vuRegDt;
	}
	public String getVuNote() {
		return vuNote;
	}
	public void setVuNote(String vuNote) {
		this.vuNote = vuNote;
	}
	

}
