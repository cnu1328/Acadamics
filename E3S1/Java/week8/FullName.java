package fullname.HelloWorld;
import fullname.FirstName;
import fullname.LastName;

public class FullName {
    public static void main(String[] args) {
	FirstName f = new FirstName();
	LastName l = new LastName();

	System.out.println("Full Name : " + f.getFirstName() + " " + l.getLastName());
    }
}