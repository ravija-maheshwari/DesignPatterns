package observer.EventManager;

import java.util.ArrayList;

//Observable class
public class EventManager {
	private ArrayList<Subscriber> subscribers = new ArrayList<>();
	
	public void addSubscriber(Subscriber sub) {
		subscribers.add(sub);
	}
	
	public void removeSubscriber(Subscriber sub) {
		subscribers.remove(sub);
	}
	
	public void changed(){
		for(Subscriber s : subscribers) {
			s.update(this);
		}
	}
}
