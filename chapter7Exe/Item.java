package chapter7Exe;

import java.util.Scanner;

public class Item {
	private String Item_ID;
	private String Item_Name;
	private double unitPrice;
	private int qty;
	public Item() {
		Item_ID="";
		Item_Name="";
		unitPrice=0.0;
		qty=0;
	}
	public Item(String Item_ID,String Item_Name,double unitPrice,int qty) {
		this.Item_ID=Item_ID;
		this.Item_Name=Item_Name;
		this.unitPrice=unitPrice;
		this.qty=qty;
	}
	public double calculate() {
		double Total_cost=unitPrice * qty;
		return Total_cost;
	}
	public String displayInfo() {
		
		return "Item Id:"+Item_ID+"\nItem Name:"+Item_Name+"\nUnitPrice:"+unitPrice+"Quantity:"+qty+"Total Cost:"+calculate();
	}
	public class ItemMain{
		public static void main(String [] args) {
			Item [] items = new Item[5];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++) {
				System.out.println("Enter Info for item"+(i+1));
				System.out.println("Enter Item ID:");
				String id = sc.nextLine();
				System.out.println("Enter Item Name:");
				String name = sc.nextLine();
				System.out.println("Enter Unit Price:");
				double up = sc.nextDouble();
				System.out.println("Enter Quantity:");
				int qtiy = sc.nextInt();
				items[i] = new Item(id,name,up,qtiy);
				
			}
			System.out.println("...Item Detail...");
			for(int i=0;i<5;i++) {
				System.out.println("Item"+(i+1));
				System.out.println(items[i].displayInfo());
				
			}
		}
	}
}
