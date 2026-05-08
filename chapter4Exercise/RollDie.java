package chapter4Exercise;

public class RollDie {

	public static void main(String[] args) {
		Die one=new Die();
		Die two=new Die();
		Die three=new Die();
		one.roll();
		two.roll();
		three.roll();
		System.out.println("Results are "+one.getNuber()+","+two.getNuber()+","+three.getNuber());
	}

}
