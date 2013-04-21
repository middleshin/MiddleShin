package able.frame;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseMapper {
	
	String str = null; 
	
	public  String objectToJson(Object object)  {
		// object를 Json String으로 변환하여 리턴한다.  
		// json 함수를 사용한다. json으로 넘어온 오브젝트를 String으로 풀어서 사용한다.  
		ObjectMapper mapper = new ObjectMapper();

		try {
			//str = "{ \"json\": " + mapper.writeValueAsString(object)  + "}" ;
			str =  mapper.writeValueAsString(object) ; 
			// System.out.println(str); 
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} ;

		return str; 
 	}

	public JsonNode toJson(Object object)  {
		// 오브젝트를 JsonNode로 변환하여 리턴한다. 
		// json 함수를 사용한다. json으로 넘어온 오브젝트를 String으로 풀어서 사용한다.  
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.valueToTree(object); 

		try {
			//str = "{ \"json\": " + mapper.writeValueAsString(object)  + "}" ;
			str =  mapper.writeValueAsString(object) ; 
			// System.out.println(str); 
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} ;

		return root  ; 
 	}
}
