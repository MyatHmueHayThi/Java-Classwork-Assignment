package chapter4Exercise;

public class DeductionWithFEE {

	public static void main(String[] args) {
		AccountVer3 acc3 = new AccountVer3("Mg Mg",50.00) ;
		acc3.deduct(10);
		System.out.println("Owner : "+acc3.getOwnerName()+"\n"+"Balance: "+acc3.getCurrentBalance());

	}

}
