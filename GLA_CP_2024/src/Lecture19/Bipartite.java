package Lecture19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

	public boolean isBipartite(int[][] arr) {
		HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			graph.put(i, new HashSet<>());
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				graph.get(i).add(arr[i][j]);
			}
		}

		return isbipart(graph);
	}

	private boolean isbipart(HashMap<Integer, HashSet<Integer>> graph) {

		Queue<pair> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();

		for (int src : graph.keySet()) { // traverse on graph.set to get vertices
			if (visited.containsKey(src)) {
				continue;
			}

			q.offer(new pair(src, 0)); // add
			while (!q.isEmpty()) {
				pair rv = q.poll(); // remove

				if (visited.containsKey(rv.vtx)) { // check if visited
					if (visited.get(rv.vtx) != rv.d) { // odd
						return false;
					}
					continue;
				}

				visited.put(rv.vtx, rv.d);

				for (int nbrs : graph.get(rv.vtx)) {
					if (!visited.containsKey(nbrs)) {
						q.offer(new pair(nbrs, rv.d + 1));
					}
				}
			}

		}

		return true;

	}

	class pair {
		int vtx;
		int d;

		public pair(int v, int dis) {
			vtx = v;
			d = dis;
		}
	}
}
