package lambdas3_example;

public class HelloWorldGreeting implements Greeting {

	// This class is an implementation of the Greeting interface
	// We can create other implementations of the Greeting interface
	// Then, we can pass any behavoir we like to the greet method in the class
	
	@Override
	public void preform() {
		
		System.out.println("Hello from the Class");
		
	}
	
}
