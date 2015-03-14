package pattern.proxy;

public class RealSubject extends Subject {
	
	@Override
	public void doSomething() {
		System.out.println("real subject do thing...");
	}

}
