package ArraysStrings;

import java.util.LinkedList;
import java.util.Queue;

class Pnt{
    int x;
    int y;
    
    Pnt(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class NumberofIslandsTrial {
	
	    public int numIslands(char[][] grid) {
	        boolean[][] visited=new boolean[grid.length][grid[0].length];
	        Queue<Pnt> queue=new LinkedList<Pnt>();
	        int[] x={1,-1,0,0};
	        int[] y={0,0,1,-1};
	        
	        int count=0;
	            for(int i=0;i<grid.length;i++){
	                    for(int j=0;j<grid[0].length;j++){
	                        if(grid[i][j]=='1' && !visited[i][j]){
	                              queue.add(new Pnt(i,j));
	                             
	                              while(!queue.isEmpty()){
	                            	  Pnt temp=queue.poll();
	                            	  visited[temp.x][temp.y]=true;
	                                  for(int k=0;k<x.length;k++){
	                                      int newX=temp.x+x[k];
	                                      int newY=temp.y+y[k];
	                                      
	                                      if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && !visited[newX][newY] && grid[newX][newY]=='1'){
	                                          queue.add(new Pnt(newX,newY));
	                                      }
	                                  }
	                              }
	                            count++;
	                        }
	                        
	                        
	                        
	                    }
	            }    
	        return count;
	    }
	    
	    public static void main(String[] args) {
	    	 char[][] arr= {{'1','1','1','1','0'},{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','0','1','1'}};
	    	 NumberofIslandsTrial n=new NumberofIslandsTrial();
	    	 n.numIslands(arr);
	    }
	    
	}

	

