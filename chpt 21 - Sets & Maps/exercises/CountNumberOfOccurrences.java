package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountNumberOfOccurrences {

	public static void main(String[] args) {

	
		String text = "The quick brown fox jumped over the lazy sleeping dog";

		// Split the string into String array
		String[] textArray = new String[text.length()];
		textArray = text.toLowerCase().split("(?!^)");
		
		Map<String, Integer> treeMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < textArray.length; i++){
			
			// If treeMap doesnt contain the letter, add it with a value of 1
			if(!treeMap.containsKey(textArray[i]))
			{
				treeMap.put(textArray[i], 1);
				
			} 
			// If treeMap contains the letter, replace the value with its increment 
			else 
			{
				treeMap.replace(textArray[i], treeMap.get(textArray[i]), treeMap.get(textArray[i]) + 1 );
			}
			
			
		}
		
		System.out.println(treeMap);
				
	}

}
