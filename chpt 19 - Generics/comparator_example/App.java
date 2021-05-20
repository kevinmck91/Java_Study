package comparator_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Laptop> laptops = new ArrayList<>();

		laptops.add(new Laptop("Apple", 128, 1000, "C-"));
		laptops.add(new Laptop("Dell", 64, 2000, "A-"));
		laptops.add(new Laptop("Asus", 512, 7000, "B+"));
		laptops.add(new Laptop("Zeus", 512, 7000, "A+"));
		laptops.add(new Laptop("Lenova", 32, 4000, "B-"));

		// This time we define an anonymous inner class that implements the compare
		// method
		// Pass this to the collections .sort in order to sort the field we want
		// This could also be done using a lambda (in which case you would use the compareTo as a wrapper)
		Comparator<Laptop> com1 = new Comparator<Laptop>() {

			public int compare(Laptop o1, Laptop o2) {

				if (o1.getPrice() > o2.getPrice())
					return 1;
				else
					return -1;

			}
		};

		Collections.sort(laptops, com1);

		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

		
		System.out.println("\n\n");
		
		

		// A different Comparator for rating
		Comparator<Laptop> com2 = new Comparator<Laptop>() {

			public int compare(Laptop o1, Laptop o2) {
				
				return o1.getRating().compareTo(o2.getRating());

			}
		};

		Collections.sort(laptops, com2);

		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

	}

}
