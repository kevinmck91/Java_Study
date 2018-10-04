package shapes;

public class Circle {
	
	private double radius = 1.0;
	private String colour = "red";
	
	public Circle() {
		this.radius = radius;
		this.colour = colour;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.colour = colour;
	}

	public Circle(double radius, String colour) {
		this.radius = radius;
		this.colour = colour;
	}
	
	public double surfaceArea(){
		System.out.println("Circle area method run");
		double area = (3.14 * getRadius() * getRadius());
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	

}
