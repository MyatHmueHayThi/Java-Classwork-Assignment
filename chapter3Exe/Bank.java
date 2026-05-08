package chapter3Exe;

public class Bank {
	private int accountNumber;
	private double balance;
	public Bank(int acc,double bal) {
		accountNumber=acc;
		balance = bal;
	}
	public Bank() {
		accountNumber=-1;
		balance =0.0;
		
	}
	public void deposit(double amount) {
		balance +=amount;
	}
	public void withdraw(double amount) {
		balance -=amount;
	}
	public void display() {
		System.out.println("Acccount Number:"+accountNumber);
		System.out.println("Balance:"+balance);

	}
	
}
