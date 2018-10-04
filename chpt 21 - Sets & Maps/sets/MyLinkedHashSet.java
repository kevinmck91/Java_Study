package sets;

public class MyLinkedHashSet {
	
	public static void main(String[] args) {
		
		java.util.Set<String> set1 = new java.util.LinkedHashSet<>();
		
		/*	LinkedHashSet is one of 3 sets that extends the Set interface
		 * 	Duplicates are not saved
		 * 	LinkedHashSet is the ordered version of the HashSet ordered by method of insertion
		*/
		
		set1.add("0");
		set1.add("7");
		set1.add("2");
		set1.add("8");
		set1.add("3");
		set1.add("5");
		
		System.out.println(set1);
		
	}
	

}
