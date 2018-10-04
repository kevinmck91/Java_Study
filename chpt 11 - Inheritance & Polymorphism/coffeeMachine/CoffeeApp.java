package coffeeMachine;

import java.util.HashMap;
import java.util.Map;

public class CoffeeApp {
	public static void main(String[] args) {
		
		/* Create a Map of available coffee beans 
		 * Each slot is made up of a Selection and a bean object
		 * there are three available coffee types  
		
		*/
		
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean(
				"My favorite espresso bean", 1000));
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean(
				"My favorite filter coffee bean", 1000));
		beans.put(CoffeeSelection.CAPPUCCINO, new CoffeeBean(
				"My CAPPUCCINO bean", 1000));
		System.out.println("Coffee bean hash map created");

		// get a new CoffeeMachine object and pass the hash map into it
		//BasicCoffeeMachine machine = new BasicCoffeeMachine(beans);
		  PremiumCoffeeMachine machine = new PremiumCoffeeMachine(beans);
		

		// brew a fresh coffee
		try {
			Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);
			System.out.println("Coffee is ready!");
		} catch (CoffeeException e) {
			e.printStackTrace();
		}
	} // end main
} // end CoffeeApp
