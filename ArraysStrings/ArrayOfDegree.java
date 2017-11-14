package ArraysStrings;

import java.util.*;

public class ArrayOfDegree {
	
	    
	    public static int findShortestSubArray(int[] nums) {
	        int length=Integer.MAX_VALUE;
	        HashMap<Integer,Element> map=new HashMap<Integer,Element>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(!map.containsKey(nums[i]))
	            {  
	                Element e=new Element(i,1,i);
	                map.put(nums[i],e);
	            }
	            else
	            {
	                Element ne=map.get(nums[i]);
	                ne.iIndex=ne.iIndex;
	                int count=ne.eCount;
	                ne.eCount=count+1;
	                ne.fIndex=i;
	                map.put(nums[i],ne);
	             
	            }
	        }
	        
	        Set<Integer> keys=map.keySet();
	        int degree=Integer.MIN_VALUE;
	        for(Integer k:keys)
	        {
	            degree=Math.max(degree,map.get(k).eCount);
	          
	        }
	        
	        for(Integer k:keys)
	        {
	            if(map.get(k).eCount==degree)
	            {
	               length= Math.min(length,((map.get(k).fIndex)-(map.get(k).iIndex)));
	               
	            }
	        }
	        return length+1; 
	    }
	    
	    public static void main(String[] args) {
	    	int[] a= {1,3,3,4,5,5,6};
	    	findShortestSubArray(a);
	    }
	}

	class Element{
	    int iIndex;
	    int eCount;
	    int fIndex;
	    
	    Element(int iIndex,int count,int fIndex){
	        this.iIndex=iIndex;
	        this.eCount=count;
	        this.fIndex=fIndex;
	    }
	}

