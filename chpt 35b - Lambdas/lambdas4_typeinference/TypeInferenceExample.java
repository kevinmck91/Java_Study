package lambdas4_typeinference;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		// The compiler figures details about lambda expression by checking the interface 
		// The input argument, the return type etc.
		StringLengthLambda myLambda_1 = (String s)  -> s.length();
		
		// The Lambda can see from the interface that it takes in a String. so String can be removed
		StringLengthLambda myLambda_2 = (s)  -> s.length();
		
		// If there is only one input argument, we only need to put in the argument. No parenthesis 
		StringLengthLambda myLambda_3 = s  -> s.length();

		System.out.println(myLambda_1.getLength("myLambda_1"));
		System.out.println(myLambda_2.getLength("myLambda_2"));
		System.out.println(myLambda_2.getLength("myLambda_3"));
		
		// Call a method that takes in the lambda as a parameter
		someRandomMethod(s  -> s.length());
		
	}
	
	// This method takes in a lambda expression and calls it with a string.
	public static void someRandomMethod(StringLengthLambda l) {
		System.out.println(l.getLength("myLambda_3"));
		
	}

	// Inner class (interface) // To make sure it stays functional, add the Annotation 
	@FunctionalInterface
	interface StringLengthLambda {
		int getLength(String s);
	}

}
