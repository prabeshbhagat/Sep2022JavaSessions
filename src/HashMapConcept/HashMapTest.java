package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {

		//HashMap-->Key ,Value
		
		//HashMap<String, String> map= new HashMap<String, String>();
		
		Map<String, String> map= new HashMap<String, String>();
		//Map<String, String> map= new LinkedHashMap<String, String>();
		//Map<String, String> map= new TreeMap<String, String>();
	
		map.put("Tilak", "MI");
		map.put("Rinku", "KKR");
		map.put("Mukesh", "CSK");
		map.put("Mukesh", "DC");
		map.put("Riyan", "RR");
		map.put("Riyan", "RR");
		map.put(null, "LSG");
		//map.put("Aman", null);
		//map.put(null, "LSG");
		//map.put(null, "GT");
		//map.put(null, null);

		
//		System.out.println(map.get("Tilak"));//MI
//		System.out.println(map.get("test"));//null
//		System.out.println(map.get("Mukesh"));//DC latest value
//		System.out.println(map.get("Riyan"));//RR
//		System.out.println(map.get("Aman"));//RR
		//System.out.println(map.get(null));//RR
		
		//how to print all the values in Hasmap
		System.out.println(map);
		
	}

}
