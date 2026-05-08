package C6Exercise;

import java.util.Scanner;

public class C6Exe5 {
	public static double exponent(double A,int N) {
		if(N==1) 
			return A;
		else
			return A*exponent(A,N-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter base:");
		double base = sc.nextDouble();
		System.out.print("Enter power:");
		int power = sc.nextInt();
		System.out.println(exponent(base,power));

	}

}
