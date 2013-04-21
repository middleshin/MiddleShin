package able.service.admin.dbm;

import java.sql.Date;

public class MenuModel {
	Long menuId;
	String menuNm;
	Date menuRegDt;
	String menuSeq; 
	String menuNote;
	
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
	public Date getMenuRegDt() {
		return menuRegDt;
	}
	public void setMenuRegDt(Date menuRegDt) {
		this.menuRegDt = menuRegDt;
	}
	public String getMenuSeq() {
		return menuSeq;
	}
	public void setMenuSeq(String menuSeq) {
		this.menuSeq = menuSeq;
	}
	public String getMenuNote() {
		return menuNote;
	}
	public void setMenuNote(String svcNote) {
		this.menuNote = svcNote;
	}


}
