package stack_implementation;

public class App {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		
		myStack.push(6);
		myStack.push(3);
		myStack.push(7);
		myStack.push(1);
		
		myStack.peek();
		
		myStack.pop();
		myStack.pop();
		
		myStack.peek();
		
		myStack.print();
		
		
	}
	
}
