package chapter4Exercise;

public class RoomWinner {

	public static void main(String[] args) {
		LoterryCard c1=new LoterryCard();
		LoterryCard c2=new LoterryCard();
		LoterryCard c3=new LoterryCard();
		
		c1.spin();
		c2.spin();
		c3.spin();
		System.out.println("Card1: "+c1.getColor()+","+c1.getNumber());
		System.out.println("Card2: "+c2.getColor()+","+c2.getNumber());
		System.out.println("Card3: "+c3.getColor()+","+c3.getNumber());
	}

}
