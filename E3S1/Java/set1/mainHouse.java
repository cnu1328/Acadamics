
import java.util.*;

class Product {
	int id;
	String name;
	int quantity;
	double price;

	Product(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	double buyProduct(int quant) {
		double total = 0;
		if(quant <= quantity) {	
			quantity -= quant;
			total += quant*price;

		} else {
			System.out.println("No products to buy");
		}
	}
	
	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}

	
}

public class mainHouse {
    ArrayList<Product> product = new ArrayList<>();
    ArrayList<Product> purchased = new ArrayList<>();

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	product.add(1, "Widget A", 100, 99.90);
	product.add(2, "Gizmo B", 150, 20.20);
	product.add(3, "Doodad C", 200, 6.87);
	product.add(4, "Thingamajig D", 120, 45.50);
	product.add(5, "Whatchamacallit E", 80, 40.49);

	while(ture) {
		System.out.println("Enter [1-5] to purchase a product or 0 to exit from purchase :  ");
		int id = sc.nextInt();
		System.out.println("Enter Quantitiy of the product : ");
		int quant = sc.nextInt();

		if(id == 0) break;

		if(id < 1 || id > 5) System.out.println("Plase Choose the products with in the Range of 1 to 5 both exclusive");

		double total = product.get(id-1).buyProduct(quant);

		if(total != 0.0) {
			displayCart();
		}

		System.out.println("Items Present In the Stock : ");
		displayItems();

		
 	}
    }
    
    void displayCart() {
	double total = 0;

	System.out.println("Products Purchased : ");

	for(int i=0; i<products.size(); i++) {
		System.out.println("	productId : " + products.get(i).getId() + ", Product Name : " + products.get(i).getName());
		total += products.get(i).getPrice();
	}
	System.out.println("Total Bill : " + total);
    }
}