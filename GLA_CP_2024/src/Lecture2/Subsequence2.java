package Lecture2;

public class Subsequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = subseq("abc", "");
		System.out.println(count);
	}
	
	public static int subseq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
//			System.out.println(ans);
			return 1;
		}
		
		char ch = ques.charAt(0);
		int inc = subseq(ques.substring(1), ans+ch); //inc
		int exc = subseq(ques.substring(1), ans); //exc
		
		return exc+inc;
	}

}
