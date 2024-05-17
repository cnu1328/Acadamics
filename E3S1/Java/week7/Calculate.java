import java.text.DecimalFormat;

abstract class Shape {
    
    abstract double getArea(int a);

    abstract double getVolume(int a);
 
}

class Square extends Shape {
	double getArea(int side) {
		return side*side;
	} 	
	double getVolume(int side) {
		return side*side*side;
	}

}

class Cube extends Shape {
	double getArea(int side) {
		return 6*side*2;
	}
	
	double getVolume(int side) {
		return side*side*side;
	}
	
}

class Cirlce extends Shape {
	double getArea(int radius) {
		return 2*Math.PI*radius*2;
	}

	double getVolume(int radius) {
		return 0;
	}
}

class Sphere extends Shape {
	double getArea(int radius) {
		return 4*Math.PI*(radius*radius);
	}

	double getVolume(int r) {
		return (4/3)*Math.PI*(r*r*r);
	}
}

class Calculate {
    public static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
	Sphere s = new Sphere();
	System.out.println("Area of Square : "+ decfor.format(s.getArea(2)));
	System.out.println("Volume of the Square : " + decfor.format(s.getVolume(2)));
    }
}