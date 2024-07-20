package Lecture18;

import java.util.HashSet;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 120);
		g.addEdge(2, 4, 90);
		g.addEdge(2, 5, 20);
		g.addEdge(3, 4, 110);
		g.addEdge(5, 6, 60);
		g.addEdge(5, 7, 30);
		g.addEdge(6, 7, 40);
		
//		g.Display();
//		g.removeEdge(6, 7);
//		g.Display();
//		System.out.println(g.countEdge());;
		
//		System.out.println(g.hasPath(1, 7,new HashSet<Integer>()));
//		g.printallPath(1, 7, new HashSet<Integer>(), "");
//		System.out.println(g.bfs(1, 9, new HashSet<Integer>()));
		System.out.println(g.dfs(1, 7, new HashSet<Integer>()));
		
	}

}
