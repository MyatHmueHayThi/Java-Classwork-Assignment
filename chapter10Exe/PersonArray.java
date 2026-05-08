package chapter10Exe;

import java.util.Scanner;

public class PersonArray {

	public static void main(String[] args) {
		Person person[]  = new Person[3];
		Scanner sc = new Scanner (System.in);
		String name,inpstr;
		char gender;
		int age;
		sc.useDelimiter(System.getProperty("line.sperator"));
		for(int i=0;i<person.length;i++) {
			System.out.print("Enter name: ");
			name=sc.next();
			System.out.print("Enter age: ");
			age=sc.nextInt();
			System.out.print("Enter gender: ");
			inpstr = sc.next();
			gender = inpstr.charAt(0);
			
		   person[i] = new Person();
		   person[i].setName(name);
		   person[i].setAge(age);
		   person[i].setGender(gender);
			
		}
		float sum=0;
		for(int i=0;i<person.length;i++) {
			sum+=person[i].getAge();
		}
		float avg=sum/person.length;
		System.out.print("Average Age: "+avg);
	}

}
