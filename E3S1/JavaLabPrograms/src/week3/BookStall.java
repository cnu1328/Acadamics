package week3;

class Book {
	private String book_name;
	private String book_author;
	private int count = 0;
	
	Book(String book_name, String book_author, int count) {
		this.book_name = book_name;
		this.book_author = book_author;
		this.count = count;
	}
	
	public String getName() {
		return book_name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void reduceCount(int amount) {
		count -= amount;
	}
}

class Customer {
	private int id;
	private String cus_name;
	private String address;
	
	Customer(int id, String cus_name, String address) {
		this.id = id;
		this.cus_name = cus_name;
		this.address = address;
	}
	
	void buyBook(Book book, int quantity) {
		if(quantity <= book.getCount()) {
			book.reduceCount(quantity);
			
			System.out.println("Customer " + cus_name + " bought " + quantity + " copies of "
					+ book.getName() + ". Remaining count: " + book.getCount()
			);
		}
		else {
            System.out.println("Insufficient stock for " + book.getName());
        }
	}
	
}

public class BookStall {

	public static void main(String[] args) {
		
		Book Java = new Book("Java Programming Language", "Srinivas", 10);
		Book Cpp = new Book("C Plus Plus programming Language", "Srinivas", 20);
		
		Customer c1 = new Customer(1, "Dharpally Srinivas", "Chengal, Bheengal, Nizamabad");
		Customer c2 = new Customer(2, "Puduri Vishnu", "Jagityal");
		
		c1.buyBook(Cpp, 3);
		c2.buyBook(Java, 5);
		

	}

}
