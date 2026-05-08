package chapter4Exercise;

import java.util.Random;

public class LoterryCard {
	private static final int MAX_NUM=15;
	private static final int MIN_NUM=10;
	private static final int NO_NUM=0;
	private static final int MAX_COL=3;
	private static final int MIN_COL=1;
	private static final int NO_COL=0;
	private int number;
	private int color;
	private Random random;
	public LoterryCard() {
		// TODO Auto-generated constructor stub
		number=NO_NUM;
		color=NO_COL;
		
	}
	public void spin() {
		number =random.nextInt(MAX_NUM-MIN_NUM+1)+MIN_NUM;
		color=random.nextInt(MAX_NUM-MIN_NUM+1)+MIN_NUM;
	}
	public int getNumber() {
		return number;
	}
	public int getColor() {
		return color;
	}

}
