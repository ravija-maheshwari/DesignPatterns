package strategy.payment;

public class PaymentDemo {
	public static void main(String args[]) {
		PaymentContext context = new PaymentContext();
		context.pay(new CreditCard());
		context.pay(new Cash());
	}
}
