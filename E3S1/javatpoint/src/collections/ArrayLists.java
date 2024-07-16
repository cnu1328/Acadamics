package collections;

import java.util.*;
import java.io.*;

class Student {
	String name;
	int roll, age;
	
	Student(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
}


public class ArrayLists {
	
	//The ArrayList class implements the List interface. 
	//It uses a dynamic array to store the duplicate element of different data types.
	//The ArrayList class maintains the insertion order and is non-synchronized.
	//The elements stored in the ArrayList class can be randomly accessed.

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Srinu");
		arr.add("Vishnu");
		arr.add("Shashi");
		
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(arr);
		
		for(String s : arr)
			System.out.print(s + " ");
		
		System.out.println("\n\nSecond element of arr is : " + arr.get(1));
		
		arr.set(1, "Bashnu");
		
		Collections.sort(arr);
		
		System.out.println("\n" + arr);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=5; i>=0; i--) 
			num.add(i);
		
		System.out.println("\nBefore Sort : " + num);
		
		Collections.sort(num);
		System.out.println("\nAfter Sort : " + num);
		
		
//		User-defined class objects in Java ArrayList
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("srinu", 10, 20));
		list.add(new Student("Vishnu", 10, 20));
		list.add(new Student("Mahesh", 10, 20));
		
		for(Student s : list) {
			System.out.println(s.roll + " " + s.name + " " + s.age);
		}
		
//		Collections.sort(list);
		
		list.remove(2);
		
		System.out.println();
		for(Student s : list) {
			System.out.println(s.roll + " " + s.name + " " + s.age);
		}
		
		
//		Java ArrayList Serialization and Deserialization Example
		
		//Let's see an example to serialize an ArrayList object and then deserialize it.
		
		
		
		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("Srinu");
		arrayString.add("Madhu");
		arrayString.add("Vishnu");
		
		
		try {
			//Serialization
			
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arrayString);
			
			fos.close();
			oos.close();
			
			//Deserialization
			
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList array = (ArrayList)ois.readObject();
			System.out.println(array);
			
			fis.close();
			ois.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
//		Java ArrayList example to add elements
		
		arrayString.add(1, "srinu");
		
		System.out.println(arrayString);
		
		arrayString.addAll(arr);
		
		System.out.println(arrayString);
		
//		Java ArrayList example to remove elements
		
		arrayString.removeAll(arr);
		System.out.println(arrayString);
		
		arrayString.remove("Vishnu");
		System.out.println(arrayString);
		
		arrayString.remove(1);
		System.out.println(arrayString);
		
		arrayString.clear();
		System.out.println(arrayString);
		
		boolean bool = arrayString.isEmpty();
		System.out.println(bool);
		
//		Size and Capacity of an ArrayList
		
		arrayString.add("srinu");
		System.out.println(arrayString.size());
		
	}

}
