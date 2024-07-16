package collections;

import java.util.*;

public class LinkedLists {
	
	//Java LinkedList class uses a doubly linked list to store the elements.
	//It provides a linked-list data structure. 
	//It inherits the AbstractList class and implements List and Deque interfaces.
	
//	The important points about Java LinkedList are:
	
	//Java LinkedList class can contain duplicate elements.
	//Java LinkedList class maintains insertion order.
	//Java LinkedList class is non synchronized.
	//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
	//Java LinkedList class can be used as a list, stack or queue.

	public static void main(String[] args) {
		
		LinkedList<String> arr = new LinkedList<String>();
		
		arr.add("Srinu");
		arr.add("Mahesh");
		arr.add("Vishnu");
		
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Traverse list in reverse Order
		System.out.println();
		
		it = arr.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		LinkedList<String> array = new LinkedList<>();
		
		array.add("first");
		array.add("Second");
		
		arr.addAll(array);
		
		System.out.println(arr);
		
		arr.add(1, "third");
		
		System.out.println(arr);
		
		arr.addFirst("Fourth");
		
		System.out.println(arr);
		
		arr.addLast("Fifth");
		System.out.println(arr);
		
		arr.remove("Fourth");
		System.out.println(arr);
		
		arr.remove(1);
		
		System.out.println(arr);
		
		arr.removeAll(array);
		System.out.println(arr);
		
		arr.removeFirst();
		System.out.println(arr);
		
		arr.removeLast();
		System.out.println(arr);
		
		arr.clear();
		System.out.println(arr);
		
		

	}

}
