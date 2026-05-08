package chapter10Exe;

import java.util.Scanner;

public class C10Eg1 {

	public static void main(String[] args) {
		double sum = 0.0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<12;i++) {
			System.out.print("Rainfall for month"+(i+1)+":");
			double rainfall = sc.nextDouble();
			sum+=rainfall;
		}
		double ave = sum/12.0;
		
	}

}
