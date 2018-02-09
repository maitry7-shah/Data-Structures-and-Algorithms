package ArraysStrings;

public class findIndexBinarySearch {

	public int findIndex(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		
		if(target<arr[low])
			return 0;
		
		if(target>arr[high])
			return high+1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(low+1==high && arr[low]<target && target<arr[high]) {
				return low+1;
			}
			
			if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		findIndexBinarySearch f=new findIndexBinarySearch();
		int[] arr= {1,2,3,14};
		System.out.println(f.findIndex(arr,10));
	}
}
