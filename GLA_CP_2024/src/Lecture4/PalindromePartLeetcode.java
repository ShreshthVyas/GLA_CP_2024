package Lecture4;

import java.util.*;

public class PalindromePartLeetcode {
	static List<List<String>> ans = new ArrayList<>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		List<String> list = new ArrayList<>();
		palpart(s,list);
		System.out.println(ans);
	}

	public static void palpart(String ques, List<String> list ) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			List<String> temp = new ArrayList<>(list);
			ans.add(temp);
			return;
		}
		
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPal(s)) {
				list.add(s);
				palpart(ques.substring(i), list);
				list.remove(list.size()-1);
			}
		}
	}
	
	public static boolean isPal(String s) {
		int i =0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	}


