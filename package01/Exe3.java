package package01;

import java.util.Scanner;

import javax.swing.JFrame;

public class Exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter your first name:");
		String firname=sc.nextLine();
		System.out.println("Enter your last name:");
		String lastname=sc.nextLine();
		JFrame myFrame = new JFrame(lastname +","+firname);
		myFrame.setSize(300,400);
		myFrame.setVisible(true);
		
	}

}
