package polymorphism_basic;

public class App {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		//plant1 refers to an object of type Plant
		//plant2 will now refer to the same Plant object
		Plant plant2 = plant1;
		
		//Since tree is a subclass of plant it polymorphs
		Plant plant3 = tree;
		
		//The grow method in Tree overrides Plant
		plant2.grow();
		plant3.grow();
		
		//the type of the variable Plant/Tree decides what method you can call
		//As tree is a Tree variable, you can call methods 'grow' and 'shedLeaves'
		tree.shedLeaves();
		
		//****The type of the variable determines what method are available to be called****
		//****The type of the object that that variable refers to determines which actual method can be called****
		//as plant2 points at an object of type plant, only the grow method can be called
		//error : plant2.shedLeaves();
		
	}

}
