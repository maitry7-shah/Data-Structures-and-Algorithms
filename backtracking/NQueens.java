package backtracking;

public class NQueens {
//	int[][] matrix=new int[4][4];
//	
//	public void findPositionsofNQueens(int n) {
//		
//		solvePositions(0,0,matrix,0);
//	}
//	
//	public boolean solvePositions(int[][] matrix, int count) {
//		
////		if(count==4) {
////			return true;
////		}
////		
////		if(!isUsedinRow(matrix,row) && !isUsedinColumn(matrix,col) && !usedInSlant())
////			matrix[row][col]=1;
////		
////		if(solvePositions(matrix, count+1))
////			return true;
////		else
////			matrix[row][col]=0;
////		
////		return false;
//	}
	
	public boolean isUsedinRow(int[][] grid,int row) {
		for(int i=0;i<4;i++) {
			if(grid[row][i]==1)
				return true;
		}
		return false;
	}
	
	public boolean isUsedinColumn(int[][] grid,int col) {
		for(int i=0;i<4;i++) {
			if(grid[i][col]==1)
				return true;
		}
		return false;
	}
	
	
	
	public static void main(String args[]) {
		int n=4;
		NQueens no=new NQueens();
//		no.findPositionsofNQueens(n);
	}
}
