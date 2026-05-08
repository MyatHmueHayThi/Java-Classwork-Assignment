package chapter7Exe;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter width for first rectangle:");
		int w1=sc.nextInt()	;
		System.out.println("Enter height for first rectangle:");
		int h1= sc.nextInt();
		Rectangle r1=new Rectangle(w1,h1);
		System.out.println("Enter width for second rectangle:");
		int w2=sc.nextInt()	;
		System.out.println("Enter height for second rectangle:");
		int h2= sc.nextInt();
		Rectangle r2=new Rectangle(w2,h2);
		Rectangle largest = r1.computeArea(r2);
		System.out.println("Rectangle with Largest Area:");
		System.out.println(largest.toString());
	}
}
