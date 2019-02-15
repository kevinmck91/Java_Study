package factory_pattern;

/**
 * Any Person that the factory returns must implement this Java interface. We’ll
 * just specify that any class that calls itself a Person must implement a run
 * method.
 * 
 * The factory must be used for a family of objects. If the classes doesn't
 * extend a common base class or interface, they cannot be used in a factory
 * design template.
 *
 */

public interface Person {

	public void run();

}
