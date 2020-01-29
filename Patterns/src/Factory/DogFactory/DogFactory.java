package Factory.DogFactory;

public class DogFactory {
	public static Dog createDog(String size) {
		
		if(size.equals("small")) {
			return new Pug();
		}else if(size.equals("medium")) {
			return new Shitzhu();
		}
		return null;
	}
}
