package Lecture22;

import java.util.Arrays;

public class MinimumFallingpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,1,3},{6,5,4},{7,8,9}};
		int dp[][] = new int[arr.length][arr[0].length];
		for(int a[]: dp) {
			Arrays.fill(a, -10001);
		}
		int ans =Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans  = Math.min(ans, minpath(arr,0,i,dp));
		}
		System.out.println(ans);
	}

	private static int minpath(int[][] arr, int cr, int cc,int dp[][]) {
		// TODO Auto-generated method stub
		if(cc<0 || cc>= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr == arr.length-1) {
			return arr[cr][cc];
		}
		if(dp[cr][cc] != -10001 ) {
			return dp[cr][cc];
		}
		int ld = minpath(arr, cr+1, cc-1,dp);
		int rd = minpath(arr, cr+1, cc+1,dp);
		int d =	minpath(arr, cr+1, cc,dp);
		return  dp[cr][cc] = arr[cr][cc] + Math.min(d, Math.min(rd, ld));
	}

}
