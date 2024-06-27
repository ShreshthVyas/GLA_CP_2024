package Lecture3;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		brdpth2(0,n,"");
		
//		System.out.println(1+2+3+"Hello"+ 1+2+3);
	}

	public static void brdpth(int curr, int n, String ans) {
		// TODO Auto-generated method stub
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		brdpth(curr+1, n, ans+"1");
		brdpth(curr+2, n, ans+"2");
		brdpth(curr+3, n, ans+"3");	
	}
	
	public static void brdpth2(int curr, int n, String ans) {
		// TODO Auto-generated method stub
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		for (int i = 1; i <=n; i++) {
			brdpth2(curr+i, n, ans+ i);
		}	
	}

}
