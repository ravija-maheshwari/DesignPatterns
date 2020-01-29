package visitor.XMLExporter;

public class ConcreteElementB implements Element{

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
