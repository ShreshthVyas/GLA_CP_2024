package Lecture1;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		int b = 4;
		System.out.println(pow(a,b));
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			return 1;
		}
		return a * pow(a,b-1);
	}

}
