package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingOverMaps {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "This is a String");
		hashMap.put(3, "This is a second String");
		hashMap.put(7, "This is a third String");
		hashMap.put(5, "This is a fourth String");
		
		System.out.println("HashMap : " + hashMap);				 
		System.out.println("KeySet : " + hashMap.keySet());		// Returns a Set view of the keys contained in this map. (unordered)
		System.out.println("ValueSet : " + hashMap.values());		// Returns a Collection view of the values contained in this map
		System.out.println("EntrySet : " + hashMap.entrySet());		// Returns a Set view of Entry objects ie. the mappings contained in this map

		
		
		/******** Looping through Map **********/
		
		// As hashmap is unordered - iteration is unordered
		
			System.out.println("\n Iteration over KeySet()");	
			for(Integer number : hashMap.keySet()) {
	
				System.out.println("Number : " 	+ number);
				System.out.println("Value : " 	+ hashMap.get(number));
	
			}
		
		// Given the value, we need to get the entrySet to access the corresponding key
			
			System.out.println("\n Iteration over .values()");
			for(String sentences : hashMap.values()) {
	
				System.out.println("Value : " 	+ sentences);
				
			}
			
		// hashMap.entrySet() returns a Set of all mappings (Entry objects)
			
			System.out.println("\n Iteration over Entrys");				
			for(Entry<Integer, String> myEntry : hashMap.entrySet()) {
	
				System.out.println("EntrySet : " 	+ myEntry);
				
			}
		
		// Another way to Iterate using the entrySet
			
			System.out.println("\n Iteration using Iterator Object");

			Iterator it = hashMap.entrySet().iterator();

			while (it.hasNext()) {
		    	Map.Entry pair = (Map.Entry)it.next();
		    	System.out.println("Map.Entry object : " + pair);
		    	it.remove(); // avoids a ConcurrentModificationException
		    }
			
		}
}
