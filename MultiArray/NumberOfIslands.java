package MultiArray;

import java.util.*;

class CPoint{
	int x;
	int y;

}

public class NumberOfIslands {

	public int findNumberOfIslands(int[][] arr) {
		int count=0;
		int length=arr.length;
		boolean[][] visited=new boolean[length][length];
		Queue<CPoint> q=new LinkedList<CPoint>();
		CPoint p=new CPoint();
		int[] x= {1,0,-1,0};
		int[] y= {0,1,0,-1};
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {

				if(arr[i][j]==1 && !visited[i][j]) {
					p.x=i;
					p.y=j;


					q.add(p);
					count++;

					while(!q.isEmpty()) {

						CPoint pt=q.poll();
						visited[pt.x][pt.y]=true;	

						for(int z=0;z<4;z++) {
							if(pt.x+x[z]<length && pt.y+y[z]<length 
									&& pt.y+y[z]>=0 && pt.x+x[z]>=0 
									&& arr[pt.x+x[z]][pt.y+y[z]]	==1 
									&& !visited[pt.x+x[z]][pt.y+y[z]])
							{	
								CPoint point=new CPoint();
								point.x=pt.x+x[z];
								point.y=pt.y+y[z];

								q.add(point);
							}
						}

					}

				}
			}

		}


		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][]=  new int[][] 
				{
					{1, 1, 0, 0, 0},
					{0, 1, 0, 0, 1},
					{1, 0, 0, 1, 1},
					{1, 0, 0, 0, 0},
					{1, 1, 1, 0, 1}
				};

				NumberOfIslands n = new NumberOfIslands();
				int count = n.findNumberOfIslands(M);
				System.out.println(count);

	}
}
