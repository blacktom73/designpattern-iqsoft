package hu.mitro.decorator.state;

public class RedAndYellowState extends State {

	public RedAndYellowState(String state) {
		super(state);
	}

	@Override
	State red() {
		return lampPool.getState("redandyellow");
	}

	@Override
	State redAndYellow() {
		return lampPool.getState("redandyellow");
	}

	@Override
	State yellow() {
		return lampPool.getState("yellow");
	}

	@Override
	State green() {
		return lampPool.getState("redandyellow");
	}
}
