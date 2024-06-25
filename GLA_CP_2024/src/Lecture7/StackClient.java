package Lecture7;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack(6);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
//		s.push(7);
		System.out.println(s.isFull());
		s.display();
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.size());
		
		s.clear();
		s.display();
		System.out.println(s.isEmpty());
		
	}

}
