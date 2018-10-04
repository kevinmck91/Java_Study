package linked_list_implimentation;

public class TestApp {

	public static void main(String[] args) {
		
		/* The linked list is a recursive set of objects stored within objects.
		 * 'Head' is the first node therefore it is the largest object (longest chain of objects within objects)
		 * 'Current' is an inclusive subset of 'Head' ie. A chain from any given node to the end of the chain 
		 * 
		 */

		MyLinkedList myLinkedList = new MyLinkedList();
		
		System.out.println(myLinkedList.toString());
		
	// 	TEST METHOD TO ADD ITEMS TO END THE LINKED LIST
		
		myLinkedList.addToTail(2);
		myLinkedList.addToTail(1);
		myLinkedList.addToTail(6);
		myLinkedList.addToTail(8);
		myLinkedList.addToTail(1);
		myLinkedList.addToTail(5);
		myLinkedList.addToTail(7);
		myLinkedList.addToTail(1);
		
		System.out.println(myLinkedList.toString());
	
	//	 TEST METHOD TO ADD ITEMS TO BEGINNING THE LINKED LIST
		
		myLinkedList.addToHead(11);
		myLinkedList.addToHead(16);
		myLinkedList.addToHead(1);
		
		System.out.println(myLinkedList.toString());
		
	//	 TEST METHOD TO REMOVE ITEMS FROM THE LINKED LIST
		
		myLinkedList.removeFromLocation(0);
		myLinkedList.removeFromLocation(5);
		myLinkedList.removeFromLocation(7);
		
		System.out.println(myLinkedList.toString());
		
	//	 TEST METHOD TO ADD ITEMS TO SPECIFIC INDEX IN THE LINKED LIST
		
		myLinkedList.addNodeInLocation(21, 0);
		myLinkedList.addNodeInLocation(21, 3);
		myLinkedList.addNodeInLocation(21, 6);
		
		System.out.println(myLinkedList.toString()); 
	
	//	 TEST SIZE OF THE LINKED LIST
		
		System.out.println("size : " + myLinkedList.getCounter());
		
	//	 TEST GETTING AN INDEX FROM THE LINKED LIST
		
		System.out.println(("Value at index 6 : " + myLinkedList.getDataInLocation(6)));
		
		System.out.println("end");
	
	//	 TEST REMOVING DUPLICATES FROM THE LINKED LIST	
	
		MyLinkedList myLinkedList2 = new MyLinkedList();
		
		myLinkedList2.addToTail(1);
		myLinkedList2.addToTail(1);
		myLinkedList2.addToTail(2);
		myLinkedList2.addToTail(2);
		myLinkedList2.addToTail(3);
		myLinkedList2.addToTail(3);
		myLinkedList2.addToTail(4);
		myLinkedList2.addToTail(4);
		
	// Not Yet finished
		myLinkedList2.removeDuplicates();
		
		System.out.println(myLinkedList2.toString());
		
	}

}
