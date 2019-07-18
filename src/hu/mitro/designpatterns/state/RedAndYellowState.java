package hu.mitro.designpatterns.state;

public class RedAndYellowState extends State {

	public RedAndYellowState(String stateName) {
		super(stateName);
	}

	@Override
	public State nextState() {
		return new YellowState("YELLOW");
	}

}
