package C6Exercise;

import java.util.Scanner;

public class C6Exe8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even=0;int odd=0; char choice;
		do {
		System.out.print("Enter  number");
		int num = sc.nextInt();
		if(num%2 == 0) {
			even += num;
		}
		else
		{
			odd+=num;
		}
		System.out.print("Do you want to continue y/n?");
		choice = sc.next().charAt(0);
		}while(choice =='y' || choice =='n');
	}
	//Syatem.out.println("Sum of even number:"+even);
	//Syatem.out.println("Sum of odd number:"+odd);

}
