package chapter7Exe;

public class Distance {
	private int feet;
	private float inches;
	public Distance () {
		feet = 0; 
		inches = 0.0f;
	}
	public Distance(int feet,float inches) {
		this.feet=feet;
		this.inches=inches;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public float getInches() {
		return inches;
	}
	public void setInches(float inches) {
		this.inches = inches;
	}
	public Distance add(Distance d) {
		int totalFeet = this.feet+d.feet;
		float totalInches=this.inches+d.inches;
		if(totalInches>=12) {
			totalFeet += (int) (totalInches/12);
			totalInches = totalInches %12;
			Distance sum = new Distance (totalFeet,totalInches);
			return sum;
		}
		return d;
		}
	
		public String toString() {
			return feet+ " ',"+ inches + "''";
			}
}

	
