package Lecture1;

public class LinearSearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,3,6,-8,9};
		System.out.println(ls(arr,0,9));
		
	}

	public static int ls(int[] arr, int i, int target) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == target) {
			return i;
		}
		return ls(arr, i+1, target);
	}

}
