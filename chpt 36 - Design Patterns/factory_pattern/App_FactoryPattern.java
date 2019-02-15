package factory_pattern;

/**
 * 
 * The Factory pattern introduces weak coupling instead of tight coupling,
 * hiding concrete classes from the application
 * 
 * The application doesn't have need to know about the ConcretePerson classes.
 * The Application is simply returned a Object from the factory.
 * 
 * It provides customization hooks and the implementation comfortably
 * accommodates new changes.
 * 
 */

public class App_FactoryPattern {

	public static void main(String[] args) { 

		// Weak coupling
		
		Person person = PersonFactory.getPerson("BaseRun");
		person.run();

		person = PersonFactory.getPerson("LongRun");
		person.run();

		person = PersonFactory.getPerson("ProgressionRun");
		person.run();
		
		// Tight coupling
		
		ConcretePersonA person2 = new ConcretePersonA();
		person2.run();
	}
}
