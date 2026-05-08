package chapter4Exercise;

public class LibraryCard {
	private Student owner;
	private int borrowCnt;
	public LibraryCard() {
		owner=null;
		borrowCnt=0;
		
	}
	public void checkOut(int borrNum) {
		borrowCnt+=borrNum;
		
	}
	public int getNumberOfBooks() {
		return borrowCnt;
	}
	public Student getOwnerName() {
		return owner;
	}
	public void setOwner(Student st) {
		owner = st;
	}
	public String toString() {
		return "Owner Name:"+owner.getName()+"\n"+"Owner Email:"+owner.getEmail()+"\n"+"Borrow number:"+borrowCnt;
	}
}

