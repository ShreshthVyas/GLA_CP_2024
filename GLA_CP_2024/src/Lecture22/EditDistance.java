package Lecture22;

import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "intention";
		String t = "execution";
//		int dp[][] = new int[s.length()][t.length()];
//		for(int a[]: dp) {
//			Arrays.fill(a, -1);
//		}
//		System.out.println(mindist(s,t,0,0,dp));
		System.out.println(mindistBu(s, t));
	}

	private static int mindist(String s, String t, int i, int j,int dp[][]) {
		// TODO Auto-generated method stub
		if(i == s.length()) {
			return t.length()-j;
		}
		if(j == t.length()) {
			return s.length()-i;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans = 0;
		if(s.charAt(i)== t.charAt(j)) {
			ans = mindist(s, t, i+1, j+1,dp);
		}
		else {
			int D = mindist(s, t, i+1, j,dp);
			int I =  mindist(s, t, i, j+1,dp);
			int R =  mindist(s, t, i+1, j+1,dp);
			ans = 1 + Math.min(I, Math.min(D, R));
		}
		
		return dp[i][j] = ans;
	}
	
	private static int mindistBu(String s, String t) {
		int dp[][] = new int[s.length()+1][t.length()+1];
		
		for (int i = 0; i < dp.length; i++) { // 0th row 
			dp[i][0] = i;
		}
		for (int i = 0; i < dp[0].length; i++) { // 0th col
			dp[0][i] = i;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans =0;
				if(s.charAt(i-1) == t.charAt(j-1)) {
					ans = dp[i-1][j-1];
				}
				else {
					int D = dp[i-1][j];
					int I =  dp[i][j-1];
					int R =  dp[i-1][j-1];
					ans = 1 + Math.min(I, Math.min(D, R));
				}
				dp[i][j] = ans;
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

	

}
