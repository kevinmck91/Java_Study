package lambdas1_oop;

public class Greeter {

	// Originally,  the greet method would have static code to output text
	// Instead, The method takes in a class that is implementing an interface, where the class/interface combo defines the text  
	// This way, we can pass any class that implements the interface to this method and have dynamic output
	// We can be certain that the class we pass has the preform() method as set down by the interface 

	public void greet(Greeting greeting) {
		greeting.preform();
	}
	
	public static void main(String[] args) {
		
		// Create the object. The object Implements the Greeting interface 
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

		// Create an instance of the current object
		Greeter greeter = new Greeter();
		
		// Pass the object to the greet method of the current object 
		greeter.greet(helloWorldGreeting);
	

	}

}
