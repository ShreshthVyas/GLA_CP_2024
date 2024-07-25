package Lecture20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManFord {

	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public BellManFord(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
	}

	public class edgepair {
		int e1;
		int e2;
		int cost;

		public edgepair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
	}

	public List<edgepair> getedgepair() {
		List<edgepair> list = new ArrayList<>();

		for (int e1 : graph.keySet()) {
			for (int e2 : graph.get(e1).keySet()) {
				int cost = graph.get(e1).get(e2);
				list.add(new edgepair(e1, e2, cost));
			}
		}
		return list;
	}

	public void Bellmanford() {
		int v = graph.size();
		int dis[] = new int[v + 1];

		List<edgepair> ll = getedgepair();

		for (int i = 2; i < dis.length; i++) {
			dis[i] = 8989765;
		}

		for (int i = 1; i <=v; i++) {
			// relax edges v-1 times
			for (edgepair e : ll) { // get all edges for each iteration
				
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve Cycle");
					return ;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + "-->" + dis[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BellManFord g = new BellManFord(3);
//		g.addEdge(1, 2, -4);
//		g.addEdge(1, 3, 2);
//		g.addEdge(3, 4, 3);
//		g.addEdge(4, 2, -8);
//		g.addEdge(2, 5, 6);
//		g.addEdge(5, 6, 7);
//		g.addEdge(5, 7, 5);
//		g.addEdge(6, 7, -8);
		
		g.addEdge(1, 2, -10);
		g.addEdge(2, 3, 5);
		g.addEdge(3, 1, 1);
		
		g.Bellmanford();
		

	}

}
