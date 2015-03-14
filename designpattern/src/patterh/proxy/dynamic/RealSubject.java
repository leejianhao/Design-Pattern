package patterh.proxy.dynamic;

public class RealSubject implements Subject {

	@Override
	public void doSomething(String thing) {
		System.out.println("real subject do:"+thing);
	}

}
