package bubble_sort;

public class App {

	public static void main(String[] args) {

		// Bubble Sort

		int[] array1 = {14,2,6,5,2,4,6,8,5,6,7,8,9,8,7,6,5,4,3,2,3,4,56,4,3,4,5,4,3,4,5,4,4,3,3,4,4,5,5,4,4,5,6,7,8,7,7,7,7,6,5,4};

		array1 = new Bubble_Sort().sortArrayMethod1(array1);
		
		for (int i : array1) {
			System.out.print(i + ",");
		}
		System.out.println("");
		
		
		int[] array2 = {14,2,6,5,2,4,6,8,5,6,7,8,9,8,7,6,5,4,3,2,3,4,56,4,3,4,5,4,3,4,5,4,4,3,3,4,4,5,5,4,4,5,6,7,8,7,7,7,7,6,5,4};

		array2 = new Bubble_Sort().sortArrayMethod2(array2);
		
		for (int i : array2) {
			System.out.print(i + ",");
		}
		System.out.println("");
		
	}

}
