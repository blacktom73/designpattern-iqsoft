package hu.mitro.decorator.state;

public class TrafficLamp {

	State actualState;

	public TrafficLamp(State actualState) {
		this.actualState = actualState;
	}

	public void start(){
	}

	public void changeState(String oid){
	}
	public String checkState(){
		return actualState.getState();
	}
}
