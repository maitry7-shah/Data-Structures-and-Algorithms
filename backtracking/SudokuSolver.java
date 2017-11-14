package backtracking;

public class SudokuSolver {

	 public boolean solveSudoku(int[][] grid){
		int[] row_col=isUnassigned(grid);
			 if(row_col[0]==0)
				 return true;
			
		for(int i=1;i<=9;i++) {
			
			if(!isUsedinRow(grid,row_col[1],i) && !isUsedinColumn(grid,row_col[2],i) && !isUsedinQuadrant(grid,row_col[1],row_col[2],i))
			{	
				grid[row_col[1]][row_col[2]]=i;
				
				if(!solveSudoku(grid))
					grid[row_col[1]][row_col[2]]=0;
				else
					return true;
			}
		}
	
		return false;
	}	
	
	public boolean isUsedinRow(int[][] grid,int row,int num) {
		for(int i=0;i<9;i++) {
			if(grid[row][i]==num)
				return true;
		}
		return false;
	}
	
	public boolean isUsedinColumn(int[][] grid,int col, int num) {
		for(int i=0;i<9;i++) {
			if(grid[i][col]==num)
				return true;
		}
		return false;
	}
	
	public boolean isUsedinQuadrant(int[][] grid,int row,int col,int num) {
		int intialRow = row-row%3;
		int intialCol = col-col%3;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(grid[intialRow+i][intialCol+j]==num)
					return true;
			}
		}
		return false;
	}
	
	public int[] isUnassigned(int[][] grid) {
		int[] parameters = new int[3];
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(grid[i][j]==0) {
					parameters[0]=1;
					parameters[1]=i;
					parameters[2]=j;
					return parameters;
				}
					
			}
		}
		return parameters;
	}
	
	
	public void printGrid(int[][] grid) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(" "+grid[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		
		 int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                 {5, 2, 0, 0, 0, 0, 0, 0, 0},
                 {0, 8, 7, 0, 0, 0, 0, 3, 1},
                 {0, 0, 3, 0, 1, 0, 0, 8, 0},
                 {9, 0, 0, 8, 6, 3, 0, 0, 5},
                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
                 {1, 3, 0, 0, 0, 0, 2, 5, 0},
                 {0, 0, 0, 0, 0, 0, 0, 7, 4},
                 {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		 SudokuSolver ss=new SudokuSolver();
		 if(ss.solveSudoku(grid))
			 ss.printGrid(grid);
		 else {
			 System.out.println("No Solution found");
		 }
	   }
	}
