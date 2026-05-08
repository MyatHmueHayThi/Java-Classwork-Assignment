package chapter4Exercise;

public class AccountVer3 {
	private static final double FEE =0.50;
	private String ownerName;
	private double balance;
	
	public AccountVer3(String name,double startingBalance) {
		ownerName=name;
		balance = startingBalance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getCurrentBalance() {
		return balance;
	}
	public void deduct(double amt) {
		balance = balance - amt -FEE;
	}
}
