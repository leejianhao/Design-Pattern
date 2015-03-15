package pattern.state;

public class ConcreteState2 extends State{

	@Override
	public void handle1() {
		//过渡到State1
		super.context.setCurrentState(new ConcreteState1());;
		//具体由context委托处理
		super.context.handle1();
	}

	@Override
	public void handle2() {
		//具体业务
	}

}
