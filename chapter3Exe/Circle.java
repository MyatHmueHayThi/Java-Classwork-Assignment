package chapter3Exe;

public class Circle {
	private double radius;
	private String color;
	public Circle() {
		radius=1.0;
		color="red";
	}
	public Circle(double r) {
		radius =r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
