package Package1;

import java.util.Scanner;

public class C5Exe2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of hours:");
		int hrs = sc.nextInt();
		System.out.println("Enter total sales:");
		int sale= sc.nextInt();
		double wage = 7.25 * hrs;
		double c=0;
		if(sale>=1 && sale<=99.99) {
			c=sale * 0.05;
		}
		else if (sale>=100.00 && sale<=299.99) {
			c=sale* 1.0;
		}
		else if (sale>=300.00) {
			c=sale * 1.5;
		}
		wage +=c;
		System.out.println("Wage is "+wage);
	}
}
