package shapes;

public class Rectangle {

    double a,b;
    public Rectangle(double a, double b) {
    	this.a = a;
    	this.b = b;
    }
    public double Area(double a, double b) {
    	return a*b;
    }
    
    public double Area() {
    	return a*b;
    }
    
    public double Perimeter() {
        return 2*(a+b);
    }
    
    public double Perimeter(double a, double b) {
        return 2*(a + b);
    }

}
