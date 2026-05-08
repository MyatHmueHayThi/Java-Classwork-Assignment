package Package1;

import java.util.Scanner;

public class C5Exe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Quantity:");
		int qt= sc.nextInt();
		int cost = qt * 100;
		if (cost>1000) {
			double dis = cost * 0.1;
			double totalCost = cost-dis;
			System.out.print("You get discount "+dis+ " and total cost is "+totalCost);
		}
	}

}
