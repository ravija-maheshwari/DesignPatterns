package state.mobile;

public class MobileAlertContext {

	private MobileAlertState current;
	
	public MobileAlertContext() {
		//set to default
		this.current = new Vibration();
	}
	
	//Usually the client does not call this
	public void setState(MobileAlertState state) {
		this.current = state;
	}
	
	public void alert() {
		current.alert(this);
	}
}
