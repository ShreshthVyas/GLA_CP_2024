package Lecture22;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int size[] = { 1, 2, 3, 2, 2};
		int val[] = {8, 4, 0, 5, 3};
		int dp[][] = new int[cap+1][val.length+1];
		for(int a[]: dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(knapsack(size,val,cap,0,dp));
	}

	private static int knapsack(int[] size, int[] val, int cap, int i,int dp[][]) {
		// TODO Auto-generated method stub
		if(cap == 0 || i == size.length) {
			return 0;
		}
		if(dp[cap][i]!=-1) {
			return dp[cap][i];
		}
		int inc =0;int exc =0;
		if(size[i]<=cap) {
			inc = val[i] + knapsack(size, val, cap-size[i], i+1,dp);
		}
		exc = knapsack(size, val, cap, i+1,dp);
		
		return dp[cap][i] = Math.max(inc, exc);
	}

}
