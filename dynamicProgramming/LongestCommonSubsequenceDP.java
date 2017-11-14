package dynamicProgramming;

public class LongestCommonSubsequenceDP {

	
	public int findLongestCommonSequence(String firstArray,String secondArray,int firstIndex, int secondIndex) {
		int[][] dp=new int[firstIndex][secondIndex];
        
		for(int m=0;m<firstIndex;m++) {
			for(int n=0;n<secondIndex;n++) {
				
				if(firstArray.charAt(m)==secondArray.charAt(n))
				{
					if(m!=0 && n!=0)
					dp[m][n]=1+ Math.max(dp[m][n-1],dp[m-1][n]);
					else {
						dp[m][n]=1;
						
					}
					
					
				}
				else
				{  
					if(m!=0 && n!=0)
					dp[m][n]=Math.max(dp[m][n-1],dp[m-1][n]);
					else
						dp[m][n]=0;
				}
			}
		}
		return dp[firstIndex-1][secondIndex-1];
	}
	
	
	
	public static void main(String args[]) {
		String first= "ADBH";
		String second="TASDKB";
		LongestCommonSubsequenceDP lcs=new LongestCommonSubsequenceDP();
		
		int result=lcs.findLongestCommonSequence(first,second,first.length(),second.length());
		System.out.println(result);
	}
	
}
