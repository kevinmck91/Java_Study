package sets;

import java.util.*;

public class MyTreeSet {

	public static void main(String[] args) {

		/*	TreeSet is one of 3 sets that extends the Set interface
		 * 	Duplicates are not saved
		 * 	Order is sorted by default as data is stored in a tree
		*/
		
		TreeSet<String> set1 = new TreeSet<>();
		
		set1.add("0");
		set1.add("7");
		set1.add("2");
		set1.add("8");
		set1.add("3");
		set1.add("5");

		System.out.println(set1);
		
		set1.higher("2");
		
		
		
		// Example 2
		
		String[] myStrArray = { "a", "b", "c" };
		String[] myStrArray2 = { "c", "a", "b" };
		
		if(myStrArray.length != myStrArray2.length){
			System.out.println("Arrays Dont Match");
		} else {
			Set<String> treeMap1 = new TreeSet<>();
			Set<String> treeMap2 = new TreeSet<>();
			
			for(int i = 0; i < myStrArray.length; i++){
				treeMap1.add(myStrArray[i]);
			}
			
			for(int i = 0; i < myStrArray2.length; i++){
				treeMap2.add(myStrArray2[i]);
			}
			
			if(treeMap1.equals(treeMap2)){
				System.out.println("Arrays Match");
			} else {
				System.out.println("Arrays Dont Match");
			}
		}
		
		
	}

}
