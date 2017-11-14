package ArraysStrings;

public class WaterTrap {
	public static int findWater(int[] arr) {
		int left_max=0, right_max=0;
		int lo=0;
		int hi=arr.length;
		int result=0;
		while(lo < hi) {
			
			if(arr[lo]<arr[hi]) {
				 if(arr[lo] > left_max)
				  left_max = arr[lo];
			      else
			      result += left_max - arr[lo];
			      lo++;
			      
			}
			else
			{
			            if(arr[hi] > right_max)
			            // update right maximum
			            right_max = arr[hi];
			            else
			            result += right_max - arr[hi];
			            hi--;
				}
			}
		
		return 0;
	}
	
	public static void main() {
    int arr[] = {3, 0, 0, 2, 0, 4};
    int n = findWater(arr);
    
    System.out.println("Maximum water that "
                   + "can be accumulated is "
                   + n );	
	}
}
