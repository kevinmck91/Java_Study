package bubble_sort;

public class Bubble_Sort {

	private int[] array;

	/*********** Attempt1 - Inefficient Method *************/
	
	public int[] sortArrayMethod1(int[] array) {

		this.array = array;

		boolean sorted = false;

		while (sorted != true) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(i);
					sorted = false;
					break;
				}
				sorted = true;
			}
		}
		return this.array;

	}
	
	/*********** Attempt2 - Correct Efficient Method *************/
	
	public int[] sortArrayMethod2(int[] array) {

		this.array = array;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(j);
				}
			}
		}

		return this.array;

	}

	/*********** Swap Two Array Elements *************/
	
	private void swap(int i) {
		int temp = array[i + 1];
		array[i + 1] = array[i];
		array[i] = temp;
	}
}
