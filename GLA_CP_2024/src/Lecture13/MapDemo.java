package Lecture13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Integer>  map = new HashMap<>();
		//insert 
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		map.put("A", 90);
//		map.put(null, 70);
//		map.put("G", null);
//		System.out.println(map);
//		//contains
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("M"));
//		System.out.println(map.containsKey(null));
//		
//		//get
//		System.out.println(map.get("A"));
//		System.out.println(map.get("B"));
//		System.out.println(map.get(null));
		
//		System.out.println("Start");
//		System.out.println(map.get("X"));
//		System.out.println("end");
		
		//O(1)
//		map.remove("A");
//		map.remove("B");
//		
//		System.out.println(map);
		
//		for (String s : map.keySet()) {
//			System.out.println(map.get(s));
//		}
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		lmap.put("A" , 10);
		lmap.put("B" , 20);
		lmap.put("C" , 30);
		lmap.put("D" , 40);
		lmap.put("E" , 50);
		lmap.put("A" , 60);
		
//		System.out.println(lmap);
		
		TreeMap<String, Integer> tmap = new TreeMap<>();
		
		tmap.put("A", 10);
		tmap.put("B", 20);
		tmap.put("D", 30);
		tmap.put("C", 40);
		
		System.out.println(tmap);
		
		
		
	}

}
