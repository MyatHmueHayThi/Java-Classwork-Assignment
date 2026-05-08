package C6Exercise;

import java.util.Scanner;

public class C6Exe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a positive integer:");
		int num = sc.nextInt();
		int d=2;
		while(num%d != 0) {
			d++;
		}
		if (num==d) {
			System.out.print("Number is Prime.");
		}
		else 
		{
			System.out.print("Number is not prime.");
		}
	}

}
