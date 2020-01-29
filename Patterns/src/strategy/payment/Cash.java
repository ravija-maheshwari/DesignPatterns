package strategy.payment;

public class Cash implements PayementStrategy {

	@Override
	public void pay() {
		System.out.println("Cash payment");
	}
	
}
