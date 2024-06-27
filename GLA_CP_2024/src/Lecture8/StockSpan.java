package Lecture8;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {30,35,40,38,35,39};
		Stack<Integer> st = new Stack<>();
		int ans[] = new int[arr.length];
		
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty()  && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) { // mere se pehle all elements are smaleler
				ans[i] = i+1;
			}
			else {
				ans[i] = i- st.peek();
			}
			st.push(i);
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
