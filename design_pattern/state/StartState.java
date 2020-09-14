package design_pattern.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start design_pattern.state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
