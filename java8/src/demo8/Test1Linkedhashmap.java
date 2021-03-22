package demo8;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Test1Linkedhashmap {
public static void main(String[] args) {
	TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
	map.put(115, 10);
	map.put(215, 1);
	map.put(103, 18);
	map.put(345, 56);
	map.put(705, 29);
	for(Entry <Integer, Integer> m : map.entrySet()) {
	System.out.println("Key: "+m.getKey()+ "Value: "+m.getValue());
	}
	map.remove(103);
	System.out.println(map);
	System.out.println("Decending Order: "+map.descendingMap());
	for(Entry <Integer, Integer> m : map.entrySet()) {
		System.out.println("Key: "+m.getKey()+ "Value: "+m.getValue());
	}
	}
}

