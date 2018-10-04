package polymorphism_basic;

public class Tree extends Plant{

	@Override
	public void grow() {
	System.out.println("tree growing");
	}
	
	public void shedLeaves() {
		System.out.println("leaves falling");
		}
	

}
