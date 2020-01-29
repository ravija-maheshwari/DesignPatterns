package visitor.XMLExporter;

public class ConcreteElementA implements Element{

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}
