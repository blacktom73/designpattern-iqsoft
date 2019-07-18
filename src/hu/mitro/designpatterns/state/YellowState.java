package hu.mitro.designpatterns.state;

public class YellowState extends State {

	public YellowState(String stateName) {
		super(stateName);
	}

	@Override
	public State nextState() {
		return new GreenState("GREEN");
	}
}
