package hu.mitro.decorator.adapter;

public class Triangle2 extends MyTriangle2 implements Shape{

	public Triangle2(int side, int height) {
		super(side, height);
	}

	@Override
	public double area() {
		return a();
	}

	@Override
	public double perimeter() {
		return p();
	}
}
