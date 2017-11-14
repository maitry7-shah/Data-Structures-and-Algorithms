package MultiArray;
import java.util.Arrays;

public class FindNegativeNumbersinMatrix {

	public int  countNegative(int[][] M, int i,int j) {
		int total=0;
		for(int count=0;count<i;count++) {
			int index=Arrays.binarySearch(M[count],0);
			 total +=  -(index+1);
			
		}
		return total;
	}
	
	 public static void main (String[] args) 
	    {
	    int M[][] = { {-3, -2, -1, 1},
	                    {-2, 2, 3, 4},
	                    {4, 5, 7, 8} };
	    FindNegativeNumbersinMatrix fn=new FindNegativeNumbersinMatrix();
	    int a=fn.countNegative(M, 3, 4);
	    System.out.println(a);
	    }
}
