interface StudentFee {
    float getAmount();

    String getFirstName();

    String getLastName();

    String getAddress();

    int getContact();
}

class Hostler implements StudentFee {
    float amount;
    String firstName;
    String lastName;
    String address;
    int contact;

    Hostler(float amount, String firstName, String lastName, int contact, String address) {
        this.amount = amount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.address = address;
    }

    public float getAmount() {
        return amount;
    }
    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public int getContact() {
        return contact;
    }

    
    public String getAddress() {
        return address;
    }
}

class nonHostler implements StudentFee {
    float amount;
    String firstName;
    String lastName;
    String address;
    int contact;

    nonHostler(float amount, String firstName, String lastName, int contact, String address) {
        this.amount = amount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.address = address;
    }

    
    public float getAmount() {

        return amount;
    }

    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public int getContact() {
        return contact;
    }

    
    public String getAddress() {
        return address;
    }
}

public class java06 {
    public static void main(String[] args) {
        Hostler h1 = new Hostler(25000f, "surya", "prakash", 654948840, "Hyderabad");
        System.out.println("firstName: " + h1.getFirstName());
        System.out.println("lastName: " + h1.getLastName());
        System.out.println(h1.firstName + " Payment money:" + h1.getAmount());
        System.out.println(h1.firstName + " Address: " + h1.getAddress());
        System.out.println(h1.firstName + " Contact: " + h1.getContact());

        nonHostler r1 = new nonHostler(20000f, "sriknath", "devendla", 987493720, "Sangareddy");
        System.out.println("firstName: " + r1.getFirstName());
        System.out.println("lastName: " + r1.getLastName());
        System.out.println(r1.firstName + " Payment money:" + r1.getAmount());
        System.out.println(r1.firstName + " Address: " + r1.getAddress());
        System.out.println(r1.firstName + " Contact: " + r1.getContact());
    }
}
