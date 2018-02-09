package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class NumberofContiguousSumArraySumEqualK {
	
	    public int subarraySum(int[] nums, int k) {
	        int sum = 0, result = 0;
	        Map<Integer, Integer> preSum = new HashMap<>();
	        preSum.put(0, 1);
	        
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (preSum.containsKey(sum - k)) {
	                result += preSum.get(sum - k);
	            }
	            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	    	NumberofContiguousSumArraySumEqualK n=new NumberofContiguousSumArraySumEqualK();
	    	int[] nums= {2,3,5,1,4,5,6};
	    System.out.println(n.subarraySum(nums, 10));
	    }
	
}
