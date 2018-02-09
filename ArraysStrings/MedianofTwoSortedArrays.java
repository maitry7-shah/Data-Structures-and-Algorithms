package ArraysStrings;

import java.util.List;
import java.util.ArrayList;
public class MedianofTwoSortedArrays {
	  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int length1=nums1.length;
	        int length2=nums2.length;
	        int length=Math.min(length1,length2);
	        List<Integer> lst=new ArrayList<Integer>();
	        
	        int j=0;
	        int i=0;
	        while(i<length1 && j<length2){
	            if(nums1[i]<nums2[j]){
	                lst.add(nums1[i++]);
	            }
	            else{
	                lst.add(nums2[j++]);
	            }
	            
	        }
	        
	        for(int z=0;z<length;z++)
	        System.out.println(lst.get(z));
	        
	        while(i<length1){
	            lst.add(nums1[i++]);
	        }
	        while(j<length2){
	            lst.add(nums2[j++]);
	        }
	        
	        
	        
	        int resultLength=lst.size();
	  
	       
	        double result;
	        if(resultLength%2==0){
	          System.out.println();
	        result=lst.get((resultLength/2)-1) + lst.get(resultLength/2);
	        return result/2;
	           }
	           else
	           return lst.get((resultLength-1)/2);
	        
	    }
	  public static void main(String args[]) {
		  int[] a= {1};
		  int[] b= {1};
		  MedianofTwoSortedArrays m=new MedianofTwoSortedArrays();
		  System.out.println(m.findMedianSortedArrays(a, b));
	  }
}
