package javaPackage;

public class Cir {
	private double radius;
	 
	public Cir(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 2 * 3.14 * radius * radius;
	}
	
	public double getCircumference() {
		return 2*3.14*radius;
	}
}