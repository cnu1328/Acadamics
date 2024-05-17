
import java.util.Scanner;
import java.util.*;

class Dog {
	private String name;
	private String breed;
	private String color;
	private double height;
	private String type;

	Dog(String name, String breed, String color, double height, String type) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.height = height;
		this.type = type;
	}

	String getName() {
		return name;
	}

	String getBreed() {
		return breed;
	}

	String getColor() {
		return color;
	}

	String getType() {
		return type;
	}		
	
	double getHeight() {
		return height;
	}
	
}

public class Kennel {
    public static void main(String[] args) {
	ArrayList<Dog> dogs = new ArrayList<>();

	dogs.add(new Dog("snoopy", "Pomeranian", "White", 1, "Guard dog"));
	dogs.add(new Dog("rocky", "Labrador", "Brown", 3, "Sniffer dog"));
	dogs.add(new Dog("snowy", "GermanShepherd", "Black", 4, "Shepherd dog"));

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Breed of the Dog : ");
	String breed = sc.nextLine();
	System.out.print("Enter Type of the Dog : ");
	String type = sc.nextLine();
	System.out.print("Enter Height of the Dog : ");
	double height = sc.nextDouble();

	boolean flag = true;
	
	for(int i=0; i<dogs.size(); i++) {
		if(breed.equalsIgnoreCase(dogs.get(i).getBreed()) && type.equalsIgnoreCase(dogs.get(i).getType()) && height == dogs.get(i).getHeight()) {
			System.out.println("Adopt " + dogs.get(i).getName());
			flag = false;
		}
	}

	if(flag) {
		System.out.println("Desired Dog not found!");
	}
    }
}