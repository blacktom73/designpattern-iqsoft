package hu.mitro.designpatterns.state;

public abstract class State {

	String stateName;

	public State(String stateName) {
		this.stateName = stateName;
	}

	public String getStateName() {
		return stateName;
	}

	public abstract State nextState();
}
