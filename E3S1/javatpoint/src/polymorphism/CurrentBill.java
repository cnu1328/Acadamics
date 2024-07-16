package polymorphism;

class Domestic {
	String name;
	
	void setNameUnit(String name) {
		this.name = name;
	}
	
	void calculate(int units) {
		System.out.println(name + "  " + units*5);
	}
	
}

class Commercial extends Domestic {	
	void calculate(int units) {
		System.out.println(name + "  " + 200*units);
	}
}

public class CurrentBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Domestic d = new Domestic();
		d.setNameUnit("srinu");
		d.calculate(10);
		
		Domestic di = new Commercial();
		di.setNameUnit("Narendhar");
		di.calculate(20);
		
		
		

	}

}
