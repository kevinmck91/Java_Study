package lambdas2_basic;

// *********  Interfaces *********

interface myStringPrint {
	//Create a method that has the same signature of the lambda we are trying to write
	// Name does not matter
	void foo();
}

interface myAdd {
	//Create a method that has the same signature of the lambda we are trying to write
	int addDemUp(int x, int y);
}

// *********  Classes  *********

public class MyTestClass {

	public static void main(String[] args) {
		
		MyTestClass tc = new MyTestClass();
		
		// A lambda on its own, does not have a unique have a a type,  Therefore we reuse Interfaces concept to use lambdas
		// Instead of creating an object that implements the interface,  we created a lambda
		// The interface must contain a method with the same signature as the lambda signature & it must be a functional interface
		// We can create 100 different interfaces and 100 different Lambda expressions
		// We can then pass the Lambda to our method (where as in OOP, we would be passing an object to our method)
		// Because we are not dependent on an OOP object, the lambda is not tied to any object 
		// This is a Lambda expression of type: myStringPrint interface
		
		myStringPrint myLambdaFunction = () -> System.out.println("Hello from myLambdaFunction");
		tc.doSomething(myLambdaFunction);
		myLambdaFunction.foo();
		
		myAdd addFunction = (int a, int b) -> a + b;
		tc.doSomething(myLambdaFunction);
		addFunction.addDemUp(4, 2);
	}
	
	
	// These two method take in an object that is implementing the interfaces myStringPrint or myAdd
	public void doSomething(myStringPrint interfaceParameter) {
		interfaceParameter.foo();
	}
	
	public void doSomething(myAdd interfaceParameter) {
		int x = interfaceParameter.addDemUp(5, 8);
		System.out.println(x);
	}
	

}


