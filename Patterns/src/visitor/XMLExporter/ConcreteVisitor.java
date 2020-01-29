package visitor.XMLExporter;

public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(ConcreteElementA concreteElementA) {
		System.out.println("Visiting A");
	}

	@Override
	public void visit(ConcreteElementB concreteElementB) {
		System.out.println("Visiting B");
	}
	
}
