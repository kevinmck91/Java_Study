package personalised_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class EditedArrayList extends ArrayList {

	public void sortAndPrint() {

		for (int i = 0; i < 5; i++) {
			this.set(i, i);
		}

		System.out.println(this);

	}
}
