package Lecture7;

public class Queue {
	
	private int arr[];
	private int front =0;
	private int size = 0;

	public Queue() {
		this.arr = new int[5];
		
	}
	public Queue(int size) {
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == arr.length;
	}
	
	public void Enque(int n) throws Exception {
		if(isFull()) {
			throw new Exception("Queue full ho chuki h");
		}
		int idx = (front+size)% arr.length;
		arr[idx] = n;
		size++;
	}
	
	public int Deque() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int val = arr[front];
		arr[front] =0;
		front = (front+1) % arr.length;
		this.size--;
		return val;
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front+i) % arr.length;
			System.out.print(arr[idx]+ " ");
		}
		System.out.println();
	}
	

}
