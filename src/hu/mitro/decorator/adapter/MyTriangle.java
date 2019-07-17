package hu.mitro.decorator.adapter;

public class MyTriangle {

	int side;
	int height;

	public MyTriangle(int side, int height) {
		this.side = side;
		this.height = height;
	}

	public double a() {
		return 3 * side;
	}

	public double p() {
		return (side * height) / 2;
	}

}
