package able.service.admin.dbm;

import java.sql.Date;

public class RoleModel {

	Long 	roleId;
	String 	roleNm;
	Date	roleRegDt; 
	String 	roleNote;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleNm() {
		return roleNm;
	}
	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}
	public Date getRoleRegDt() {
		return roleRegDt;
	}
	public void setRoleRegDt(Date roleRegDt) {
		this.roleRegDt = roleRegDt;
	}
	public String getRoleNote() {
		return roleNote;
	}
	public void setRoleNote(String roleNote) {
		this.roleNote = roleNote;
	}
	
}
