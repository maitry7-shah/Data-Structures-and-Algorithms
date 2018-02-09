package ArraysStrings;

import java.util.Arrays;

public class KthSmallestPairDistance {
	public int smallestDistancePair(int[] nums, int k) {
        int len=nums.length;
        int len2=1000000;
        int[] dp= new int[len2];
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
             int dif= Math.abs(nums[i]-nums[j]);
               dp[dif]++;
            }
        }
        int sum=0;
        for(int i=0;i<len2;i++){
            sum+=dp[i];
            if(sum>=k) return i;
        }
        return 0;
    }
	
	public static void main(String[] args) {
		int[] arr= {3,1,1};
		KthSmallestPairDistance k=new KthSmallestPairDistance();
		System.out.println(k.smallestDistancePair(arr, 1));
	}
}
