package Package1;

import java.util.Scanner;

public class C5Exe5 {

	public static void main(String[] args) {
		int sal;
		int year;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter total years of Service:");
		year = sc.nextInt();
		if (year > 5) {
			System.out.println("Congrat...!Your total year of service more than 5 years."+"\nEnter your salary:");
			sal = sc.nextInt();
			double bonous = sal* 0.5;
			System.out.println("Your 5% Bonous is "+bonous);
			System.out.println("your net bonous with salary is "+(sal+bonous));
		}
		else {
			System.out.println("You don't have bonous.");
		}
	}

}
