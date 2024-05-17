import java.util.*;

class Book {
	private String name;
	private String author;
	private int count;

	Book(String name, String author, int count) {
		this.name = name;
		this.author = author;
		this.count = count;
	}

	String getName() {
		return name;
	}
	
	void setCount(int count) {
		this.count = count; 
	}

	int getCount() {
		return count;
	}

	void display() {
		System.out.println("	Book Name : " + name);
		System.out.println("	Author Name : " + author);
		System.out.println("	Count Name : " + count);
	}
	
}

class Customer {
	private int id;
	private String name;
	private String address;
	private ArrayList<Book> bought;

	Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		bought = new ArrayList<>();
	}

	String getName() {
		return name;
	}

	void buyBook(Book book) {
		if(book.getCount() > 1) {
			book.setCount(book.getCount()-1);	
			bought.add(book);
			System.out.println(name + " bought \'" + book.getName() + "\'. Remaining Books in Library is/are : " + book.getCount());
			
		} else {
			System.out.println("Books, are Not available at this instance of time");
		}
	}

	void booksBought() {
		System.out.println("Books : ");
		for(int i=0; i<bought.size(); i++) {
			System.out.println(bought.get(i).getName() + ", Remaining Count : " + bought.get(i).getCount());
		}
	}
}

public class BookStall {
    public static void main(String[] args) {
	Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 5);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 8);
        Book book3 = new Book("1984", "George Orwell", 3);
	
	System.out.println("Book Details :\n"); 
	book1.display();

	ArrayList<Customer> customers = new ArrayList<>();

	customers.add(new Customer(1, "John", "Address 1"));
	customers.add(new Customer(2, "Alice", "Address 2"));
	customers.add(new Customer(3, "Bob", "Address 3"));

	customers.get(1).buyBook(book1);
	customers.get(1).buyBook(book2);
	customers.get(1).buyBook(book3);

	Scanner sc = new Scanner(System.in);

	System.out.print("\nEnter name of the Customer : ");
	String name = sc.nextLine();

	for(int i=0; i<customers.size(); i++) {
		if(name.equalsIgnoreCase(customers.get(i).getName())) {
			System.out.println(customers.get(i).getName() + ", bought Books list : ");
			customers.get(i).booksBought();
		}
	}


    }
}