package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	 public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        backtrack(list, "", 0, 0, n);
	        return list;
	    }
	    
	   
	    
	    private void backtrack(List<String> list, String string, int open, int close, int n) {
		if(string.length()==2*n)
			{
			list.add(string);
			
			}
		if(open<n)
			backtrack(list,string+'(',open+1,close,n);
		if(close<open)
			backtrack(list,string+')',open,close+1,n);
		
		
	}



		public static void main(String[] args) {
	    	GenerateParenthesis g=new GenerateParenthesis();
	    	 List<String> list = g.generateParenthesis(3);
	    }
}
