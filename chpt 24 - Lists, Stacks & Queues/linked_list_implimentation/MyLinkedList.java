package linked_list_implimentation;

import java.util.HashMap;
import java.util.Map;

public class MyLinkedList {

	// Head pointer at the First node !!
	private Node head;
	private int counter = 0;

	public void addToHead(int data) {

		// Create the new node to be appended
		Node newHeadnode = new Node(data);

		newHeadnode.setNext(head);

		head = newHeadnode;

		counter++;

	}

	public void deleteHead() {
		head = head.getNext();
		counter--;
	}

	public void addToTail(int data) {

		// If this is the first node, create the node
		if (head == null) {
			head = new Node(data);
			counter++;
		} else {

			// Otherwise traverse list and add node to the end

			// Create the new node to be appended
			Node newNode = new Node(data);

			// 'Current' is a node (node chain) starting at the longest possible (head)
			Node current = head;

			// If this is not the first node (node-chain) in the list..
			if (current != null) {

				// If the current node has a non-null 'next' (a sub-node chain)
				while (current.getNext() != null) {

					// Reset current as the next node (the sub-node chain)
					current = current.getNext();
				}

				// When we get to the end, add the new Node
				current.setNext(newNode);
			}
			counter++;
		}
	}

	public void addNodeInLocation(int data, int location) {

		if (location == 0) {
			addToHead(location);
		} else {

			// Create the new node to be appended
			Node newNode = new Node(data);

			/*
			 * Traverse the linked list until we have two nodes, either side of
			 * our position to be inserted
			 */

			Node current = head;
			Node postCurrent = head;

			for (int i = 0; i < location - 1; i++) {

				current = current.getNext();
				postCurrent = current.getNext();
			}

			/*
			 * Set the newNode as the 'next' for our left-hand node. Drill down
			 * one level to the newNode in order to set its 'next'. Set its
			 * 'next' as the remainder of the list
			 */

			current.setNext(newNode);
			current = current.getNext();
			current.setNext(postCurrent);

			counter++;

		}
	}

	public int getDataInLocation(int location) {

		if (location > getCounter()) {
			System.out.println("location out of bounds");
			return (Integer) null;
		} else {

			Node current = head;

			for (int i = 0; i < location; i++) {
				current = current.getNext();
			}

			return current.getData();

		}

	}

	public void removeFromLocation(int location) {

		/*
		 * Traverse down to the node before the node to be deleted Traverse down
		 * to the node after the node to be deleted Set the 'next' of the
		 * pre-delete node equal to the post delete
		 */

		if (location == 0) {
			deleteHead();
		} else {

			Node pre = head;

			for (int i = 0; i < location - 1; i++) {
				pre = pre.getNext();
			}

			Node post = head;

			for (int i = 0; i <= location; i++) {
				post = post.getNext();
			}

			/*
			 * System.out.println(pre.getData());
			 * System.out.println(post.getData());
			 */

			pre.setNext(post);
			counter--;
		}
	
	}

	public int getCounter() {
		return counter;
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node current = head;
			while (current != null) {
				output += "[" + current.getData() + "]";
				current = current.getNext();
			}

		}
		return output;
	}

	// Crack The Coding Interview Question
	public void removeDuplicates(){
		
		// Add contents of linked list to a hashmap
		Map<Integer, Integer> hashMap = new HashMap<>();
		Node current = head;
		
		while(current.getNext() != null){
			
			if(hashMap.containsKey(current.getData())){
				int value = hashMap.get(current.getData());
				value++;
				hashMap.put(current.getData(), value);
			} else {
			
				hashMap.put(current.getData(), 1);
				
			}
			
			current = current.getNext();
			
		}
		
					
			System.out.println("HashMap to string = " + hashMap.toString());
			
			// Delete from the linked list if
			int currentCounter = -1;
			
			current = head.getNext();
			Node pre = head;
			
			while(current.getNext() != null){
				
				currentCounter++;
				
				if(hashMap.get(current.getData()) > 1){
					
					int value = hashMap.get(current.getData());
					value--;
					hashMap.put(current.getData(), value);
					current = current.getNext();
					pre.setNext(current);

				}
				
				current = current.getNext();
				pre = pre.getNext();
			}	
		}
}
