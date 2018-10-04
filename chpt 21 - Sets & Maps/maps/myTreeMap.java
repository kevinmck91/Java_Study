package maps;

import java.util.Map;
import java.util.TreeMap;


public class myTreeMap {

	public static void main(String[] args) {

		/*	TreeMap is one of 3 maps that extends the Map interface
		 * 	Duplicates are not saved
		 * 	Order is preserved by default
		*/
		
		
		// Example 1
		
		Map<String, Integer> treeMap0 = new TreeMap<>();
		
		treeMap0.put("kevin", 26);
		treeMap0.put("paul", 26);
		treeMap0.put("eoin", 27);
		treeMap0.put("rich", 25);
		treeMap0.put("alan", 30);
		
		System.out.println(treeMap0);
		
	}

}
