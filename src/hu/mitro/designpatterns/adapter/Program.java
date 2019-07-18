package hu.mitro.designpatterns.adapter;

public class Program {

	public static void main(String[] args) {
		Shape circle = new Circle(10);
		System.out.println("Area of circle: " + circle.area());
		System.out.println("Perimeter of circle: " + circle.perimeter());

		Shape square = new Square(10);
		System.out.println("Area of square: " + square.area());
		System.out.println("Perimeter of square: " + square.perimeter());

		Shape rectangle = new Rectangle(10, 15);
		System.out.println("Area of rectangle: " + rectangle.area());
		System.out.println("Perimeter of rectangle: " + rectangle.perimeter());

		Shape triangle = new Triangle(10, 5);
		System.out.println("Area of triangle: " + triangle.area());
		System.out.println("Perimeter of triangle: " + triangle.perimeter());

		Shape triangle2 = new Triangle2(10, 5);
		System.out.println("Area of triangle: " + triangle2.area());
		System.out.println("Perimeter of triangle: " + triangle2.perimeter());
	}
}
