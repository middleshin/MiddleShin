package able.service.admin.dbm;

public class ContrSvcModel {

	Long contrSvcId ;
	Long contrId ;
	Long svcId ;

	ContrModel contrModel;
	MenuModel svcModel;
	
	public Long getContrSvcId() {
		return contrSvcId;
	}

	public void setContrSvcId(Long contrSvcId) {
		this.contrSvcId = contrSvcId;
	}
	
	public Long getContrId() {
		return contrId;
	}
	public void setContrId(Long contrId) {
		this.contrId = contrId;
	}
	public Long getSvcId() {
		return svcId;
	}
	public void setSvcId(Long svcId) {
		this.svcId = svcId;
	}
	public ContrModel getContrModel() {
		return contrModel;
	}
	public void setContrModel(ContrModel contrModel) {
		this.contrModel = contrModel;
	}
	public MenuModel getSvcModel() {
		return svcModel;
	}
	public void setSvcModel(MenuModel svcModel) {
		this.svcModel = svcModel;
	}  
}
