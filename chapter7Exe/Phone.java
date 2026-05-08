package chapter7Exe;

import java.util.Scanner;

public class Phone {
	
	public static char[] toString;
	private String Phone_Brand;
	private double Price;
	private int Year;
	public Phone() {
		Phone_Brand="";
		Price=0.00;
		Year=0;
	}
	public Phone(String pb,double p,int y) {
		Phone_Brand=pb;
		Price=p;
		Year=y;
	}
	public double calculateDiscount() {
		double disrate;
		if (Year<2020) {
			disrate=0.10;
		}
		else
			{disrate=0.05;}
		return Price * disrate;
	}
	public String toString() {
		return "Phone Brand:"+Phone_Brand+"\nPrice:"+Price+"\nYear:"+Year+"\nDiscount:"+calculateDiscount();
	}
	public class PhoneMain{
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter pnone brand:");
			String pbr=sc.next();
			System.out.println("Enter price:");
			double pr=sc.nextDouble();
			System.out.println("Enter year:");
			int yr=sc.nextInt();
			Phone ph=new Phone(pbr,pr,yr);
			System.out.print(Phone.toString);
		}
		
	}
}
