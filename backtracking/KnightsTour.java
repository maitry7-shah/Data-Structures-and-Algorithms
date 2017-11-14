package backtracking;

import java.util.Arrays;

public class KnightsTour {

//	int[] xarr= {1,1,2,2,-1,-1,-2,-2};
//	int[] yarr= {2,-2,-1,1,2,-2,1,-1};

	 int[] xarr = {2, 1, -1, -2, -2, -1, 1, 2};
     int[] yarr = {1, 2, 2, 1, -1, -2, -2, -1};
	int[][] matrix=new int[8][8];

	public void findKnightsTour() {
		for(int i=0;i<8;i++)
			Arrays.fill(matrix[i], -1);
		matrix[0][0]=0;
		tour(0,0,0);

		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

	public boolean tour(int x,int y, int count) {
		
		
		if(count==63) {
			return true;
		}
	
		for(int z=0;z<8;z++) 
		{	
			if(isSafe(x+xarr[z],y+yarr[z])) 
			{	matrix[x+xarr[z]][y+yarr[z]]=count+1;
				if(tour(x+xarr[z],y+yarr[z],count+1))
				{	
					return true;
				}
				else
					matrix[x+xarr[z]][y+yarr[z]]=-1;
			}
			

		}

		return false;
	}

	public boolean isSafe(int x,int y) {
		if(x>=0 && x<8 && y>=0 && y<8 && matrix[x][y]==-1){
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		KnightsTour k=new KnightsTour();
		k.findKnightsTour();
	}
}
