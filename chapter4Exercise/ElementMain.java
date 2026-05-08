package chapter4Exercise;

public class ElementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element e1=new Element("Hydrogen",1,"H",1.008,1,1);
		Element e2=new Element("Gold",79,"Au",197.0,6,11);
		System.out.println("Name: "+e1.getName());
		System.out.println("Number: "+e1.getNumber());
		System.out.println("Symbol: "+e1.getSymbol());
		System.out.println("Mass: "+e1.getMass());
		System.out.println("Period: "+e1.getPeriod());
		System.out.println("Group: "+e1.getGroup());
		System.out.println(" ");
		System.out.println("Name: "+e2.getName());
		System.out.println("Number: "+e2.getNumber());
		System.out.println("Symbol: "+e1.getSymbol());
		System.out.println("Mass: "+e1.getMass());
		System.out.println("Period: "+e1.getPeriod());
		System.out.println("Group: "+e1.getGroup());
	}

}
