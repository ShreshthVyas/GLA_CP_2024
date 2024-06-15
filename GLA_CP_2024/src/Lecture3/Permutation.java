package Lecture3;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aba";
		permutation(s,"");
	}

	public static void permutation(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return ;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String left = ques.substring(0,i);
			String right = ques.substring(i+1);
			permutation(left+right, ans+ch);
		}
		
	}

}
