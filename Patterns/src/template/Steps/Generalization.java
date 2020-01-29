package template.Steps;

public abstract class Generalization {
	
	//Template Method
	void findSolution() {
		stepOne();
		stepTwo();
		stepThree();
		stepFour();
	}
	
	//Invariant implementations are in base class
	private void stepOne() {
		System.out.println("Base Class: step one");
	}
	
	private void stepTwo() {
		System.out.println("Base Class: step two");
	}
	
	//Variant implementations are declared abstract in the base class
	abstract void stepThree();
	abstract void stepFour();

}
