package inheritance;

class Operation {
	
	int square(int n) {
		return n*n;
	}
}

public class Agreegation {
	
	Operation op; //Aggregation - Has a relationShip
	double pi = 3.14;
	
	double area(int radius) {
		op = new Operation();
		
		double rsquare = op.square(radius);
		
		return pi*rsquare;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agreegation ag = new Agreegation();
		
		double result = ag.area(4);
		System.out.println("Area of the circle is : " + result);
		System.out.println("Area of the Circle is : " + ag.area(4));

	}

}
