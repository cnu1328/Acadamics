package inheritance;

class Address {
	String city, state, country;
	
	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class Emp {
	
	int emp_id;
	String emp_name;
	
	Address address;
	
	Emp(int emp_id, String emp_name, Address address) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.address = address;
	}
	
	void display() {
		System.out.println(emp_id + "   " + emp_name);
		System.out.println(address.city +"   " + address.state + "    " + address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1 = new Address("Nizamabd", "Telangana", "India");
		Address ad2 = new Address("Nirmal", "Telangana", "India");
		
		Emp e1 = new Emp(123, "Srinu", ad1);
		Emp e2 = new Emp(1234, "Srinivas", ad2);
		
		e1.display();
		System.out.println();
		e2.display();
				

	}

}
