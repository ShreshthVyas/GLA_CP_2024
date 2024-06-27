package Lecture8;

import Lecture7.Stack;

public class DynamicStack extends Stack {
	
	@Override
	public void push(int n) throws Exception{
		if(isFull()) {
			int newarr[] = new int[2* arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		
		super.push(n);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(11);
		ds.push(12);
		ds.push(13);
		ds.push(14);
		ds.push(15);
		ds.push(16);
		ds.push(17);
		ds.push(18);
		ds.display();
	}

}
