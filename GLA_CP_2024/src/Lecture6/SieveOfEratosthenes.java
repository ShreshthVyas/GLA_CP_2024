package Lecture6;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =100;
		sieve(n);
	}

	public static void sieve(int n) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		for (int i = 2; i*i<=n; i++) {
			if(arr[i]==false) {
				for (int j = 2; j*i < arr.length; j++) {
					arr[j*i] =true;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
		
	}

}
