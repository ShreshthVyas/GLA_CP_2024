package Lecture15;

public class CycleRemovalLL {

	public class Node{
		int data;
		Node next;
		
		public Node() {
			this.data = -1;
			this.next = null;
		}
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size =0;
	
	public void addAtLast(int val) {
		Node nn =  new Node(val);
		if(head == null) { //size == 0
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			this.tail.next = nn;
			this.tail =nn;
			this.size++;
		}
	}
	
	public void Display() {
		Node temp =this.head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public void createCycle() {
		tail.next = head.next.next;
		//Get kth node and create cycle
	}
	
	public Node middleNode(Node head) {
		Node slow =head;
		Node fast =head;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}
	
	//O(n^2)
	public void removecycle(){
		Node meet = middleNode(head);
		if(meet == null) { //no cycle
			return;
		}
		
		Node start = this.head;
		
		while(start!= null) {
			Node temp = meet;
			while(temp.next!=meet) {
				if(temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
		
	}
	
	//O(n)
	public void removecycle2() {
		Node meet = middleNode(head);
		if(meet == null) { //no cycle
			return;
		}
		
		Node temp = meet;
		int count =1;
		while(temp.next!=meet) { //count the length of cycle
			count++;
			temp = temp.next;
		}
		
		Node fast =head;
		//move fast cycle length times
		for (int i = 0; i <count; i++) {
			fast = fast.next;
		}
		
		Node slow = head;
		//move slow fast together , so that they meet at start point
		while(slow.next!=fast.next) {
			slow =slow.next;
			fast =fast.next;
		}
		fast.next = null;
	}
	
	public void FloydCycle() {
		Node meet = middleNode(head);
		if(meet == null) { //no cycle
			return;
		}
		Node fast = meet;
		Node slow =head;
		while(slow.next!=fast.next) {
			slow =slow.next;
			fast =fast.next;
		}
		fast.next =null;
	}

}
