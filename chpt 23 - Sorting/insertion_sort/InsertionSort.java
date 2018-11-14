package insertion_sort;

public class InsertionSort {

	public static void insertionSort(int[] array) {
	
		for (int i = 1; i < array.length; i++) {

			for (int k = i; k >= 0; k--) {
				
				if (k > 0 && array[k] < array[k - 1]) {
					
					int temp = array[k];
					array[k] = array[k - 1];
					array[k - 1] = temp;

				}
			}
		}
	}
}
