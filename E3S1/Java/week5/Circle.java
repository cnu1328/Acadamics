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

	public static void main(String[] args) {
		Circle c = new Circle(2);
		System.out.println(c.getArea());
		System.out.println(c.getCircumference());
	}
}