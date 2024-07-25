package Lecture20;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import Lecture19.DjikstrasAlgorithm;
import Lecture19.DjikstrasAlgorithm.pair;

public class PrimsAlgoMST {

	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public PrimsAlgoMST(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}
	
	public class pair{
		int vtx;
		int acvtx;
		int cost;
		
		public pair(int v,int a, int c) {
			// TODO Auto-generated constructor stub
			vtx = v;
			acvtx = a;
			cost =c;
			
		}
		
		@Override
		public String toString() {
			return vtx + " via " + acvtx + " @ " + cost;
		}
	}
	
	public void Prims() {
		PriorityQueue<pair> q = new PriorityQueue<>(new Comparator<pair>() {

			@Override
			public int compare(pair o1, pair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		int cost =0;
		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.contains(src)) {
				continue;
			}

			q.offer( new pair(src, src, 0)); // add
			while (!q.isEmpty()) {
				pair rv = q.poll(); // removed based on cost

				if (visited.contains(rv.vtx)) { // check if visited
					continue;
				}
				System.out.println(rv);
				visited.add(rv.vtx);
				cost += rv.cost;
				for (int nbrs : graph.get(rv.vtx).keySet()) { // add nbrs
					if (!visited.contains(nbrs)) {
						int c = graph.get(rv.vtx).get(nbrs);
						q.add(new pair(nbrs,rv.vtx,c));
					}
				}
			}

		}
		
		System.out.println(cost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimsAlgoMST g = new PrimsAlgoMST(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 120);
		g.addEdge(2, 5, 20);
		g.addEdge(2, 4, 90);
		g.addEdge(3, 4, 110);
		g.addEdge(5, 6, 60);
		g.addEdge(5, 7, 30);
		g.addEdge(6, 7, 40);
		
		g.Prims();
	}

}
