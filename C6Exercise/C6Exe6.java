package C6Exercise;

import java.util.Scanner;

public class C6Exe6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int temp = num;
		int remainder =0;
		int reverse =0;
		while (temp>0){
			remainder = temp%10;
			reverse = reverse*10 + remainder;
			temp/=10;
		}
		System.out.print("Reverse Number is "+reverse);
	}

}
