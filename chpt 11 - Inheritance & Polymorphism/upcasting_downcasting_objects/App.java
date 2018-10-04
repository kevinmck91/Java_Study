package upcasting_downcasting_objects;

class Machine{
	public void start(){
		System.out.println("Machine Started");
	}
	
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera Started");
	}
	
	public void snap(){
		System.out.println("photo taken");
	}
}

public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting
		
		//**** The type of the variable determines what method are available to be called ****
		//**** The type of the object that that variable refers to determines which actual method can be called ****
		
		Machine machine2 = camera1; // only the 'start'  method is possible to be called
		machine2.start(); 			// The 'start' method in the machine class can actually be called
	
		
		//Downcasting
		//Downcasting requires casting to the right type
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		

	}

}
