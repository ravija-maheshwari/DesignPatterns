package state.mobile;

public class Silent implements MobileAlertState {

	@Override
	public void alert(MobileAlertContext context) {
		System.out.println("Silent...");
		context.setState(new Vibration());
	}

}
