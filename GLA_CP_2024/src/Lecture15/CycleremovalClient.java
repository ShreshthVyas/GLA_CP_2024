package Lecture15;

public class CycleremovalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleRemovalLL ll = new CycleRemovalLL();
		ll.addAtLast(1);
		ll.addAtLast(2);
		ll.addAtLast(3);
		ll.addAtLast(4);
		ll.addAtLast(5);
		ll.addAtLast(6);
		ll.addAtLast(7);
//		ll.Display();
		ll.createCycle();
//		ll.removecycle();
//		ll.removecycle2();
		ll.FloydCycle();
		ll.Display();
	}

}
