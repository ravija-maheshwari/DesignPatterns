package adapter.pegs;
public class Adapter extends RoundPeg{
	private SquarePeg sqaurePeg;
	
	public Adapter(SquarePeg sqaurePeg) {
		this.sqaurePeg = sqaurePeg;
	}
	
	public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((sqaurePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
