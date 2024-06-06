import java.util.*;

interface Product {
	String getProductName();
	double getPrice();
}

class Book implements Product {
	String productName;
	double price;
	String author;

	Book(String name, double price, String author) {
		productName = name;
		this.price = price;
		this.author = author;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
}

class Electronic implements Product {
	String productName;
	double price;
	String manufacturer;

	Electronic(String name, double price, String author) {
		productName = name;
		this.price = price;
		this.manufacturer = author;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
}

class ShoppingCart {

	ArrayList<Product> cart;

	ShoppingCart() {
		cart = new ArrayList<>();
	}
	
	void addProduct(Product pt) {
		cart.add(pt);
		System.out.println(pt.getProductName() + " added to cart.");
	}

	void allProducts() {
		System.out.println("Products in the Shopping Cart : ");
		double total = 0;
		for(int i=0; i<cart.size(); i++) {
			System.out.println("Name : " + cart.get(i).getProductName() + ", Price : $" + cart.get(i).getPrice()); 
			total += cart.get(i).getPrice();
		}

		System.out.println("Total Price : $" + total);
	}

	
}

public class OnlineShopping {
    public static void main(String[] agrs) {
	ShoppingCart cart = new ShoppingCart();

	Book book1 = new Book("The Catcher in the Rye", 25.0, "J.D. Salinger");
        Electronic electronic1 = new Electronic("Laptop", 899.99, "Manufacturer XYZ");
        Book book2 = new Book("To Kill a Mockingbird", 20.0, "Harper Lee");

	cart.addProduct(book1);
	cart.addProduct(electronic1);
	cart.addProduct(book2);

	cart.allProducts();
    }
}