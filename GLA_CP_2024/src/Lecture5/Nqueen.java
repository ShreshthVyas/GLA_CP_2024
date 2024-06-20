package Lecture5;

public class Nqueen {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		boolean board[][] =  new boolean[n][n];
		nqueen(board,n,0);
		System.out.println(count);
	}

	public static void nqueen(boolean[][] board, int n, int row) {
		// TODO Auto-generated method stub
		if(n==0) {
			 //board print
			count++;
			Display(board);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if(isValid(board,row,col)) {
				board[row][col] =true;
				nqueen(board, n-1, row+1);
				board[row][col] =false;//backtracking
			}
		}
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for(boolean b[]:board) {
			for(boolean cell : b) {
				if(cell) {
					System.out.print("q ");
				}
				else {
					System.out.print("_ ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean isValid(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//up
		for (int i = row; i>=0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		
		//right upper diagonal
		int cr = row;
		int cc = col;
		while(cr>=0 && cc<board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		
		//left upper diagonal
		cr = row; cc =col;
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		return true;
	}
	
	

}
