package chapter3Exe;

public class BankMain {
 public static void main( String [] args) {
	 Bank acc1 = new Bank();
	 Bank acc2 = new Bank();
	 acc1.deposit(2000);
	 acc1.withdraw(1000);
	 acc1.display();
	 acc2.deposit(3000);
	 acc2.withdraw(1000);
	 acc2.display();
 }
}
