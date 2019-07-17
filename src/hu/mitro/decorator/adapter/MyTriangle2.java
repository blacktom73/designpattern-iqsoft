package hu.mitro.decorator.adapter;

public abstract class MyTriangle2 {

	int side;
	int height;

	public MyTriangle2(int side, int height) {
		this.side = side;
		this.height = height;
	}

	protected double a() {
		return 3 * side;
	}

	protected double p() {
		return (side * height) / 2;
	}

}
