package quadraticSolver;

public class Quadratic {
	
	private double a;
	private double b;
	private double c;
	private double determinant;
	
	// Constructors
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		determinant = (getB()*getB()) - ((4)*getA()*getC());
		if(determinant < 0 )
			System.out.println("Error : determinant < 0");
	}

	// Methods
	public double getRoot1() {
		double root1 = (-(getB()) + Math.sqrt(getDeterminant()))/(2*getA());
		return root1;
	}
	public double getRoot2()  {
		double root2 = (-(getB()) - Math.sqrt(getDeterminant()))/(2*getA());
		return root2;
	}

	// Getters setters
	private double getA() {
		return a;
	}
	private double getB() {
		return b;
	}
	private double getC() {
		return c;
	}
	private double getDeterminant() {
		return determinant;
	}

	

}
