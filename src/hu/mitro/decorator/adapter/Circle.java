package hu.mitro.decorator.adapter;

public class Circle implements Shape {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public double perimeter() {
		return radius * 2 * Math.PI;
	}
}
