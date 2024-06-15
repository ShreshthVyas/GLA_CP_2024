package Lecture2;

public class ParanthesisCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		genpar(n,0,0,"");
	}

	private static void genpar(int n, int op, int cl, String ans) {
		// TODO Auto-generated method stub
		if(op==n && cl==n) {
			System.out.println(ans);
			return;
		}
		if(op>n || cl>n) {
			return;
		}
		genpar(n, op+1, cl, ans+"(");
		if(cl<op) {
			genpar(n, op, cl+1, ans+")");
		}
	}

}
