package overlappingSubproblems;

public class FibonacciMemoization {

	static int[] lookup = new int[100];
	static int nil = -1;
	static int count = 0;

	public static void main(String[] args) {
		
		for (int i = 0; i < lookup.length; i++) {
			lookup[i] = nil;
		}
		
		int n = 12;
		
		System.out.println(fib(n));
		
		
	}
	
	static int fib(int n) {
		
		count++;
		System.out.println("Computing number " + n + ". method has been called " + count + " times");
		
		if(lookup[n] == nil) {

			if(n<=1) {
				lookup[n] = n;
			} else {
				System.out.println("Adding " + n + " to lookup table" );
				lookup[n] = fib(n-1) + fib(n-2);
			}

		}
		
		System.out.println("taking " + n + " from lookup table" );
		return lookup[n];
	}
	

	

}
