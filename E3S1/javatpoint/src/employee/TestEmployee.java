package employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		employee e1 = new employee();
		employee e2 = new employee();
		employee e3 = new employee();
		
		e1.insert(10, "Srinu", 1000);
		e2.insert(11, "vishnu", 4000);
		e3.insert(12, "sathyanarayana", 5000);
		
		e1.display();
		e2.display();
		e3.display();
		
	}
}
