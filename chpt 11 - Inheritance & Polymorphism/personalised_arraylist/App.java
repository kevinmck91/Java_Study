package personalised_arraylist;

public class App {

	public static void main(String[] args) {

		EditedArrayList myList = new EditedArrayList();

		myList.add(4);
		myList.add(2);
		myList.add(3);
		myList.add(1);
		myList.add(9);
		System.out.println(myList);
		myList.sortAndPrint();

	}
}
