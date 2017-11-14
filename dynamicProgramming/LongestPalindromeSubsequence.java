package dynamicProgramming;

public class LongestPalindromeSubsequence {

	public int findLongestPalidromicSubsequence(String s) {
		int length=s.length();
		int[][] dp=new int[length+1][length+1];
		
		for(int i=1;i<=length;i++) {
			for(int j=1;j<=length;j++) {
				
			if(s.charAt(i-1)==s.charAt(length-j))
				dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]+1>dp[i][j-1]?dp[i-1][j-1]+1:dp[i][j-1]);
			else
				dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]>dp[i][j-1]?dp[i-1][j-1]:dp[i][j-1]);
			
			}
		}
		
		return dp[length][length];
	
	}
	
	public static void main(String args[])
    {
        String seq = "forgerof";
        int n = seq.length();
        LongestPalindromeSubsequence lps=new LongestPalindromeSubsequence();
        System.out.println("The lnegth of the lps is "+ lps.findLongestPalidromicSubsequence(seq));
    }
}
