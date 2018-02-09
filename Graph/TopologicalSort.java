package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {

	public static void main(String[] args) {
		GraphImplementation g=new GraphImplementation(5);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		TopologicalSort t=new TopologicalSort();
		t.topologicalSorting(5);
	}
	
	public void topologicalSorting(int v) {
		Stack<Integer> s=new Stack<Integer>();
		boolean[] visited=new boolean[v];
		
	}

}

class GraphImplementation{
	int numberOfVertices;
	LinkedList<Integer>[] adj;

	GraphImplementation(int v){
		this.numberOfVertices=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
	}
}