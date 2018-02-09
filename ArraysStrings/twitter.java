package ArraysStrings;

import java.util.List;
import java.util.ArrayList;

public class twitter {
	
	    public int findLength(int[] a,int n,int k) {
	    	int lenmax=0;
	 	   List<Integer> dummy = new ArrayList<Integer>();
	 	   int sumdummy=0;
	 	   for(int i=0;i<a.length;i++) {
	 	        dummy.add(a[i]);
	 	        sumdummy+=a[i];
	 	        if(sumdummy<=k)
	 	            lenmax=Math.max(lenmax,dummy.size());
	 	        else {
	 	            sumdummy-=dummy.get(0);
	 	            dummy.remove(0);
	        }
	 	        }
	 	    return lenmax;
	 	    		
	    }
	    		
	    	public static void main(String[] args) {
	    		twitter t=new twitter();
	    		int[] a= {1,2,3};
	    		System.out.println(t.findLength(a,3,4));
	        }	
}
