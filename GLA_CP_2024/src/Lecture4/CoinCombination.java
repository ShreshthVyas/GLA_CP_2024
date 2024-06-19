package Lecture4;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5};
		int t = 10;
		
		coin(arr,t,0,"",0);
	}

	public static void coin(int[] arr, int t, int sum, String ans,int sidx) {
		// TODO Auto-generated method stub
		if(sum == t) {//+ve base case
			System.out.println(ans);
			return;
		}
		if(sum>t) {
			return;
		}
		
		for (int i = sidx; i < arr.length; i++) {
			coin(arr, t, sum+arr[i], ans+ arr[i],i);
		}
	}

}
