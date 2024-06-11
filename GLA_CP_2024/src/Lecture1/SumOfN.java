package Lecture1;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int sum = sumofN(n);
		System.out.println(sum);
	}

	public static int sumofN(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		
		return n+ sumofN(n-1);
	}
	

}
