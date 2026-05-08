package chapter4ExeAns;

public class Bank {
	private int accNum;
	private double balance;
	
	public Bank() {
		accNum = -1;
		balance =0.0;
	}
	public Bank(int acc,double bal) {
		accNum=acc;
		balance=bal;
	}
	public void deposit (double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public void disply() {
		System.out.println("Account Number: "+accNum);
		System.out.println("Balance: "+balance);

	}
}
