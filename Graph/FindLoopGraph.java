package Graph;
//Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

public class FindLoopGraph {

	public static void dfs() {
		boolean[] visited=new boolean[4];
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<4;i++) {
			visited[i]=false;
		}
		//s.push(i);
		for(int i=0;i<4;i++) {
		
		}
		
	}

 public static void main(String args[])
 {
     Graph g = new Graph(4);

     g.addEdgeUndirected(0, 1);
     g.addEdgeUndirected(0, 2);
     g.addEdgeUndirected(1, 2);
     g.addEdgeUndirected(2, 0);
     g.addEdgeUndirected(2, 3);
     g.addEdgeUndirected(3, 3);

     dfs();
 }
}

