class Vechile {
	int vechile;
	int insurance;
	String color;
	
	Vechile(int vechile, int insurance, String color) {
		this.vechile = vechile;
		this.insurance = insurance;
		this.color = color;
	}
	

	String getConsumption() {
		return "Vechile Consumed 5km";
	}

	void displayConsumption() {
		System.out.println(getComsumption());
	}

}

class TwoWheeler extends Vechile {
	Vechile(int vechile, int insurance, String color) {
		super(vechile, insurance, color);
	}

	void maintenane() {
		System.out.println("Two Wheeler Maintenance");
	}

	void average() {
		System.out.println("Two Wheeler Average");
	}
}

class Company extends TwoWheeler {
	
}

class FourWheeler extends Vechile {
	Vechile(int vechile, int insurance, String color) {
		super(vechile, insurance, color);
	}

	void maintenane() {
		System.out.println("Two Wheeler Maintenance");
	}

	void average() {
		System.out.println("Two Wheeler Average");
	}
}

class OperateVechile {
    public static void main(String[] agrs) {
	
    }
}