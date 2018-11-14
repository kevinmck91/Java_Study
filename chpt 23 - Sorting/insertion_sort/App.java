package insertion_sort;

public class App {

	public static void main(String[] args) {

		// Not Complete
		
		int[] array = {14,2,6,5,2,4,6,8,5,6,7,8,9,8,7,6,5,4,3,2,3,4,56,4,3,4,5,4,3,4,5,4,4,3,3,4,4,5,5,4,4,5,6,7,8,7,7,7,7,6,5,4};
		
		
		System.out.println(array.length);
		
		InsertionSort.insertionSort(array);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
