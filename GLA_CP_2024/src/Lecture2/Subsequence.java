package Lecture2;

public class Subsequence {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abc";
		subseq(s,"");
		System.out.println(count);
	}

	public static void subseq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			count++;
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		subseq(ques.substring(1), ans+ch); //inc
		subseq(ques.substring(1), ans); //exc	
	}

}
