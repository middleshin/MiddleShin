package able.service.admin.dbm;

public class RoleVuModel {
	Long roleVuId;
	Long roleSvcId;
	Long vuId;
	String roleVuSeq; 
	
	RoleModel roleModel; 
	RoleMenuModel roleSvcModel;
	
	public Long getRoleVuId() {
		return roleVuId;
	}
	public void setRoleVuId(Long roleVuId) {
		this.roleVuId = roleVuId;
	}
	public Long getRoleSvcId() {
		return roleSvcId;
	}
	public void setRoleSvcId(Long roleSvcId) {
		this.roleSvcId = roleSvcId;
	}
	public Long getVuId() {
		return vuId;
	}
	public void setVuId(Long vuId) {
		this.vuId = vuId;
	}
	public String getRoleVuSeq() {
		return roleVuSeq;
	}
	public void setRoleVuSeq(String roleVuSeq) {
		this.roleVuSeq = roleVuSeq;
	}
	public RoleModel getRoleModel() {
		return roleModel;
	}
	public void setRoleModel(RoleModel roleModel) {
		this.roleModel = roleModel;
	}
	public RoleMenuModel getRoleSvcModel() {
		return roleSvcModel;
	}
	public void setRoleSvcModel(RoleMenuModel roleSvcModel) {
		this.roleSvcModel = roleSvcModel;
	}
	
}
