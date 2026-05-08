package chapter4Exercise;

import java.text.DecimalFormat;

public class secondMain {

	public static void main(String[] args) {
		Bicycle bike=new Bicycle();
		Account acc=new Account();
		String myName="Mg Mg";
		bike.setOwnerName(myName);
		acc.setInitialBalance(450.55);
		acc.add(100);
		acc.deduct(50);
		System.out.println(bike.getOwnerName()+" owns bicycle and");
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println("has $ "+df.format(acc.getCurrentBalance()));
	}

}
