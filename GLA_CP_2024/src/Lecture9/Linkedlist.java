package Lecture9;

public class Linkedlist {

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
	
	//O(1)
	public int getSize() {
		return this.size;
	}
	//O(1)
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
	//O(1)
	public void addAtFirst(int val) {
		Node nn =  new Node(val);
		if(head == null) { //size == 0
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}
	//O(n)
	public void removeLast() throws Exception {
		if(head==null) {
			throw new Exception("LL is empty");
		}
		if(head.next == null) {
			this.head = null;
			this.tail =null;
			this.size--;
			return;
		}
		Node temp = this.head;
		while(temp.next!=tail) {
			temp = temp.next;
		}
		temp.next = null;
		this.tail =temp;
		this.size--;
	}
	
	//O(1)
	public void removeFirst() throws Exception {
		if(head==null) {
			throw new Exception("LL is empty");
		}
		if(head.next == null) {
			this.head = null;
			this.tail =null;
			this.size--;
			return;
		}
		Node temp = this.head.next;
		this.head.next =null;
		this.head = temp;
		this.size--;
	}
	
	public void Display() {
		Node temp =this.head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	

}
