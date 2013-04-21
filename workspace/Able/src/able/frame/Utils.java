package able.frame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class Utils {

	public java.sql.Date toDate(String strDate, String format) {
	
		// 값이 없으면 null을 리턴한다. 
		if(strDate.equals(null) || "".equals(strDate)){
			return null ; 
		}
		
		java.util.Date date = null; 
		java.sql.Date sqlDate = null;  
		SimpleDateFormat sdf = new SimpleDateFormat(format);

		try {
			date =  sdf.parse(strDate);
		} 
		catch (ParseException e) {
			e.printStackTrace();
			date = null;
		}	
	
		// sql.Date로 다시 변환해주어야 한다.
		sqlDate = new java.sql.Date(date.getTime());
		
		return sqlDate;  
	}

	public java.sql.Date toDate(String strDate) {
		
		String str = strDate; 
		
		// strDate에 format이 있는 경우 없애준다.(. & -) 
		// 특수문자는 아니겠지요. 
		str = str.trim(); // 공백이 있는 경우 없앤다.
		str = str.replaceAll("\\.", ""); // . 을 없앤다. 
		str = str.replaceAll("\\-", ""); // - 를 없앤다.
		str = str.replaceAll("\\_", ""); // _ 를 없앤다.(underbar)
		
		return toDate(str, "yyyyMMdd"); //월은 대문자로 표시해야 한다.  
	} 

	public Long toLong(String strLong){

		// 값이 없으면 null을 리턴한다. 
		if(strLong == null || "".equals(strLong)){
			return null ; 
		}

		return Long.parseLong(strLong); 
	}
	
	public HashMap<String, String> parmToHashMap(HttpServletRequest request){
		
		String key = null; 
		String[] value = null; 
		
		HashMap<String, String> arg = new HashMap<String, String>(); 

		// TODO request.getParameterMap(); 
		@SuppressWarnings("unchecked") //  이거 꼭 써야 되나? 다른방법은 없나? 
		Map<String, String[]> map = request.getParameterMap();
		Iterator<String> it = map.keySet().iterator(); 

		while(it.hasNext()){
			key=it.next();
			value=map.get(key);
			for(int i=0;i<value.length;i++){
				arg.put(key, value[i]); 
			}
		}
		return arg; 
	}
	
	public HashMap<String, String> parmToDBName(HttpServletRequest request){
		
		String key = null; 
		String[] value = null; 
		
		HashMap<String, String> arg = new HashMap<String, String>();
		
		// TODO request.getParameterMap(); Warning check 
		@SuppressWarnings("unchecked")
		Map<String, String[]> map = request.getParameterMap();
		Iterator<String> it = map.keySet().iterator(); 

		while(it.hasNext()){
			key=it.next();
			value=map.get(key);
			for(int i=0;i<value.length;i++){
				//arg.put(toDBName(key), value[i]); 
				arg.put(key.toLowerCase(), value[i]);
				System.out.println(key + ":" + value[i]); 
			}
		}
		return arg; 
	}

	public String toDBName(String var){
		// 웹변수를 받아 DB이름으로 변경한다. 
		// empLocName -> emp_Loc_Name -> emp_loc_name으로 변환 
		
		String dbName = ""; 
		char idx; 
		
		for(int i=0; i<var.length(); i++){
			idx = var.charAt(i);

			if( (int)idx >= 65 && (int)idx <= 90 ) {
				// 대문자이면 
				dbName = dbName + "_" ;
			}
			dbName = dbName + idx;
		}
		// System.out.println(dbName);
		return dbName.toLowerCase();  
	}
}

