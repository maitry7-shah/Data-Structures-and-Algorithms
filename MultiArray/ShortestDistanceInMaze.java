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
        int[] x= {-1,0,0,1,};
        int[] y= {0,1,-1,0};
		int newX=0,newY=0;
        Queue<Coordinate> queue=new LinkedList<Coordinate>();
        queue.add(src);
        int count=0;
        boolean[][] visited=new boolean[arr.length][arr[0].length];
        while(!queue.isEmpty() ) {
        		Coordinate temp=queue.poll();
        		count=temp.dist;
        		visited[temp.x][temp.y]=true;
        		
        		if(temp.x==dst.x && temp.y==dst.y) {
        			return temp.dist;
        		}
        		
        		for(int z=0;z<4;z++) {
        			newX=temp.x+x[z];
        			newY=temp.y+y[z];
        			if(newX>=0 && newX<arr.length && newY>=0 && newY<arr[0].length && !visited[newX][newY] && arr[newX][newY]==1) {
        				queue.add(new Coordinate(newX,newY, temp.dist+1));
        			}
        		}
        }
        
        
        
		return -1;
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
		};

			Coordinate source =new Coordinate(0, 0, 0);
			Coordinate dest = new Coordinate(3, 4, 0);   
			ShortestDistanceInMaze n = new ShortestDistanceInMaze();
			int count = n.findShortestDistanceInMaze(M,source,dest);
			System.out.println(count);
	}

}



