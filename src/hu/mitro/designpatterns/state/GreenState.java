package hu.mitro.designpatterns.state;

public class GreenState extends State {

	public GreenState(String stateName) {
		super(stateName);
	}

	@Override
	public State nextState() {
		return new YellowState("YELLOW");
	}
}
