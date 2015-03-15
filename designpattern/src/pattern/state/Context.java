package pattern.state;

/**
 * 环境容器，切换状态变化
 */
public class Context {
	public static final State STATE1 = new ConcreteState1();
	public static final State STATE2 = new ConcreteState2();
	
	//当前状态
	private State currentState;
	
	//获得当前状态
	public State getCurrentState() {
		return this.currentState;
	}
	
	//设置当前状态
	public void setCurrentState(State _currentState) {
		this.currentState = _currentState;
	}
	
	
	public void handle1() {
		this.currentState.handle1();
	};
	
	public void handle2() {
		this.currentState.handle2();
		
	};
}

