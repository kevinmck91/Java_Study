package shapes;

/**
 * @author kmk
 * The cylinder is an extension of the Circle class. 
 * Hence when the cylinder object is created and the constructor run, the height is set (but radius has not been set)
 * The super() invokes the superclass constructor (ie setting the radius in the circle)
 * if super() is left out, the program calls the parent class constructor by default
 * The super(xyz) is only required when it calls a parent constructor that takes in an argument  
 * 	
 */
public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {
		super();
		height = 2.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);		// If this is not included, super() will be called by default which will set the wrong radius!
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String colour) {
		super(radius, colour);
		this.height = height;
	}
	
@Override	//The surface area of a cylinder uses the (surface) area of a circle in its calculator 
	public double surfaceArea(){
		System.out.println("override circle area method run");
		double area = (2 * 3.14 * getRadius() * height) + (2 * super.surfaceArea());
		return area;
	}

	public double volume(){
		double volume = super.surfaceArea()*height;
		return volume;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {      // in Cylinder class
	   return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}
	
}
