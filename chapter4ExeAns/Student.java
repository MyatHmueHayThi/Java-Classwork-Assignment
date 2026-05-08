package chapter4ExeAns;

import java.util.Scanner;

public class Student {
	private String name;
	private int rollno;
	public Student(String n,int r) {
		name=n;
		rollno=r;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
	}
	public static void main(String[] args) {
		Student s1=new Student("Myat",3);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:");
		String s2Name = sc.next();
		System.out.print("Enter Roll Number:");
		int s2roll = sc.nextInt();
		Student s2=new Student(s2Name,s2roll);
		s1.displayInfo();
		s2.displayInfo();

	}

}
