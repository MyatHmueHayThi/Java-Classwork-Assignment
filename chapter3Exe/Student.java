package chapter3Exe;

import java.util.Scanner;

public class Student {
	private String name;
	private int rollno;
	public Student (String n,int r) {
		name =n;
		rollno=r;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public void displayinfo() {
		System.out.println("Name:"+name	);
		System.out.println("Roll Number:"+rollno);
	}
	public static void main(String [] args) {
		Student s1=new Student("Myat",3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student 2:");
		String name=sc.next();
		System.out.println("Enter roll of student 2:");
		int rollno=sc.nextInt();
		Student s2 = new Student(name,rollno);
		s1.setName("Mon");
		s1.setRollno(7);
		s1.displayinfo();
		s2.displayinfo();
	
		
	}
}
