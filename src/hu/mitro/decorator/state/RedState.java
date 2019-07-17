package hu.mitro.decorator.state;

public class RedState extends State {

	public RedState(String state) {
		super(state);
	}

	@Override
	State red() {
		return lampPool.getState("red");
	}

	@Override
	State redAndYellow() {
		return lampPool.getState("redandyellow");
	}

	@Override
	State yellow() {
		return lampPool.getState("red");
	}

	@Override
	State green() {
		return lampPool.getState("red");
	}
}
