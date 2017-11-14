package MultiArray;

import java.util.*;

class Coordinate{
	int x;
	int y;
	int dist;

	Coordinate(int x, int y, int dist)
	{
		this.x=x;
		this.y=y;
		this.dist=dist;
	}

}

public class ShortestDistanceInMaze {

	public int findShortestDistanceInMaze(int[][] arr, Coordinate src, Coordinate dst) {

		int length=arr.length;
		boolean[][] visited=new boolean[length][arr[0].length];
		Queue<Coordinate> q=new LinkedList<Coordinate>();
		if(arr[src.x][src.y]==0 || arr[dst.x][dst.y]==0) {
			return 0;
		}

		int[] x= {1,0,-1,0};
		int[] y= {0,1,0,-1};

		q.add(src);

		while(!q.isEmpty()) {

			Coordinate pt=q.poll();
			int dist=pt.dist;
			visited[pt.x][pt.y]=true;	

			if (pt.x == dst.x && pt.y == dst.y)
				return pt.dist;

			for(int z=0;z<4;z++) {
				if(pt.x+x[z]<length && pt.y+y[z]<length 
						&& pt.y+y[z]>=0 && pt.x+x[z]>=0 
						&& arr[pt.x+x[z]][pt.y+y[z]]	==1 
						&& !visited[pt.x+x[z]][pt.y+y[z]])
				{	
					Coordinate point=new Coordinate(pt.x+x[z],pt.y+y[z],
							dist+1);
					q.add(point);
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][]=  new int[][] 
				{{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			{1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
			{1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
			{1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
			{1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			{1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};

			Coordinate source =new Coordinate(0, 0, 0);
			Coordinate dest = new Coordinate(3, 4, 0);   
			ShortestDistanceInMaze n = new ShortestDistanceInMaze();
			int count = n.findShortestDistanceInMaze(M,source,dest);
			System.out.println(count);
	}

}



