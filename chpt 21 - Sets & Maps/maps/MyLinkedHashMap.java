package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
	
	public static void main(String[] args) {
		
		/*	LinkedHashMap is one of 3 maps that extends the Map interface
		 * 	Duplicates are not saved
		 *	The ordered version of the HashSet ordered by method of insertion
		*/
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("kevin", 26);
		linkedHashMap.put("paul", 26);
		linkedHashMap.put("eoin", 27);
		linkedHashMap.put("rich", 25);
		linkedHashMap.put("alan", 30);
		
		System.out.println(linkedHashMap);
		
	}

}
