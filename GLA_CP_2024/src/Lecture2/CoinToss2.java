package Lecture2;

public class CoinToss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =3;	
		coin(n,"",false);
	}

	public static void coin(int n, String ans,boolean flag) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(flag == false) {
			coin(n-1, ans+"H",true);
		}
		coin(n-1, ans+"T",false);
	}
	}

