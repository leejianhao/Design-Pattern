package pattern.proxy;

public class Client {

	public static void main(String[] args) {
		new Proxy(new RealSubject()).doSomething();
	}

}
