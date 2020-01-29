package decorator.Notifier;

public class Test {
	public static void main(String args[]) {
		NotifierDecorator dec = new FacebookDecorator(new SMSDecorator(new ConcreteNotifier()));
		dec.notification();
	}
}
