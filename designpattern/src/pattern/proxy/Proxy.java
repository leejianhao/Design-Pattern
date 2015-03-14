package pattern.proxy;

public class Proxy extends Subject{
	
	private Subject realSubject =  null;
	
	public Proxy(Subject subject) {
		this.realSubject = subject;
	}
	
	@Override
	public void doSomething() {
		realSubject.doSomething();
	}
		
}
