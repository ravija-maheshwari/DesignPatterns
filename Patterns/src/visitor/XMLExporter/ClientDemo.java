package visitor.XMLExporter;

public class ClientDemo {
	public static void main(String args[]) {
		Visitor v = new ConcreteVisitor();
		v.visit(new ConcreteElementA());
		v.visit(new ConcreteElementB());
	}

}
