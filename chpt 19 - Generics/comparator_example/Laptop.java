package comparator_example;

// Unlike in the comparable example, assume that this class is in a library and cant be changed
// In order to make this object sortable in the class where it will be used,
// Implement the Comparator in the application
//

public class Laptop {
	
	private String 	brand;	
	private int 	ram;	
	private int 	price;	
	private String 	rating;
	
	
	public Laptop(String brand, int ram, int price, String rating) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.rating = rating;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + ", rating=" + rating + "]";
	}


}
