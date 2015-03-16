package pattern.visitor;

public class Visitor implements IVisitor {

	@Override
	public void visit(Element1 element1) {
		element1.doSomething();
	}

	@Override
	public void visit(Element2 element2) {
		element2.doSomething();
	}

}
