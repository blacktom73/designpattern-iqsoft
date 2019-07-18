package hu.mitro.designpatterns.adapter;

public class Triangle implements Shape {

	private MyTriangle myTriangle;
	private int side;
	private int height;

	public Triangle(int side, int height) {
		this.side = side;
		this.height = height;
		this.myTriangle = new MyTriangle(side, height);
	}

	@Override
	public double area() {
		return myTriangle.a();
	}

	@Override
	public double perimeter() {
		return myTriangle.p();
	}
}
