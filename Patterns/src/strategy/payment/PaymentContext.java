package strategy.payment;

public class PaymentContext {
	
	public void pay(PayementStrategy ps) {
		ps.pay();
	}
}
