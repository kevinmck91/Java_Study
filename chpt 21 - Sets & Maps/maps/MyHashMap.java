package maps;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		
		/*	HashMap is one of 3 maps that extends the Map interface
		 * 	Duplicates are not saved
		 * 	Order is not preserved and is random. 
		*/
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("kevin", 26);
		hashMap.put("paul", 26);
		hashMap.put("eoin", 27);
		hashMap.put("rich", 25);
		
		System.out.println(hashMap);

	}

}
