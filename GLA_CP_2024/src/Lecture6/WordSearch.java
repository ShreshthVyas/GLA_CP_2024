package Lecture6;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String s = "ABCCEFF";
		boolean flag =false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == s.charAt(0)) {
					boolean ans = word(arr,i,j,s,0);
					if(ans) {
						flag = true;
						break;
					}
				}
			}
		}
		if(flag) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

	private static boolean word(char[][] arr, int i, int j, String s, int idx) {
		// TODO Auto-generated method stub
		if(idx == s.length()) {
			return true;
		}
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!=s.charAt(idx)) {
			return false;
		}
		arr[i][j] = '*';
		int r [] = { 0,1,-1,0 };
		int c [] = { 1,0,0,-1 };
		
		for (int k = 0; k < c.length; k++) {
			boolean ans = word(arr, i+r[k], j+c[k], s, idx+1);
			if(ans) {
				return true;
			}
		}
		
		arr[i][j] = s.charAt(idx); // backtracking
		
		return false;
		
	}

}
