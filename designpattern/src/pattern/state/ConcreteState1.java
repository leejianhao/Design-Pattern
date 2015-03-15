package pattern.state;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		//具体业务
	}

	@Override
	public void handle2() {
		//设置当前状态为state2
		super.context.setCurrentState(new ConcreteState2());
		super.context.handle2();
	}

}
