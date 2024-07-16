package Lecture16;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //max heap
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(60);
		
		int rv = pq.remove();
		System.out.println(rv);
		
	}

}
