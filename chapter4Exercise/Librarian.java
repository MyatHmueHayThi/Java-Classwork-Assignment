package chapter4Exercise;

public class Librarian {

	public static void main(String[] args) {
		Student student=new Student();
		LibraryCard card1=new LibraryCard();
		LibraryCard card2=new LibraryCard();
		student.setName("Su Su");
		student.setEmail("susu@gmail.com");
		card1.checkOut(5);
		card1.setOwner(student);
		card2.setOwner(student);
		System.out.println("Card 1 Info :");
		System.out.println(card1.toString());
		System.out.println("Card 2 Info :");
		System.out.println(card2.toString());
	}

}
