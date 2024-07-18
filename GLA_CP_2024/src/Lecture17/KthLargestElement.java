package Lecture17;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);
		}
		
		for (int i = k; i < nums.length; i++) {
			if(nums[i]>pq.peek()) {
				pq.remove();
				pq.add(nums[i]);
			}
		}
		
		return pq.peek();
	}

}
