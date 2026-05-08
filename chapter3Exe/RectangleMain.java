package chapter3Exe;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width:");
		double width = sc.nextDouble();
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		Rectangle rec = new Rectangle(width,height);
		System.out.println("Area:"+rec.area());
		System.out.println("Perimeter:"+rec.perimeter());

	}

}
