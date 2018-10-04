package coffeeMachine;

public class Configuration {

	private double quantityCoffee;
	private double quantityWater;

	public Configuration(double quantityCoffee, double quantityWater) {
		this.quantityCoffee = quantityCoffee;
		this.quantityWater = quantityWater;
		System.out.println("water and coffee quantity set");
	}

	public double getQuantityCoffee() {
		return quantityCoffee;
	}

	public double getQuantityWater() {
		return quantityWater;
	}

}
