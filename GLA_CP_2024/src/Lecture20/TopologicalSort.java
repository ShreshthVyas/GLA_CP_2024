package Lecture20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
	
	HashMap<Integer, HashSet<Integer>> graph;

	public TopologicalSort(int v) {
		graph = new HashMap<>();
		for (int i = 0; i < v; i++) {
			graph.put(i, new HashSet<>());
		}
	}

	public void addEdge(int v1, int v2) {
		graph.get(v1).add(v2);
	}
	
	public int[] Indegree() {
		int in[] = new int[graph.size()];
		for (int v1 : graph.keySet() ) {
			for (int v2 : graph.get(v1)) {
				in[v2]++;
			}
		}
		return in;
	}
	
	public void TopoSort() {
		int in[] = Indegree();
		Queue<Integer>  q = new LinkedList<>();
		
		for (int i = 0; i < in.length; i++) { // add all 0 Indegrees to q
			if(in[i] == 0) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv+ " ");
			
			for (int  nbrs : graph.get(rv)) {
				in[nbrs]--; //remove edge
				if(in[nbrs]==0) {
					q.offer(nbrs);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 1);
		g.addEdge(4, 3);
		g.addEdge(4, 5);
		g.addEdge(2, 5);
		
		g.TopoSort();

	}

}
