package Lecture13;

import java.util.HashMap;

public class LongestConsecutiveSequenceLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestConsecutive(int[] nums) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]-1)) {
				map.put(nums[i], false);
			}
			else {
				map.put(nums[i], true);
			}
			if(map.containsKey(nums[i]+1)) {
				map.put(nums[i]+1, false);
			}
		}
		int ans =0;
		for (Integer i : map.keySet()) {
			if(map.get(i) == true) { //starting point ban sakta h
				int c =0;
				while(map.containsKey(i)) {
					c++;
					i++;
				}
				ans = Math.max(ans, c);
			}
		}
		
		return ans;
	}

}
