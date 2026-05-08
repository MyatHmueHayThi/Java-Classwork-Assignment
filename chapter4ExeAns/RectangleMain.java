package chapter4ExeAns;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		Rectangle rec=new Rectangle(width,height);
		System.out.println("Area: "+rec.area());
		System.out.println("Perimeter: "+rec.perimeter());
		

	}

}
