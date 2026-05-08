package chapter4Exercise;
class Bicycle_exe{
	private String ownerName;
	public Bicycle_exe() {
		ownerName="Unknown";
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String name) {
		ownerName = name;
	}
	
}
public class BicycleRegistration {

	public static void main(String[] args) {
		Bicycle bike1= new Bicycle();
		bike1.setOwnerName("Ko Ko");
		Bicycle bike2= new Bicycle();
		bike2.setOwnerName("Mg Mg");
		String owner1=bike1.getOwnerName();
		String owner2=bike2.getOwnerName();
		System.out.println("Owner 1 name is "+owner1);
		System.out.println("Owner 2 name is "+owner2);
	}

}
