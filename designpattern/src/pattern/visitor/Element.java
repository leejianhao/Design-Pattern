package pattern.visitor;

/**
 *抽象需要访问的元素
 */
public abstract class Element {
	
	abstract void accept(IVisitor visitor);
	//访问者可以访问的具体行为
	abstract void doSomething();
}
