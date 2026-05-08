package Package1;

import java.util.Scanner;

public class C5Exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length:");
		int x= sc.nextInt();
		System.out.print("Enter Breadth:");
		int y=sc.nextInt();
		if (x==y) {
			System.out.println("Square.");
		}
		else {
			System.out.println("Not Square.");
		}
	}

}
