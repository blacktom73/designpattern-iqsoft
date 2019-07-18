package hu.mitro.designpatterns.state;

public class RedState extends State {

	public RedState(String stateName) {
		super(stateName);
	}

	@Override
	public State nextState() {
		return new RedAndYellowState("RED-YELLOW");
	}

}
