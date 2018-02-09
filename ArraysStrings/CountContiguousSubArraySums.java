package ArraysStrings;

import java.util.HashMap;
import java.util.Map;
public class CountContiguousSubArraySums {

	public int subarraySum(int[] nums, int k) {
		int sum = 0, result = 0;
		Map<Integer, Integer> preSum = new HashMap<Integer, Integer>();
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
		CountContiguousSubArraySums c=new CountContiguousSubArraySums();
		int[] arr= {1,5,6,7,9,3};
		System.out.println(c.subarraySum(arr,12));
	}
}

