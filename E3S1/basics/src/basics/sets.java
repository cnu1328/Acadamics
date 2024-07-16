package basics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class sets {

	public static void main(String[] args) {
		//Sets and Lists
		
		Set<Integer> set = new HashSet<Integer>();
		//It stores unique elements in any order. No matter of size, it retrieves in O(1);
		//to add elements
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		set.add(3);
		System.out.println(set);
		
		//To remove Elemets
		
		set.remove(3);
		System.out.println(set);
		
		//To search
		
		System.out.println(set.contains(3));
		System.out.println(set.contains(2));
		
		//Size of the set
		
		System.out.println(set.size());
		
		//Know whether the set is empty or not
		
		System.out.println(set.isEmpty());
		
		//To clear all the elements from the set
		set.clear();
		
		System.out.println(set);
		
		//TreeSet
		
		Set<Integer> tree = new TreeSet<Integer>();
		//It is same as HashSet but it is ordered. all elements are ordered in ascending sort
		
		
		tree.add(1);
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(5);
		tree.add(9);
		
		System.out.println(tree);
		
		tree.remove(5);
		
		System.out.println(tree);
		
		System.out.println(tree.size());
		
		System.out.println(tree.isEmpty());
		
		System.out.println(tree.contains(5));
		
		System.out.println(tree.contains(9));
		
		//LinkedHashSet
		
		Set<Integer> link = new LinkedHashSet<Integer>();
		//It same like HashSet but faster
		link.add(-2);
		link.add(-5);
		link.add(5);
		link.add(1);
		
		System.out.println(link);
	
		System.out.println(link.remove(0));
		
		System.out.println(link.remove(5));
		System.out.println(link);
		
		System.out.println(link.isEmpty());
		
		System.out.println(link.size());
		
		link.clear();
		
		System.out.println(link);  
		
		//Lists
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//It is same as vector in c++;
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(0);
		
		System.out.println(arr);
		
		//Indexing
		
		System.out.println(arr.get(4));
		
		//Changeing values in the arrayList;
		
		arr.set(4, 5);
		
		System.out.println(arr);
		
		//size
		
		System.out.println(arr.size());
		
		arr.remove(0);
		
		System.out.println(arr);
		
		//check empty or not
		
		System.out.println(arr.isEmpty());
		
		System.out.println(arr.subList(1,3));
		
		LinkedList<Integer> mon = new LinkedList<Integer>();
		
		//We do the same operations of ArrayList
		
		for(int i=0; i<5; i++) {
			mon.add(i+1);
		}
		
		
		System.out.println(mon);
		mon.remove(4); //If index out of Bounds it gives error
		System.out.println(mon);
		mon.set(3, 5);
		System.out.println(mon);
		System.out.println(mon.get(3));
		System.out.println(mon.size());
		System.out.println(mon.subList(0, 3));
		
		
		
		
		
		
		
		
		
	}

}
