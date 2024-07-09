package Lecture13;

import java.util.HashMap;

public class MaxFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character ,Integer>  map = new HashMap<>();
		String s = "AabcdsAAAbbc";
		
		for (Character ch : s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
