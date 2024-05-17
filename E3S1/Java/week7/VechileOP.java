interface Vechile {
	String getColor();
	int getNumber();
	int getConsumption();
}

class Two implements Vechile {
 	int number;
	String color;
	int fuel;

	Two(int number, String color, int fuel) {
	    this.number = number;
	    this.color = color;
	    this.fuel = fuel;
	}
	
	public String getColor() {
		return color;
	}

	public int getNumber() {
		return number;
	}

	public int getConsumption() {
		return fuel;
	}

	void display() {
		System.out.println("Vechile Number : " + getNumber());
		System.out.println("Vechile Color : " + getColor());
		System.out.println("Vechile Consumed : " + getConsumption());

	}
}

class Four implements Vechile {
 	int number;
	String color;
	int fuel;

	Four(int number, String color, int fuel) {
	    this.number = number;
	    this.color = color;
	    this.fuel = fuel;
	}
	
	public String getColor() {
		return color;
	}

	public int getNumber() {
		return number;
	}

	public int getConsumption() {
		return fuel;
	}

	void display() {
		System.out.println("Vechile Number : " + getNumber());
		System.out.println("Vechile Color : " + getColor());
		System.out.println("Vechile Consumed : " + getConsumption());

	}
}

public class VechileOp {
    public static void main(String[] args) {
	Two t = new Two(12, "White", 23);
	t.display();

	Four t1 = new Four(13, "Balck", 23);
	t1.display();
    }
}






