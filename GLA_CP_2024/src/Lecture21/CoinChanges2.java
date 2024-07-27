package Lecture21;

import java.util.Arrays;

public class CoinChanges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = { 1, 2, 5 };
		int amount = 5;
		int dp[][] = new int[coins.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = coin(coins, amount, 0, dp);

	}

	private static int coin(int[] coins, int amount, int i, int dp[][]) {
		// TODO Auto-generated method stub
		if (amount == 0) {
			return 1;
		}
		if (i == coins.length) {
			return 0;
		}
		if (dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coins[i]) {
			inc = coin(coins, amount - coins[i], i, dp);
		}
		exc = coin(coins, amount, i + 1, dp);
		return dp[i][amount] = inc + exc;
	}

	private static int coinBU(int[] coins, int amount) {
		int dp[][] = new int[coins.length + 1][amount + 1];

		for (int i = 0; i < dp.length; i++) { // amount=0
			dp[i][0] = 1;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int inc = 0;
				int exc = 0;
				if (j >= coins[i-1]) { // inc
					inc = dp[i][j - coins[i - 1]];
				}
				exc = dp[i - 1][j];
				dp[i][j] = inc + exc;
			}
		}

		return dp[dp.length - 1][dp[0].length - 1];

	}

}
