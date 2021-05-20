package comparable_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {


		List<Laptop> laptops = new ArrayList<>();
		
		laptops.add(new Laptop("Apple", 128, 1000, "C-"));
		laptops.add(new Laptop("Dell", 64, 2000, "A"));
		laptops.add(new Laptop("Asus", 512, 7000, "B+"));
		laptops.add(new Laptop("Zeus", 512, 7000, "A+"));
		laptops.add(new Laptop("Lenova", 32, 4000, "B-"));
		
		// As the Laptop class overrides the Comparable interface method, It will always sort by Ram
		Collections.sort(laptops);
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

	}

}
