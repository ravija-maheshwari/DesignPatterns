package decorator.Notifier;

public class SMSDecorator extends NotifierDecorator {
	
	Notifier n;
	public SMSDecorator(Notifier n) {
		this.n = n;
	}
	
	
	@Override
	public void notification() {
		n.notification();
		System.out.println("+ SMS Notification");
	}
	
	

}
