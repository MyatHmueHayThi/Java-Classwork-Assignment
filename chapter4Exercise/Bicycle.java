package chapter4Exercise;

public class Bicycle {
	private String ownerName;
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public static void main(String[] args) {
		Bicycle bike=  new Bicycle();
		bike.setOwnerName("Thet Hmue Aung");
		System.out.println("My Love name is "+bike.ownerName);

	}

}
