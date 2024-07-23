package Lecture19;

public class Graph2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph2 g =new Graph2(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 120);
		g.addEdge(2, 4, 90);
		g.addEdge(2, 5, 20);
		g.addEdge(3, 4, 110);
		g.addEdge(5, 6, 60);
		g.addEdge(5, 7, 30);
		g.addEdge(6, 7, 40);
		
//		g.BFT();
//		System.out.println();
//		g.DFT();
		
//		System.out.println(g.isCyclic());
//		System.out.println(g.isConnected());
		
		System.out.println(g.isTree());
		
	}

}
