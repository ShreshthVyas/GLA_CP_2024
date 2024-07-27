package Lecture21;

import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String t = "ace";
		int dp [][] =  new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = lcs(s,t,0,0,dp);
		System.out.println(ans);
	}

//	private static int lcs(String s, String t, int i, int j) {
//		// TODO Auto-generated method stub
//		if(i == s.length() || j == t.length()) {
//			return 0;
//		}
//		int ans =0;
//		if(s.charAt(i) == t.charAt(j)) { // char matched
//			ans = 1 + lcs(s, t, i+1, j+1);
//		}
//		else {
//			int fs = lcs(s, t, i+1, j);
//			int ss = lcs(s, t, i, j+1);
//			ans = Math.max(fs, ss);
//		}
//		return ans;
//	}
	
	private static int lcs(String s, String t, int i, int j,int dp [][] ) { 
		// TODO Auto-generated method stub
		if(i == s.length() || j == t.length()) {
			return 0;
		}
		if(dp[i][j] != -1) { // answer already computed
			return dp[i][j];
		}
		int ans =0;
		if(s.charAt(i) == t.charAt(j)) { // char matched
			ans = 1 + lcs(s, t, i+1, j+1,dp);
		}
		else {
			int fs = lcs(s, t, i+1, j,dp);
			int ss = lcs(s, t, i, j+1,dp);
			ans = Math.max(fs, ss);
		}
		
		return dp[i][j] = ans;// Memoise || yaad karna
	}
	
	private static int lcsbu(String s, String t) {
		int dp [][] =  new int[s.length()+1][t.length()+1];
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) { // Diagonally up
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else { // 1 up and 1 left 
					int fs = dp[i-1][j];
					int ss = dp[i][j-1];
					dp[i][j] = Math.max(fs, ss);
				}
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

}
