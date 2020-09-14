package design_pattern.state;

public class StopState implements State {

	@Override
	public void doAction(Context context) {

		System.out.println("Player is in stop design_pattern.state");
		context.setState(this);
	}
	public String toString(){
		return "Stop State";
	}

}
