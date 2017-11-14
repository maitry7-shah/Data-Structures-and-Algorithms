package Graph;
class FloydWarshallShortestPathAlgo{
    final static int INF = 99999;
    public void floydWarshall(int[][] graph){
        
    int n=graph.length;
    int distance[][]=new int[n][n];
    for(int i=0;i<n;i++ ){        
        for(int j=0;j<n;j++ )   {
            distance[i][j]=graph[i][j];
        }     
    }
    
    for(int k=0;k<n;k++ ){ 
         for(int i=0;i<n;i++ ){    
              for(int j=0;j<n;j++ ){    
              
                   if(distance[i][k]+distance[k][j]<distance[i][j])
                   distance[i][j]=distance[i][k]+distance[k][j];
               }
              
          }
         }
    
    for(int i=0;i<distance.length;i++) {
    	for(int j=0;j<distance.length;j++) {
    		System.out.print("    "+distance[i][j]);
    	}
    	System.out.println();
    }
    
    }
    
    
    public static void main(String args[]){
           int graph[][] = { {0,   5,  INF, 10},
                          {INF, 0,   3, INF},
                          {INF, INF, 0,   1},
                          {INF, INF, INF, 0}
                        };
        FloydWarshallShortestPathAlgo a = new FloydWarshallShortestPathAlgo();
 
        // Print the solution
        a.floydWarshall(graph);
    }
}