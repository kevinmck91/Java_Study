package overlappingSubproblems;

public class FibonacciRecursive {
	
	static int count = 0;

	public static void main(String[] args) {

		int n = 12;
		
		System.out.println(fib(n));
		
	}
	
	public static int fib(int n) {
		
		count++;
		System.out.println("Computing number " + n + ". method has been called " + count + " times");
		
		if(n<=1)
			return 1;
		return fib(n-1) + fib(n-2);
		
	}

}
