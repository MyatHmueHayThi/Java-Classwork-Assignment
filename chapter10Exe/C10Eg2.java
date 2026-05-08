package chapter10Exe;

import java.util.Scanner;

public class C10Eg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rainfall[]= new double[12];
		double sum=0.0;
		for(int i=0;i<12;i++)	{
			System.out.print("Enter raifall for month"+(i+1)+":");
			rainfall[i] = sc.nextDouble();
			sum+=rainfall[i];
			
		}
		double ave=sum/rainfall.length;
		System.out.format("%5.3f\n\n", ave);
		for (int i=0;i<12;i++) {
			System.out.format("%3d\t",i+1);
			System.out.format("%5.2f\t",rainfall[i]);
			double diff = Math.abs(rainfall[i]-ave);
			System.out.format("%5.2f\n",diff);


		}
	}

}
