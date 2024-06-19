package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesitscheese {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		char maze[][] = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < maze[i].length; j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int ans[][] = new int[n][m];
		
		rat(maze,ans,0,0,n-1,m-1);
		if(count==0) {
			System.out.println("NO PATH FOUND");
		}
	}

	public static void rat(char[][] maze, int[][] ans, int cr, int cc, int n, int m) {
		// TODO Auto-generated method stub
		if(cr == n&& cc==m) {
			count++;
			ans[cr][cc] =1;
			Display(ans);
			return;
		}
		
		if(cr<0 || cc <0 || cr>=maze.length || cc >= maze[0].length || maze[cr][cc] =='X') {
			return;
		}
		
		maze[cr][cc] ='X';
		ans[cr][cc] =1;
		rat(maze, ans, cr+1, cc, n, m);
		rat(maze, ans, cr, cc+1, n, m);
		rat(maze, ans, cr-1, cc, n, m);
		rat(maze, ans, cr, cc-1, n, m);
		maze[cr][cc] ='O';
		ans[cr][cc] =0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int[] a : ans) {
			System.out.println(Arrays.toString(a));
		}
	}

}
