package iterator;
import java.util.List;

//this is the concrete aggregator
public class ListConcrete implements Aggregate {
	
	List<Integer> list2;
	
	public ListConcrete(List<Integer> list2) {
		this.list2 = list2;
	}
	
	@Override
	public Iterator createIterator() {
		return new LinkedListIterator(list2);
	}
	
}
