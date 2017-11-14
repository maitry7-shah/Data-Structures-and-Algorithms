package Graph;
import java.util.*;


class Point
{
  int x;
  int y;
  Point(int x, int y){
	  x=x;
	  y=y;
  }
}


class queueNode
{
 Point pt; 
 int dist;  
 queueNode(Point pt, int d){
	 pt=pt;
	 dist=d;
 }
};

public class ShortestDistanceInBinaryMaze {
	 static int ROW=9;
	 static int COL=10;
	 static int rowNum[] = {-1, 0, 0, 1};
	 static int colNum[] = {0, -1, 1, 0};
		
	
	 static boolean isValid(int row, int col)
	{
	    
	    return (row >= 0) && (row < ROW) &&
	           (col >= 0) && (col < COL);
	}
	
	
	static int BFS(int[][] mat, Point src, Point dest)
	{
	    // check source and destination cell
	    // of the matrix have value 1
	    if (mat[src.x][src.y]==0 || mat[dest.x][dest.y]==0)
	        return Integer.MAX_VALUE;
	 
	    boolean[][] visited =new boolean[ROW][COL];
	    
	     
	    // Mark the source cell as visited
	    visited[src.x][src.y] = true;
	 
	    // Create a queue for BFS
	    Queue<queueNode> q=new LinkedList<queueNode>();
	     
	    // distance of source cell is 0
	    queueNode s = new queueNode(src, 0);
	    q.add(s);  // Enqueue source cell
	 
	    // Do a BFS starting from source cell
	    while (!q.isEmpty())
	    {
	        queueNode curr = q.peek();
	        Point pt = curr.pt;
	 
	        // If we have reached the destination cell,
	        // we are done
	        if (pt.x == dest.x && pt.y == dest.y)
	            return curr.dist;
	 
	        // Otherwise dequeue the front cell in the queue
	        // and enqueue its adjacent cells
	        q.poll();
	 
	        for (int i = 0; i < 4; i++)
	        {
	            int row = pt.x + rowNum[i];
	            int col = pt.y + colNum[i];
	             
	           
	            if (isValid(row, col) && mat[row][col]==1 && !visited[row][col])
	            {
	                // mark cell as visited and enqueue it
	                visited[row][col] = true;
	                queueNode Adjcell = new queueNode( new Point(row, col),curr.dist + 1 );
	                q.add(Adjcell);
	            }
	        }
	    }
	 
	    //return -1 if destination cannot be reached
	    return Integer.MIN_VALUE;
	}


 
// Driver program to test above function
public static void main(String args[])
{
    int[][] mat =
    {
        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
        { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
        { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
        { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
        { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
    };
 
    Point source = new Point(0, 0);
    Point dest = new Point(3, 4);
 
    int dist = BFS(mat, source, dest);
 
   System.out.println(dist);
 
   
}
}