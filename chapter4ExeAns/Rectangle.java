package chapter4ExeAns;

public class Rectangle {
	private double height;
	private double width;
	public Rectangle(){
		width=1;
		height=1;
		
	}
	public Rectangle(double w,double h) {
		width = w;
		height =h;
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return 2*(width+height);
	}
}
