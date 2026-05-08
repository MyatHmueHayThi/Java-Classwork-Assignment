package chapter4Exercise;

public class Account {
	private String ownerName;
	private double balance;
	public Account() {
		ownerName="Unknown";
		balance=0.00;
	}
	public void add(double amt) {
		balance += amt;
	}
	public void deduct(double amt) {
		balance-=amt;
	}
	public double getCurrentBalance() {
		return balance;
		
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setInitialBalance(double bal) {
		balance =bal;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
