package overlappingSubproblems;

public class FibonacciTabulation {

	//This method doesn't use recursion.
	
	public static void main(String[] args) {

		int n = 12;
		System.out.println(fib(n));

	}

	private static int fib(int n) {
		int f[]  = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		
		for(int i=2; i<=n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];
	}

}
