package observer.EventManager;

public class EmailAlertsListener implements Subscriber {

	@Override
	public void update(EventManager em) {
		System.out.println("Info reached in EmailAlerts");
	}

}
