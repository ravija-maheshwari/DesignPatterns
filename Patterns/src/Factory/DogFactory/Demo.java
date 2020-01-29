package Factory.DogFactory;

public class Demo {
	public static void main(String[] args){
	    // create a small dog
	    Dog dog = DogFactory.createDog("small");
	    dog.speak();

	    // create a big dog
	    dog = DogFactory.createDog("medium");
	    dog.speak();
	  }x
}
