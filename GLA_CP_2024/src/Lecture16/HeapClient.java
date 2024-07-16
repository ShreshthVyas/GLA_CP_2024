package Lecture16;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h = new Heap();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(7);
		
		h.Display();
		System.out.println(h.get());
		System.out.println(h.size());
		
		System.out.println(h.remove());
		h.Display();
	}

}
