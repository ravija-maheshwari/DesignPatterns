package decorator.Notifier;

public class ConcreteNotifier extends Notifier{

	@Override
	public void notification() {
		System.out.println("You've got a notification");
	}
	
}
