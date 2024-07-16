package basics;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;

public class Maps {
	
	public static void main(String[] args) {
		 Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		 //HashMap stores unique elements if the key value assigns if 
		 //key already exists the value updates with new value
		 //Sorts based on key
		 mp.put(6, 2);
		 mp.put(4, 3);
		 mp.put(3,  4);
		 mp.put(3, 5);
		 
		 System.out.println(mp.containsValue(2));
		 System.out.println(mp.containsKey(3));
		 System.out.println(mp.values());
		 System.out.println(mp.keySet());
		 System.out.println(mp.size());
		 System.out.println(mp.isEmpty());
		 mp.clear();
		 System.out.println(mp.size());
		 System.out.println(mp);
		  
		 Map<String, Integer> tmap = new TreeMap<String, Integer>();
		 
		 tmap.put("Srinu", 1);
		 tmap.put("Arun", 2);
		 tmap.put("Mahesh", 5);
		 tmap.put("Srin", 5);
		 
		 System.out.println(tmap);
		 
		 Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		 
		 map.put("Srinu", 1);
		 map.put("Arun", 2);
		 map.put("Mahesh", 5);
		 map.put("Srin", 5);
		 
		 System.out.println(map);
		 
		 //Example: Frequency of characters in a string
		 
		 String s = "hello my name Srinivas, I'm good at programming";
		 System.out.println(s.toCharArray());
		 
		 Map<Character, Integer> freq = new HashMap<Character, Integer>();
		 
		 for(char c : s.toCharArray()) {
			 if(freq.containsKey(c)) {
				 freq.put(c, freq.get(c) + 1);
			 }
			 
			 else {
				 freq.put(c, 1);
			 }
		 }
		 freq.remove(' ');
		 System.out.println(freq);
		 
		 
		 
		 
		 
	}
}
