package observer.EventManager;

public class Demo {
	public static void main(String args[]) {
		EventManager events = new EventManager();
		
		Subscriber emailListener = new EmailAlertsListener();
		events.addSubscriber(emailListener);
		
		events.changed();
	}
	

}
