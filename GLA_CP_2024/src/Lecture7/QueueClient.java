package Lecture7;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enque(1);
		q.Enque(2);
		q.Enque(3);
		q.Enque(4);
		q.Enque(5);
		q.display();
		
		q.Deque();
		q.Deque();
		q.Enque(10);
		
		q.display();
	}

}
