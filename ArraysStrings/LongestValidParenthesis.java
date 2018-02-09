package ArraysStrings;

public class LongestValidParenthesis {
	  public int longestValidParentheses(String s) {
	        int open=0; int close=0; int length=0;
	        for(int i=0;i<s.length();i++){
	        	char c=s.charAt(i);
	        	if (c == '('){
	                open=open+1;
	                
	            }
	            else if (c == ')'){
	                if(close+1<=open){
	                    close=close+1;
	                    length+=2;
	                }
	            }
	        }
	    
	    return length;
	}
	  public static void main(String[] args) {
		  LongestValidParenthesis l=new LongestValidParenthesis();
		  System.out.println(l.longestValidParentheses(")()()("));
	  }
}
