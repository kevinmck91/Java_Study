package linked_list_implimentation;

public class TestApp2 {

	public static void main(String[] args) {
		
		/* The linked list is a recursive set of objects stored within objects.
		 * 'Head' is the first node therefore it is the largest object (longest chain of objects within objects)
		 * 'Current' is an inclusive subset of 'Head' ie. A chain from any given node to the end of the chain 
		 * 
		 */

		MyLinkedList myLinkedList = new MyLinkedList();
		
		System.out.println(myLinkedList.toString());
		
	// 	TEST METHOD TO ADD ITEMS TO END THE LINKED LIST
		
		myLinkedList.addToTail(1);
		myLinkedList.addToTail(2);
		myLinkedList.addToTail(3);
		myLinkedList.addToTail(4);
		myLinkedList.addToTail(5);
		myLinkedList.addToTail(6);
		myLinkedList.addToTail(7);
		myLinkedList.addToTail(8);
		
		System.out.println(myLinkedList.toString());
	
	//	 TEST METHOD TO ADD ITEMS TO BEGINNING THE LINKED LIST
		
		myLinkedList.addToHead(0);
		myLinkedList.addToHead(0);
		myLinkedList.addToHead(0);
		
		System.out.println(myLinkedList.toString());
		
	//	 TEST METHOD TO REMOVE ITEMS FROM THE LINKED LIST
		
		myLinkedList.removeFromLocation(0);
		myLinkedList.removeFromLocation(0);
		myLinkedList.removeFromLocation(0);
		
		System.out.println(myLinkedList.toString());
		
	//	 TEST METHOD TO ADD ITEMS TO SPECIFIC INDEX IN THE LINKED LIST
		
		//myLinkedList.addNodeInLocation(21, 0);
		myLinkedList.addNodeInLocation(21, 3);
		myLinkedList.addNodeInLocation(21, 6);
		
		System.out.println(myLinkedList.toString()); 

	
	}
}
