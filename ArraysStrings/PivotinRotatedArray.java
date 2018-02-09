package ArraysStrings;

public class PivotinRotatedArray {

	 public int search(int[] nums, int target) {
	        int low=0;
	        int high=nums.length-1;
	        if(low==high)
	        {
	            if(nums[low]==target)
	                return low;
	            else
	             return -1;
	        }
	        
	        while(low<=high){
	            int mid=(low+high)/2;
	            
	            if(nums[mid]==target)
	                return mid;
	            
	            if(target<nums[mid]){
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        return -1;
	        
	    }
	public static void main(String[] args) {
		PivotinRotatedArray p=new PivotinRotatedArray();
		int[] arr= {4,5,6,7,1,2,3};
		System.out.println(p.search(arr, 5));
	}
	
}
