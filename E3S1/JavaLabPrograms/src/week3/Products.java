package week3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Products {
	
	private int product_id;
    private String product_name;
    private double price;
    
    Products(int product_id, String product_name, double price) {
    	this.product_id = product_id;
    	this.product_name = product_name;
    	this.price = price;
    }
    
    double getId() {
    	return price;
    }

	public static void main(String[] args) {
		ArrayList<Products> products = new ArrayList<>();
		
		products.add(new Products(1, "Mazza", 99.90));
		products.add(new Products(2, "Pepsi", 20.20));
		products.add(new Products(3, "Bottle", 6.87));
		products.add(new Products(4, "Watch", 45.50));
		products.add(new Products(5, "Mouse", 40.49));
		
		Scanner sc = new Scanner(System.in);
		
		double totalRetailPrice = 0;
		
		for(int i=0; ;i++) {
			System.out.print("Enter product Number [1-5], or 0 to exit : ");

		    int product_id = sc.nextInt();
		    if(product_id == 0)
		    	break;
		    
		    System.out.print("Enter sold Quantity of this product : ");

		    int quantity = sc.nextInt();
		    
		    double retailPrice = 0;

		    System.out.println("\n");
		    
		    switch(product_id) {
				case 1:
					retailPrice = products.get(0).price;
				case 2: 
					retailPrice = products.get(1).price;
				case 3: 
					retailPrice = products.get(2).price;
				case 4:
					retailPrice = products.get(3).price;
	
				case 5: 
					retailPrice = products.get(4).price;
				
				default:
					System.out.println("The product Id Should be between [1-5]");

		    }
		    
		    retailPrice = retailPrice*quantity;
		    totalRetailPrice += retailPrice;
		    
		    
		}
		
	    System.out.println("Total Value of all Products Sold : " + totalRetailPrice);


	}

}
