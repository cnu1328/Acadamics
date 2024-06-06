package shapes;

public class Circle{
    
    private double pi = 3.14;
    
    public double Area(double r) {
    	return 2 * pi * r * r;
    }
    
    public double Circum(double r) {
        return 2 * pi * r;
    }

}
