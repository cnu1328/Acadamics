package packages;

import javaPackage.*;

public class Shape {

	public static void main(String[] args) {
		
		
		Rectangle rec = new Rectangle(2, 3);
		
		System.out.println("Area of Rectangle : " + rec.getArea());
		System.out.println("Perimeter of Rectangle : " + rec.getPerimeter());
		
		Circle cir = new Circle(10);
		
		System.out.println("Area of Cirlce : " + cir.getArea());
		System.out.println("Circumference of Circle : " + cir.getCircumference());
	
	}

}
