package javaPackage;

public class GeomertyGame {

    public static void main(String[] args) {
	
	Rect rec = new Rect(2, 3);
		
	System.out.println("Area of Rectangle : " + rec.getArea());
	System.out.println("Perimeter of Rectangle : " + rec.getPerimeter());
		
	Cir cir = new Cir(10);
		
	System.out.println("Area of Cirlce : " + cir.getArea());
	System.out.println("Circumference of Circle : " + cir.getCircumference());
	
    }

}