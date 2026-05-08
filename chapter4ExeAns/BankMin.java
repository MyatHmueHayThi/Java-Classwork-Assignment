package chapter4ExeAns;

public class BankMin {

	public static void main(String[] args) {
		Bank acc1= new Bank();
		Bank acc2 =new Bank();
		acc1.deposit(2000);
		acc1.withdraw(1000);
		acc1.disply();
		acc1.deposit(3000);
		acc1.withdraw(1000);
		acc1.disply();

	}

}
