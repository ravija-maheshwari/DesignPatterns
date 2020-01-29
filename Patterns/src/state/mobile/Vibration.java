package state.mobile;

public class Vibration implements MobileAlertState {
	
	@Override
	public void alert(MobileAlertContext context) {
		System.out.println("Vibration..");
		context.setState(new Silent());
	}	
}
