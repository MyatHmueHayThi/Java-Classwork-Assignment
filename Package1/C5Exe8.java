package Package1;

import java.util.Scanner;

public class C5Exe8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter age of first person:");
		int age1=sc.nextInt();
		System.out.print("Enter age of second person:");
		int age2=sc.nextInt();
		System.out.print("Enter age of third person:");
		int age3=sc.nextInt();
		int oldest = Math.max(age1, age2);
		oldest = Math.max(age3, oldest);
		int youngest = Math.min(age1, age2);
		youngest = Math.min(age3, youngest);
		System.out.println("Oldest age is "+oldest);
		System.out.println("Youngest age is "+youngest);
	}

}
