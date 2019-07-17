package hu.mitro.decorator.state;

public class GreenState extends State {

	public GreenState(String state) {
		super(state);
	}

	@Override
	State red() {
		return lampPool.getState("green");
	}

	@Override
	State redAndYellow() {
		return lampPool.getState("green");
	}

	@Override
	State yellow() {
		return lampPool.getState("yellow");
	}

	@Override
	State green() {
		return lampPool.getState("green");
	}
}
