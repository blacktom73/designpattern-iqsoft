package hu.mitro.decorator.state;

public abstract class State {

	String state;
	TrafficLampPool lampPool;

	public State(String state) {
		this.state = state;
		this.lampPool = TrafficLampPool.getInstance();
	}

	public String getState() {
		return state;
	}

	abstract State red();

	abstract State redAndYellow();

	abstract State yellow();

	abstract State green();
}
