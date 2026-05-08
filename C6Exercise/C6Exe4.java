package C6Exercise;

import java.util.Scanner;

public class C6Exe4 {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		int num =sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
