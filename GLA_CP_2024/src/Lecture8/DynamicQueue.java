package Lecture8;

import Lecture7.Queue;

public class DynamicQueue extends Queue {
	
	@Override
	public void Enque(int n) throws Exception {
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int i = 0; i < newarr.length; i++) {
				int idx = (front +i) % arr.length;
				newarr[i]= arr[idx];
 			}
			arr= newarr;
		}
		front =0;
		super.Enque(n);
		
	}
	
	
	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.Enque(10);
		dq.display();
	}
}
