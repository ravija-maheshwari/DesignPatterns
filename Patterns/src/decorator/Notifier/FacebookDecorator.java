package decorator.Notifier;

public class FacebookDecorator extends NotifierDecorator {
	Notifier n ;
	
	public FacebookDecorator(Notifier n) {
		this.n = n;
	}
	
	
	@Override
	public void notification() {
		n.notification();
		System.out.println("+ Facebook Notification");
	}
	
}
