package able.service.admin.dbm;

public class UsrRoleModel {
	Long usrRoleId ;
	Long usrId ;
	Long roleId ;
	String usrRoleSeq ;
	
	RoleModel roleModel;
	UsrModel usrModel;
	
	public Long getUsrRoleId() {
		return usrRoleId;
	}
	public void setUsrRoleId(Long usrRoleId) {
		this.usrRoleId = usrRoleId;
	}
	public Long getUsrId() {
		return usrId;
	}
	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getUsrRoleSeq() {
		return usrRoleSeq;
	}
	public void setUsrRoleSeq(String usrRoleSeq) {
		this.usrRoleSeq = usrRoleSeq;
	}
	public RoleModel getRoleModel() {
		return roleModel;
	}
	public void setRoleModel(RoleModel roleModel) {
		this.roleModel = roleModel;
	}
	public UsrModel getUsrModel() {
		return usrModel;
	}
	public void setUsrModel(UsrModel usrModel) {
		this.usrModel = usrModel;
	}
	
}
