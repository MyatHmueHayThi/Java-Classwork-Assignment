package chapter7Exe;

class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num,int deno) {
		setNumerator(num);
		setDenominator(deno);
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public String toString() {
		return getNumerator() +"/"+getDenominator();
	}
	public Fraction add(Fraction frac) {
		int a,b,c,d;
		a=this.getNumerator();
		b=this.getDenominator();
		c=frac.getNumerator();
		d=frac.getDenominator();
		Fraction sum=new Fraction(a*d+c*b,b*d);
		return sum;
	}
	public static void main(String [] args) {
		Fraction f1,f2,f3;
		f1 = new Fraction(1,2);
		f2 = new Fraction(1,4);
		f3 = f1.add(f2);
		System.out.println("Sum of "+f1.toString()+" and "+f2.toString()+ " is "+f3.toString());
	}
}
