package javaPackage;

public class Circle {
	private double radius;
	 
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 2 * 3.14 * radius * radius;
	}
	
	public double getCircumference() {
		return 2*3.14*radius;
	}
}
