package dynamicProgramming;

public class LongestCommonSubsequenceDP {

	
	public int findLongestCommonSequence(String firstArray,String secondArray,int firstIndex, int secondIndex) {
		int[][] dp=new int[firstIndex+1][secondIndex+1];
        
	
		
		for(int m=1;m<firstIndex+1;m++) {
			for(int n=1;n<secondIndex+1;n++) {
				
				if(firstArray.charAt(m-1)==secondArray.charAt(n-1))
				{	
					dp[m][n]=1+ Math.max(dp[m][n-1],dp[m-1][n]);
					
					
					
				}
				else
				{  
					
					dp[m][n]=Math.max(dp[m][n-1],dp[m-1][n]);
				}
			}
		}
		return dp[firstIndex][secondIndex];
	}
	
	
	
	public static void main(String args[]) {
		String first= "abcgh";
		String second="abh";
		LongestCommonSubsequenceDP lcs=new LongestCommonSubsequenceDP();
		
		int result=lcs.findLongestCommonSequence(first,second,first.length(),second.length());
		System.out.println(result);
	}
	
}
