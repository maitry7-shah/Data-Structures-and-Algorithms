package backtracking;

import java.util.Arrays;

public class KnightsTour {

//	int[] xarr= {1,1,2,2,-1,-1,-2,-2};
//	int[] yarr= {2,-2,-1,1,2,-2,1,-1};

	 int[] xarr = {2, 1, -1, -2, -2, -1, 1, 2};
     int[] yarr = {1, 2, 2, 1, -1, -2, -2, -1};
	int[][] matrix=new int[8][8];

	

	public static void main(String[] args) {
		KnightsTour k=new KnightsTour();
		k.findKnightsTour();
	}



	private void findKnightsTour() {
		for(int i=0;i<8;i++)
		Arrays.fill(matrix[i], -1);
		matrix[0][0]=0;
		backtrack(matrix,0,0,0);	
		System.out.println();
	}
	
	public boolean backtrack(int[][] matrix, int row,int col, int count) {
			if(count==63)
				return true;
			
			matrix[row][col]=count;
			
		for(int i=0;i<8;i++) {
			int newX=row+xarr[i];
			int newY=col+yarr[i];
			if(newX>=0 && newY>=0 && newX<8 && newY<8 && matrix[newX][newY]==0)
			{	matrix[newX][newY]=count+1;
				if(backtrack(matrix,newX,newY,count+1))
						return true;
				else
					matrix[newX][newY]=-1;
			}
		}
		
	return false;	
	}
}

