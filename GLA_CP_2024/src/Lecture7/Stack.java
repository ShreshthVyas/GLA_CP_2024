package Lecture7;

import java.util.Arrays;

public class Stack {

	private int arr[];
	private int top = -1;

	public Stack() {
		this.arr = new int[5];
	}

	public Stack(int size) {
		this.arr = new int[size];
	}
	
	//O(1)
	public boolean isEmpty() {
		return top==-1;
	}
	//O(1)
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	//O(1)
	public void push(int n) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		top++;
		arr[top] = n;
	}
	
	//O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int val = arr[top];
		arr[top] = 0;
		top--;
		return val;
	}
	//O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[top];
	}
	//O(1)
	public int size() {
		return top+1;
	}
	
	//O(n)
	public void display() {
		for (int i = top; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public void clear() {
		top =-1;
		int size = this.arr.length;
		this.arr = new int[size];
	}
	
	

}
