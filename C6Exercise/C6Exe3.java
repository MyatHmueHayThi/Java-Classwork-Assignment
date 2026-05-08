package C6Exercise;

import java.util.Scanner;

public class C6Exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive integer:");
		int num= sc.nextInt();
		for(int i=1;i<=12;i++) {
			System.out.println(num + " x " + i +" = "+(num*i));
			
		}

	}

}
