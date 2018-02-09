package Graph;

import java.util.Stack;

public class DFS {

	public void depthFirstSearch(int[][] arr) {
		Stack<Point> s=new Stack<Point>();
		int[] x= {-1,1,0,0};
		int[] y= {0,0,-1,1};

		boolean[][] visited=new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(!visited[i][j])
				s.push(new Point(i,j));
				while(!s.isEmpty()) {
					Point temp=s.pop();
					visited[i][j]=true;
					
				}
			}
		}	
	}

	public static void main(String[] args) {
		int[][]  arr={{1,2,3},{4,5,6},{7,8,9}};
		DFS d=new DFS();
		d.depthFirstSearch(arr);
	}
}
