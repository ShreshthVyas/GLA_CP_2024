package Lecture15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String,List<String>>  map = new HashMap<>();
//		List<List<String>> ans = new ArrayList<>();
		for (String s : strs) {
			char arr[] = s.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);
			
			if(map.containsKey(key)) {
				map.get(key).add(s);
			}
			else {
				map.put(key, new ArrayList<String>());
				map.get(key).add(s);
			}	
		}
//		for (String str : map.keySet()) {
//			ans.add(map.get(str));
//		}
		return new ArrayList<>(map.values());
	}

}
