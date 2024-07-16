package javaPackage;

public class Rect {
	
	private double length, breadth;
	
	public Rect(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea() {
		return length*breadth;
	}
	
	public double getPerimeter() {
		return 2 * (length + breadth);
	}
}