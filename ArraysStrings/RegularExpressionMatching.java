package ArraysStrings;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        
        for(int i=1;i<=p.length();i++){
            if(p.charAt(i-1)=='*')
            dp[0][i]=dp[0][i-2];
        }
        
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=p.length();j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    
                    dp[i][j] = dp[i][j - 2];
                    
                    if (p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1)) {
                    	dp[i][j] = dp[i][j] | dp[i - 1][j];
                 }
                    }
                else
                    dp[i][j]=false;
                 }
        }
        
        return dp[s.length()][p.length()];
    }
	
	public static void main(String[] args) {
		RegularExpressionMatching rm=new RegularExpressionMatching();
		System.out.println(rm.isMatch("aab", "c*a*b"));
		
	}
}
