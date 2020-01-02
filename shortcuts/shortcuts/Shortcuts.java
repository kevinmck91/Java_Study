package shortcuts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Queue; 

public class Shortcutes {

	public static void main(String[] args) {


// ************* Arrays *************/
		
		// import java.util.ArrayList;
		int[] intArray0;
		int[] intArray1 = new int[10];
		int[] intArray2 = {1,2,3,4,5,6,7};
		int[] intArray3 = new int[]{1, 2, 3};
		
		String[] stringArray1 = new String[3];
		String[] stringArray2 = {"a", "b", "c"};
		String[] stringArray3 = new String[]{"a", "b", "c"};
		
		String[] stringArray4;
		stringArray4 = new String[]{"a", "b", "c"};
		
		
		
// ***************** LinkedList *************/
		
		LinkedList<Integer> linkList1 = new LinkedList();
		
		
		
// ***************** ArrayList *************/
		
		ArrayList<String> arrayList1 = new ArrayList();	
		

		
// ***************** Sets *************/
		
		// import java.util.Set; 
		// import java.util.HashSet;
		// import java.util.LinkedHashSet;
		
		Set<String> hashSet1 = new HashSet<>();
		Set<String> linkedHashSet1 = new LinkedHashSet<>();
		Set<String> treeSet1 = new TreeSet<>();
		
		
// ***************** Maps *************/
		
		// import java.util.Map; 
		// import java.util.HashMap;
		// import java.util.LinkedHashMap;
		
		Set<String> hashMap1 = new HashSet<>();
		Set<String> linkedHashMap1 = new LinkedHashSet<>();
		Set<String> treeMap1 = new TreeSet<>();

		
		
// ***************** Queue *************/
		
		Queue queue1 = new PriorityQueue();
		
// ***************** Collections *************/
		
		Collections.sort(linkList1);
		Collections.reverse(linkList1);
		Collections.rotate(linkList1, 5);
		Collections.swap(linkList1, 3, 5);

		
// ***************** For *************/
		
		for (int i = 0; i < stringArray1.length; i++) {	
		}
		
		for (String string : treeMap1) {
		}

		
// ***************** Switch *************/
		
		switch (1) {
		
		case 1:
			// do something
			break;
		case 3:
			// do something different
			break;
		case 7:
			// do something different
			break;
		default:
			break;
		}

	
	}



}
