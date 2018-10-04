package composition2;

 
// unfinished 
// https://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-2.3

public class myCircle {

	private MyPoint center;
	private double radius;

	public myCircle() {
		center = new MyPoint(0, 0);
		this.radius = 1;
	}

	public myCircle(int x, int y, double radius) {
		center = new MyPoint(x, y);
		this.radius = radius;
	}

	public myCircle(MyPoint center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double getRadius(){
		return radius;		
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
}
