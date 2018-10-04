package stack_implementation;

import java.util.LinkedList;

public class Stack {

	private LinkedList<Integer> linkedList = new LinkedList<Integer>();

	public void push(int number) {
		linkedList.add(number);
	}

	public void pop() {
		linkedList.removeLast();
	}

	public void peek() {
		System.out.println(linkedList.getLast());
	}
	
	public void print() {
		System.out.println(linkedList.toString());
	}

}
