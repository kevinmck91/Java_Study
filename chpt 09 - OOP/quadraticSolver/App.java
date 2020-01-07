package quadraticSolver;

public class App {

	public static void main(String[] args) {
		
		double a = -3;
		double b = 5;
		double c = 3;
		
		Quadratic equation = new Quadratic(a, b, c);
		
		System.out.println(equation.getRoot1());
		System.out.println(equation.getRoot2());

	}

}
