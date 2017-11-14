package BinarySearch;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int longestIncreasingSubs(int[] array, int m) {
    	int[] dp = new int[array.length];
        int len = 0;

        for(int x : array) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
    }
	
	
	public static void main(String args[]) {
		 int arr[] = { 4,10,4,3,8,9 };
		 LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
		  int max=lis.longestIncreasingSubs(arr,0);
		 System.out.println(max);
	}
}
