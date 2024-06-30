package Lecture9;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addAtLast(10);
		ll.addAtLast(20);
		ll.addAtLast(30);
		ll.addAtLast(40);
		ll.addAtLast(50);
		ll.Display();
		ll.removeLast();
		ll.Display();
		ll.addAtFirst(50);
		ll.Display();
		ll.removeFirst();
		ll.Display();
		System.out.println(ll.getSize());
	}

}
