package Package1;

import java.util.Scanner;

public class C5Exe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of first person:");
		int age1=sc.nextInt();
		System.out.print("Enter age of second person:");
		int age2=sc.nextInt();
		System.out.print("Enter age of third person:");
		int age3=sc.nextInt();
		int old=age1;
		int young=age1;
		if(age2>old) {
			old=age2;
		}
		if(age3>old) {
			old=age3;
		}
		if(age2<young) {
			young = age2;
		}
		if(age3<young) {
			young = age3;
		}
		System.out.println("Oldest age is "+old);
		System.out.println("Youngest age is "+young);
	}

}
