package hu.mitro.decorator.adapter;

public class Square implements Shape {

	int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}
}
