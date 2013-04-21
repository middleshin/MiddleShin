package able.service.admin.dbm;

public class RoleMenuModel {
	Long roleMenuId;
	Long roleId;
	Long menuId;
	String roleMenuSeq;
	String roleMenuNote; 
	
	RoleModel roleModel; 
	MenuModel menuModel;
	
	public Long getRoleMenuId() {
		return roleMenuId;
	}
	public void setRoleMenuId(Long roleMenuId) {
		this.roleMenuId = roleMenuId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getRoleMenuSeq() {
		return roleMenuSeq;
	}
	public void setRoleMenuSeq(String roleMenuSeq) {
		this.roleMenuSeq = roleMenuSeq;
	}
	public String getRoleMenuNote() {
		return roleMenuNote;
	}
	public void setRoleMenuNote(String roleMenuNote) {
		this.roleMenuNote = roleMenuNote;
	}
	public RoleModel getRoleModel() {
		return roleModel;
	}
	public void setRoleModel(RoleModel roleModel) {
		this.roleModel = roleModel;
	}
	public MenuModel getMenuModel() {
		return menuModel;
	}
	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}
}
