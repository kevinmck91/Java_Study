package lambdas3_example;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.preform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		// This is a instance of a class that implements the Greeting interface
		// This is not required any more. We can use a Lambda or an Anonymous inner class that implements Greeting
		Greeting greetingClass = new HelloWorldGreeting();
		
		// This is a replacement for the Greeting interface and the HelloWorldGreeting implementation
		// A lambda on its own, does not have a unique have a a type,  Therefore we reuse Interfaces concept to use lambdas
		// The interface must contain a method with the same signature as the lambda signature & it must be a functional interface
		// We can create 100 different interfaces and 100 different Lambda expressions
		// This is a Lambda expression of type: Greeting interface
		Greeting greetingLambda = () -> System.out.println("Hello from the Lambda");

		
		// This is an Anonymous inner class. very similar to a lambda
		// Both are more or less implementing the Interface
		Greeting greetingInnerClass = new Greeting() {
			public void preform() {
				System.out.println("Hello from the Inner class");
			}
		};
		
		// All three can be passed to the Method 
		greeter.greet(greetingClass);
		greeter.greet(greetingLambda);
		greeter.greet(greetingInnerClass);
		
		
		// We can also print out the result of the lambda directly
		System.out.println(greetingLambda);
		
		// Or better yet, define it in the argument 
		greeter.greet( () -> System.out.println("Hello from the Lambda") );

	}

}