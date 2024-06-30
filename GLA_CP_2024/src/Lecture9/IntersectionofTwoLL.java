package Lecture9;

import Lecture9.Reverse.ListNode;

public class IntersectionofTwoLL {
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
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode A = headA;
	        ListNode B = headB;
	        
	        while(A!=B) {
	        	if(A == null) {
	        		A = headB;
	        	}
	        	else {
	        		A =A.next;
	        	}
	        	if(B == null) {
	        		B = headA;
	        	}
	        	else {
	        		B =B.next;
	        	}
	        }
	        
	        return A;
	    }
	}

}
