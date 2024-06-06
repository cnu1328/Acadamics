import java.util.Scanner;

// package Week 3;
class Product {
    private int id;
    String name;
    double quantity;
    double price;

    Product(int id, String name, double quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

}

public class java02mailOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] P = new Product[5];
        P[0]=new Product(1, "PRODUCT1", 0, 99.90);
        P[1]=new Product(2, "PRODUCT2", 0, 20.20);
        P[2]=new Product(3, "PRODUCT3", 0, 6.87);
        P[3]=new  Product(4, "PRODUCT4", 0, 45.50);
        P[4]=new Product(5, "PRODUCT5", 0, 40.49);
        int stop=1;
        while(stop!=-1){
            
             System.out.print("Enter 1 to set quanttity and -1 to exit:");
            stop=sc.nextInt();
            if(stop==-1)
            break;
            System.out.print("Enter product id:");
            int id=sc.nextInt();
            System.out.print("Enter prouct qunatity:");
            double quan=sc.nextDouble();
            switch(id)
            {
                case 1:
                  P[0].quantity=quan;
                  break;
                case 2:
                  P[1].quantity=quan;
                  break;
                case 3:
                  P[2].quantity=quan;
                  break;
                case 4:
                  P[2].quantity=quan;
                  break;
                case 5:
                  P[2].quantity=quan;
                  break;
            }
        }
        

      double totalPrice=0;
      for(int i=0;i<5;i++)
      {
        totalPrice=totalPrice+(P[i].quantity*P[i].price);
      }

    System.out.println("The Total Price is:"+totalPrice);

    }
}
