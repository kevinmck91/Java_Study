package sets;


import java.util.*;


public class MyHashSet {

	public static void main(String[] args) {
		
		/*	HashSet is one of 3 sets that extends the Set interface
		 * 	Duplicates are not saved
		 * 	Order is not preserved and is random 
		*/
		
		java.util.Set<String> set1 = new java.util.HashSet<>();
		
		set1.add("0");
		set1.add("7");
		set1.add("2");
		set1.add("8");
		set1.add("3");
		set1.add("3");
		set1.add("1");
		set1.add("5");

		System.out.println(set1);
		
		set1.clear();
	}

}
