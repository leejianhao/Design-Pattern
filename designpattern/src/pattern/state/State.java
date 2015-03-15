package pattern.state;

/**
 * 状态抽象类
 */
public abstract class State {
	protected Context context = null;
	
	public void setContext(Context _context) {
		this.context = _context;
	}
	
	public abstract void handle1();
	public abstract void handle2();
	
}
