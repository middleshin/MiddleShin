package able.frame;

import java.util.List;

public class ServiceResult {

	int code; 
	String message;
	Object data;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	} 

	public void setResult(int code, String message, List<Object> data) {
		this.code = code;
		this.message = message;
		this.data = data;
	} 

	public void setResult(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	} 

}
