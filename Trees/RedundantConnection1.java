package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedundantConnection1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edges[][] = {{1,3}, {2,3}, {3,4}, {1,4}, {1,5}};

		RedundantConnection1 r = new RedundantConnection1();
		int output[] =  r.findRedundantConnection(edges);

		System.out.println(output[0]);
		//System.out.println(output[1]);
	}
	
	 public int[] findRedundantConnection(int[][] edges) {
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int[] a: edges){
	            System.out.println(a[0]);
	            System.out.println(a[1]);
	            int xset=0,yset=0;
	            xset=find(map,a[0]);
	            yset=find(map,a[1]);
	            
	            if(xset==yset)
	                return new int[]{
	                a[0],a[1]
	            };
	            
	            union(xset,yset,map);  
	        }
	        return null;
	    }
	        
	        int find(HashMap<Integer,Integer> map, int x){
	            if(map.containsKey(x))
	            {
	                int parent= map.get(x);
	                if(parent==-1)
	                    return x;
	                
	                return find(map,parent);
	            }else{
	                map.put(x,-1);
	                return x;
	            }  
	        }
	        
	           void union(int x,int y, HashMap<Integer,Integer> lst){
	             int xset=find(lst,x);
	             int yset=find(lst,y);
	   
	             lst.put(x,y);
	        }
	        
	   //please check leetcode..

}