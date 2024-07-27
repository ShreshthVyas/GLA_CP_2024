package Lecture21;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 46;
//		int ans = fib(n);
		int dp[] = new int[n+1];
//		int ans = dpTD(n,dp);
		int ans = dpBU(n,dp);
		System.out.println(ans);
	}

	private static int dpBU(int n, int[] dp) {
		// TODO Auto-generated method stub
		//Base case
		dp[0] =0;
		dp[1] =1;
		
		//Self Work
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		//return 
		return dp[n];
	}

	private static int dpTD(int n, int[] dp) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int f1 = dpTD(n-1,dp);
		int f2 = dpTD(n-2,dp);
		return dp[n] = f1+f2; // Yaad Karna
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) {
			return n;
		}
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		return f1+f2;
	}
	
	

}
