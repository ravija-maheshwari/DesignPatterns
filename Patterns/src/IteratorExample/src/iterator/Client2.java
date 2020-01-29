package iterator;
import java.util.LinkedList;
import java.util.List;

public class Client2{
	
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		//Client2 c = new Client2();
		list.add(5);
		list.add(6);
		list.add(8);
		
		ListConcrete lc = new ListConcrete(list);
		
		Iterator linkedListIterator = lc.createIterator();
		
		while(linkedListIterator.hasNext()) {
			System.out.println(linkedListIterator.next());
		}
		
	}
	
	
	
	
}

