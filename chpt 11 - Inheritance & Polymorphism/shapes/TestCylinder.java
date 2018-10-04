package shapes;

/**
 * @author kmk
 * https://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-4.1
 */
public class TestCylinder {

	public static void main(String[] args) {

		Circle C2 = new Circle();

		System.out.println("Circle:" + " radius=" + C2.getRadius() + " base area=" + C2.surfaceArea());
		
		
		Cylinder c1 = new Cylinder();
		
		System.out.println("Cylinder:" + " radius=" + c1.getRadius() + " height=" + c1.getHeight() + " area=" + c1.surfaceArea() + " volume=" + c1.volume());
		
		System.out.println(c1.toString());

	}

}
