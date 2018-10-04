package quadraticSolver;

public class App {

	public static void main(String[] args) {
		
		double a = 17;
		double b = -31;
		double c = 5;
		
		Quadratic equation = new Quadratic(a, b, c);
		
		System.out.println(equation.getRoot1());
		System.out.println(equation.getRoot2());

	}

}
