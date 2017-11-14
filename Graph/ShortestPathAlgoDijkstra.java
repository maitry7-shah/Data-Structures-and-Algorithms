package Graph;

public class ShortestPathAlgoDijkstra {
	public int findMin(boolean[] visited, int[] distance){
        int min_index=-1, min=Integer.MAX_VALUE;
        for(int v=0;v<visited.length;v++){
         
            if(distance[v]<min)
            min_index=v;
        }
        return min_index;
    }
    
    public void findShortestPath(int[][] graph, int position){
        int length=graph.length;
        boolean visited[]=new boolean[length];
        int[] distance=new int[length];
        
        for(int i=0;i<length;i++){
            visited[i]=false;
            distance[i]=Integer.MAX_VALUE;
        }
        
        for(int count=0;count<length;count++){
            
            int unvisitedindex=findMin(visited,distance);
            
            visited[unvisitedindex]=true;
            
            for(int v=0;v<length;v++){
                
                if(!visited[v] && graph[unvisitedindex][v]!=0 && distance[unvisitedindex]+ graph[unvisitedindex][v] <distance[unvisitedindex])
                {
                  distance[unvisitedindex]= distance[unvisitedindex]+ graph[unvisitedindex][v];
                }
            }
        
        }
        
        
      
    }
    
    
    public static void main(String args[]){
    int graph[][] = new int[][]{  {0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
    ShortestPathAlgoDijkstra s=new ShortestPathAlgoDijkstra();
    s.findShortestPath(graph,0);
    
    }
}
