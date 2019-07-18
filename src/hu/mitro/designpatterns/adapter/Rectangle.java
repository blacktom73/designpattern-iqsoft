package hu.mitro.designpatterns.adapter;

public class Rectangle implements Shape {

	int aSide;
	int bSide;

	public Rectangle(int aSide, int bSide) {
		this.aSide = aSide;
		this.bSide = bSide;
	}

	@Override
	public double area() {
		return aSide * bSide;
	}

	@Override
	public double perimeter() {
		return 2 * (aSide + bSide);
	}
}
