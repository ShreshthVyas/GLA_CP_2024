package Lecture19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph2(int v) {
		graph = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.contains(src)) {
				continue;
			}

			q.offer(src); // add
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove

				if (visited.contains(rv)) { // check if visited
					continue;
				}

				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) { // add nbrs
					if (!visited.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}

		}

	}
	
	public void DFT() {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.contains(src)) {
				continue;
			}

			st.push(src); // add
			while (!st.isEmpty()) {
				int rv = st.pop(); // remove

				if (visited.contains(rv)) { // check if visited
					continue;
				}

				System.out.print(rv + " ");
				visited.add(rv);

				for (int nbrs : graph.get(rv).keySet()) { // add nbrs
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}

		}
	}
	
	public boolean isCyclic() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.contains(src)) {
				continue;
			}
			q.offer(src); // add
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // Will only happen if cycle present
					return true;
				}
				visited.add(rv);
				for (int nbrs : graph.get(rv).keySet()) { // add nbrs
					if (!visited.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}
		}
		
		return false;
		
	}
	
	public boolean isConnected() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.contains(src)) {
				continue;
			}
			count++;
			q.offer(src); // add
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // check if visited
					continue;
				}
				visited.add(rv);
				for (int nbrs : graph.get(rv).keySet()) { // add nbrs
					if (!visited.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}

		}
		return count==1;
	}
	
	public boolean isTree() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.contains(src)) {
				continue;
			}
			count++;
			q.offer(src); // add
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // check if visited
					return false;
				}
				visited.add(rv);
				for (int nbrs : graph.get(rv).keySet()) { // add nbrs
					if (!visited.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}

		}
		return count==1;
	}

}
