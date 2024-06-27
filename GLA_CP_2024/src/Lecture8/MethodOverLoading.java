package Lecture8;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =2;
		int j =3;
		System.out.println(add(i,j));
		
		long l = 10;
		long ll =100;
		
		System.out.println(add(l,ll));
		
		System.out.println(add(l,ll,i));
		
		System.out.println(add(2.2,2,4,5,56,46,67,67));
	}

	private static int add(long l, long ll) {
		// TODO Auto-generated method stub
		return (int) (l+ ll);
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	
	private static long add(long l , long ll ,int a) {
		return l + ll + a;
	}
	
	private static int add( double d , int b , int... arr ) {
		int sum = 0;
		sum+= (int) d + b;
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		
		return sum;
		
	}
}
