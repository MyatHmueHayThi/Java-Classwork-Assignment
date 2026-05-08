package chapter7Exe;

import java.util.Scanner;

public class DistanceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter feet for first distance:");
			int feet1 = sc.nextInt();
			System.out.println("Enter inches for first distance:");
			int inches1 = sc.nextInt();
			Distance d1 = new Distance(feet1,inches1);
			
			System.out.println("Enter feet for sec distance:");
			int feet2 = sc.nextInt();
			System.out.println("Enter inches for sec distance:");
			int inches2 = sc.nextInt();
			Distance d2 = new Distance(feet2,inches2);
			Distance sum =d1.add(d2);
			System.out.println(sum.toString());
			
		}

}


