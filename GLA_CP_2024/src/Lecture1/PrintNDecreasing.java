package Lecture1;

public class PrintNDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		printdec(n);
	}

	public static void printdec(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		System.out.println(n); //small prob
		printdec(n-1);
	}

}
