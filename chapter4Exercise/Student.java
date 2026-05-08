package chapter4Exercise;

public class Student {
	private String name;
	private String email;
	
	public Student() {
		name="Unknown";
		email="Unassigned";
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
