package strategy.payment;

public class CreditCard implements PayementStrategy{

	@Override
	public void pay() {
		System.out.println("Credit card");
	}
	
}
