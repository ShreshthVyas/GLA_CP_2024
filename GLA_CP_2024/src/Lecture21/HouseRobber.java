package Lecture21;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 7, 9, 3, 1 };
		int dp[] = new int[arr.length];
		Arrays.fill(dp, -1);
//		int ans = houserobTD(arr, arr.length - 1, dp);
		int ans = houserobBU(arr);
		System.out.println(ans);
	}

	private static int houserobTD(int[] arr, int i, int[] dp) {
		// TODO Auto-generated method stub
		if (i < 0) {
			return 0;
		}
		if(dp[i]!= -1) {
			return dp[i];
		}
		int rob = arr[i] + houserobTD(arr, i - 2,dp);
		int notRob = houserobTD(arr, i - 1,dp);

		return dp[i] = Math.max(rob, notRob);
	}

//	private static int houserob(int[] arr, int i) {
//		// TODO Auto-generated method stub
//		if(i<0) {
//			return 0;
//		}
//		int rob = arr[i] + houserob(arr, i-2);
//		int notRob = houserob(arr, i-1);
//		
//		return Math.max(rob, notRob);
//	}
	
	private static int houserobBU(int[] arr) {
		if(arr.length ==1) {
			return arr[0];
		}
		int dp[] = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for (int i = 2 ; i < dp.length; i++) {
			int rob = arr[i] + dp[i-2];
			int notRob = dp[i-1];
			dp[i] = Math.max(rob, notRob);
		}
		
		return dp[dp.length-1];
		
	}

	

}
