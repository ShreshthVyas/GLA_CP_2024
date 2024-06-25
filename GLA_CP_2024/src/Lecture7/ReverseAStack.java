package Lecture7;

import java.util.Stack;

public class ReverseAStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		
		Reverse(st);
		
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int val =st.pop();
		Reverse(st);
		iab(st, val);
	}
	
	public static void iab(Stack<Integer> st ,int n) {
		if(st.isEmpty()) {
			st.push(n);
			return;
		}
		int val =st.pop();
		iab(st, n);
		st.push(val);
	}


}
