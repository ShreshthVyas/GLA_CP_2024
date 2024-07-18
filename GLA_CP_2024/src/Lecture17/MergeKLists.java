package Lecture17;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode>  pq = new PriorityQueue<>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		}); 
		
		for (ListNode node : lists) { // add all head to pq
			if(node!=null) {
				pq.add(node);
			}
		}
		
		ListNode dummy =  new ListNode();
		ListNode temp = dummy;
		
		while(!pq.isEmpty()) {
			ListNode node =pq.remove();
			dummy.next = node;
			dummy = dummy.next;
			if(node.next!=null) {
				pq.add(node.next);
			}
			
		}
		
		return temp.next;
	}

}
