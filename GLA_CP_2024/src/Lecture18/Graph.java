package Lecture18;

import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;



public class Graph {
	HashMap<Integer, HashMap<Integer,Integer>>  graph;
	
	public Graph(int v) {
		graph  = new HashMap<>();
		for (int i = 1; i <=v; i++) {
			graph.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2,int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}
	
	public void addvertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public void removeVertice(int v) {
		for(int i : graph.get(v).keySet()) {
			graph.get(i).remove(v);
		}
		graph.remove(v);
	}
	
	public void removeEdge(int v1,int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	
	public boolean containsVertice(int v) {
		return graph.containsKey(v);
	}
	
	public boolean containsEdge(int v1, int v2) {
		return graph.get(v1).containsKey(v2);
	}
	
	public int countEdge() {
		int count =0;
		for(int i : graph.keySet()) {
			count+= graph.get(i).size();
		}
		return count/2;
	}
	
	public void Display() {
		for(int v : graph.keySet() ) {
			System.out.println(v + " --> " + graph.get(v));
		}
	}
	
	public boolean hasPath(int src,int dest, HashSet<Integer> visited) {
		if(src == dest) {
			return true;
		}
		visited.add(src);
		for(int nbrs : graph.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, dest,visited);// small prob , recursion check nbrs to dest
				if(ans == true) {
					return ans;
				}
			}
		}
		
		return false;
	}
	
	public void printallPath(int src,int dest, HashSet<Integer> visited, String s) {
		if(src == dest) {
			System.out.println(s + dest);
			return ;
		}
		visited.add(src);
		for(int nbrs : graph.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				printallPath(nbrs, dest, visited, s+ src + " ==>" );
			}
		}
		visited.remove(src);
	}
	
	public boolean bfs(int src,int dest, HashSet<Integer> visited) { //breadth first search
		if(src == dest) {
			return true;
		}
		
		Queue<Integer>  q = new LinkedList<>();
		q.offer(src);
		while(!q.isEmpty()) {
			int rv = q.poll();
			
			if(rv == dest) {
				return true;
			}
			if(visited.contains(rv)) {
				continue;
			}
			
			visited.add(rv);
			for (int nbrs : graph.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					q.offer(nbrs);
				}
			}
		}
		return false;
		
	}
	
	public boolean dfs(int src,int dest, HashSet<Integer> visited) { //breadth first search
		if(src == dest) {
			return true;
		}
		
		Stack<Integer>  st = new Stack<>();
		st.push(src);
		while(!st.isEmpty()) {
			int rv = st.pop();
			
			if(rv == dest) {
				return true;
			}
			if(visited.contains(rv)) {
				continue;
			}
			
			visited.add(rv);
			for (int nbrs : graph.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
		
	}
}
