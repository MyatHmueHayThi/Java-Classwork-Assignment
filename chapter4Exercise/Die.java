package chapter4Exercise;

import java.util.Random;

public class Die {
	private static final int MAX_NUM =6;
	private static final int MIN_NUM=1;
	private static final int NO_NUM =0;
	private int number;
	private Random random;
	public Die() {
		random = new Random();
		number = NO_NUM;
	}
	public void roll() {
		number= random.nextInt(MAX_NUM-MIN_NUM+1)+MIN_NUM;
	}
	public int getNuber() {
		return number;
	}
	
}
