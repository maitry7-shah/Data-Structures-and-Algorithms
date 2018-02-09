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
	
	  public int lps(String seq)
	    {
	       int n = seq.length();
	       int i, j, cl;
	       int L[][] = new int[n][n];  // Create a table to store results of subproblems
	      
	       // Strings of length 1 are palindrome of lentgh 1
	       for (i = 0; i < n; i++)
	           L[i][i] = 1;
	              
	        // Build the table. Note that the lower diagonal values of table are
	        // useless and not filled in the process. The values are filled in a
	        // manner similar to Matrix Chain Multiplication DP solution (See
	        // https://www.geeksforgeeks.org/archives/15553). cl is length of
	        // substring
	        for (cl=2; cl<=n; cl++)
	        {
	            for (i=0; i<n-cl+1; i++)
	            {
	                j = i+cl-1;
	                if (seq.charAt(i) == seq.charAt(j) && cl == 2)
	                   L[i][j] = 2;
	                else if (seq.charAt(i) == seq.charAt(j))
	                   L[i][j] = L[i+1][j-1] + 2;
	                else
	                   L[i][j] = Math.max(L[i][j-1], L[i+1][j]);
	            }
	        }
	              
	        return L[0][n-1];
	    }
	
	public static void main(String args[])
    {
        String seq = "geeksforgeeks";
        int n = seq.length();
        LongestPalindromeSubsequence lps=new LongestPalindromeSubsequence();
        System.out.println("The lnegth of the lps is "+ lps.lps(seq));
    }
}
