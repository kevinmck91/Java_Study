package coffeeMachine;

import java.util.Map;

public class BasicCoffeeMachine extends AbstractCoffeeMachine {

	protected Map<CoffeeSelection, CoffeeBean> beans;
	
	protected Grinder grinder;
	
	protected BrewingUnit brewingUnit;

	public BasicCoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
		super();
		System.out.println("Coffee Machine created");
		this.beans = beans;
		this.grinder = new Grinder();
		this.brewingUnit = new BrewingUnit();
		
		this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
		System.out.println("Coffee configuration and type set");
		
	}
	
	public Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException {
		switch (selection) {
			case FILTER_COFFEE:
				return brewFilterCoffee();
							
			default:
				throw new CoffeeException("CoffeeSelection ["+selection+"] not supported!");
		}
	}

	private Coffee brewFilterCoffee() {
		Configuration config = configMap.get(CoffeeSelection.FILTER_COFFEE);
		
		// grind the coffee beans
		GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(CoffeeSelection.FILTER_COFFEE), config.getQuantityCoffee());
		
		// brew a filter coffee
		return this.brewingUnit.brew(CoffeeSelection.FILTER_COFFEE, groundCoffee, config.getQuantityWater());
	}
	
	public void addBeans(CoffeeSelection sel, CoffeeBean newBeans) throws CoffeeException {
		CoffeeBean existingBeans = this.beans.get(sel);
		if (existingBeans != null) {
			if (existingBeans.getName().equals(newBeans.getName())) {
				existingBeans.setQuantity(existingBeans.getQuantity() + newBeans.getQuantity());
			} else {
				throw new CoffeeException("Only one kind of beans supported for each CoffeeSelection.");
			}
		} else {
			this.beans.put(sel, newBeans);
		}
	}
}
