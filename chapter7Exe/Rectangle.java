package chapter7Exe;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle() {
		width=0;
		height=0;
	}
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		int area= width*height;
		return area;
	}
	public Rectangle computeArea(Rectangle r) {
		if (this.getArea()>=r.getArea()) {
			return this;
		}
		else {
			return r;
		}
	}
	public String toString() {
		return "Width: "+width + "\nHeight: "+height+"\nArea: "+getArea();
		
	}
}