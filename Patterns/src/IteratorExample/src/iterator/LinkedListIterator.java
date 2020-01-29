package iterator;
import java.util.*;

//concrete iterator class
public class LinkedListIterator implements Iterator{
	
	List<Integer> list2;
	int position = 0;
	
	public LinkedListIterator(List<Integer> list2) {
		this.list2 = list2;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= list2.size() || list2.get(position) == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		Object obj = list2.get(position);
		position++;
		return obj;
		
	}
	
}
