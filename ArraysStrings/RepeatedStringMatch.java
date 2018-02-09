package ArraysStrings;

public class RepeatedStringMatch {
	public boolean repeatedSubstringPattern(String s) {
        int i=0,j=1;
        int[] dp=new int[s.length()];
        
            while(j<s.length()){
                if(s.charAt(i)==s.charAt(j) ){
                    dp[j]=i+1;
                    i++;
                    j++;
                }
                else{
                	if (i==0) 
                        dp[j++] = 0;
                    else
                        i = dp[i - 1];
                }
            }
             
        return dp[s.length()-1]!=0 && s.length()%(s.length()-dp[s.length()-1])==0;
    }
	
	public static void main(String[] args) {
		String ab="abaababaab";
		RepeatedStringMatch r=new RepeatedStringMatch();
		System.out.println(r.repeatedSubstringPattern(ab));
	}
}
