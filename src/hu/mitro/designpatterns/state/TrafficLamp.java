package hu.mitro.designpatterns.state;

public class TrafficLamp {

	State actualState;

	public TrafficLamp(State actualState) {
		this.actualState = actualState;
	}

	public void start(){
	}

	public String checkState(){
		return actualState.getStateName();
	}
}
