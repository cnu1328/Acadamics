package rectangle;

public class Area {

	public static void main(String[] args) {
//		Rectangle r1 = new Rectangle();
//		Rectangle r2 = new Rectangle();
		
		Rectangle r1 = new Rectangle(), r2 = new Rectangle();
		
		r1.insert(3, 5);
		r2.insert(4, 5);
		
		r1.calculateArea();
		r2.calculateArea();
	}
}
