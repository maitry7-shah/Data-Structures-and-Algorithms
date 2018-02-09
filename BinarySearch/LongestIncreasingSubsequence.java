package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
//    public int longestIncreasingSubs(int[] array, int m) {
//    	int[] dp = new int[array.length];
//        int len = 0;
//
//        for(int x : array) {
//            int i = Arrays.binarySearch(dp, 0, len, x);
//            if(i < 0) i = -(i + 1);
//            dp[i] = x;
//            if(i == len) len++;
//        }
//
//        return len;
//    }
	
	
	public int longestIncreasingSubs(int[] arr) {
		int[] newArray=new int[arr.length];
		int index=0;
		Arrays.fill(newArray, Integer.MAX_VALUE);
		for(int i=0;i<arr.length;i++) {
			index=Arrays.binarySearch(newArray,arr[i]);
			
			int newIndex=-(index+1);
			if(newIndex<0)
				newIndex=0;
			newArray[newIndex]=arr[i];
		}
		//please look for the count in the commented code.. #len
		int count=0;
		for(Integer i:newArray) {
			if(i!=Integer.MAX_VALUE) {
				count++;
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String args[]) {
		 int arr[] = { 4,10,4,3,8,9 };
		 LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
		  int max=lis.longestIncreasingSubs(arr);
		 
		 System.out.println(max);
		  
	}
}
