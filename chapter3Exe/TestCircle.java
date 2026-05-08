package chapter3Exe;

import java.text.DecimalFormat;

public class TestCircle {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000");
		Circle c1=new Circle();
		System.out.println("Radius= "+df.format(c1.getRadius())+" and Area=  "+df.format(c1.getArea()));
		Circle c2 =new Circle(2.0);
		System.out.println("Radius= "+df.format(c2.getRadius())+" and Area=  "+df.format(c2.getArea()));
		
	}
}
