package pattern.visitor;

public class Element2 extends Element {
	
	@Override
	void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	void doSomething() {
		System.out.println("元素2");
	}
	
}
