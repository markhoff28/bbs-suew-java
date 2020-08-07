package taschenrechner;

public class Calculator {
	double a, b, c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void count(){
		c = getA() + getB();
		System.out.println("Addition: " + c);
		c = getA() - getB();
		System.out.println("Subtraktion: " + c);
		c = getA() * getB();
		System.out.println("Multipliion: " + c);
		c = getA() / getB();
		System.out.println("Division: " + c);
		c = getA() % getB();
		System.out.println("Modulu: " + c);
	}

}
