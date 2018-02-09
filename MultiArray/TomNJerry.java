package MultiArray;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Map;
import java.util.*;
import java.lang.reflect.Array;

public class TomNJerry{

	int[] x= {0,1,0,-1};
	int[] y= {1,0,-1,0};
	ArrayList<Point> arrlist;
	public static void main(String[] args){

				int[][] arr = {{0,0,0,1,2},
							   {0,1,0,1,0},
							   {1,2,0,0,0},
							   {2,0,0,0,1},
							   {0,0,0,0,0}};
//
//		int[][] sm = 
//			    {{0,2,0},
//				{1,1,2},
//				{1,0,0}};			   	

		int x=4;
		int y=2;
		TomNJerry tj=new TomNJerry();
		System.out.println(tj.findMinimumPath(arr,x,y,0,0));


	}

	public  int findMinimumPath(int[][] arr,int x,int y,int startX,int startY){

		arrlist=new ArrayList<Point>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==2) {
					arrlist.add(new Point(i,j));

				}	
			}
		}

		if(arr[startX][startY]!=0)
			return -1;

		Point src=new Point(startX,startY);

		Point destination=new Point(x,y);
		
		int index=0;
		int totalDistance=0;
		while(arrlist.size()>0) {
			int minDistance=Integer.MAX_VALUE;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<arrlist.size();i++) {
				minDistance=findMinimumDistance(src,arrlist.get(i),arr);
				if(minDistance<min) {
					min=minDistance;
					index=i;
				}
				
			}
		src=arrlist.get(index);
		arrlist.remove(index);
		totalDistance+=min;
		}

		totalDistance+=findMinimumDistance(src,destination,arr);
		return totalDistance;
	}


	public  int findMinimumDistance(Point source,Point destination,int[][] arr){
		Queue<QueueNode> q=new LinkedList<QueueNode>();
		boolean[][] visited = new boolean[arr.length][arr.length];
		QueueNode qn=new QueueNode(source,0);
		q.add(qn);
		
		while(!q.isEmpty()) {

			QueueNode qnode=q.poll();
		
			Point p=qnode.point;
			visited[p.x][p.y]=true;
			if(p.x==destination.x && p.y==destination.y)
			return qnode.distance;

			for(int i=0;i < 4;i++) {
				int newX=p.x+x[i];
				int newY=p.y+y[i];
				if(isValid(newX,newY,arr) && !visited[newX][newY] ) {
					if(arr[newX][newY]==0 || arr[newX][newY]==2)
					q.add(new QueueNode(new Point(newX,newY),qnode.distance+1));
				}
			}

		}


		return 0;

	}

	public static boolean isValid(int possibleX,int possibleY,int[][] arr){
		return((possibleX < arr.length && possibleX >=0 && possibleY < arr[0].length && possibleY >=0) );
	}
}
class Point{

	int x;
	int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}

}
class QueueNode{

	Point point;
	int distance;

	public QueueNode(Point point,int distance){
		this.point = point;
		this.distance=distance;
	}
}

