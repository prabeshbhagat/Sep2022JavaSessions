package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EcommLogin {
	
	
	//product map
	//<String, Integer>
	
	// in javaw if we user pipe | we have to use excape charatcer before that //
	//user,seller,cat manager,vendor,dist ,customer
	public static String getUserCreds(String role) {
		Map<String ,String> map =new HashMap<String,String>();
		map.put("user", "user@gmail.com|user123");
		map.put("catManager", "catManager@gmail.com|catManager123");
		map.put("vendor", "vendor@gmail.com|vendor123");
		map.put("partner", "partner@gmail.com|user123");
		map.put("admin", "admin@gmail.com|user123");
		
		return map.get(role);
	}
	
	public static String getUsername(String role) {
		String un=getUserCreds(role);
		return un.split("\\|")[0];
	}
	
	public static String getPassword(String role) {
		String un=getUserCreds(role);
		String[] creds= un.split("\\|");
		return creds[1];
	}
	
	

	public static void main(String[] args) {
		String creds=getUserCreds("user");
		System.out.println(creds);
		
		String un=getUsername("vendor");
		String pwd=getPassword("vendor");
		
		System.out.println(" UN :"+un+" pwd :"+pwd);
	}

}
