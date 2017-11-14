package ArraysStrings;

public class ClosestPalindrome {

	    public long nearestPalindromic(String n) {
	   // 	StringBuilder sb=new StringBuilder();
	        long length=n.length()-1;
	        long input=Long.parseLong(n);
	        long low_number=input,high_number=input;
	        	long answer=0;
	        
	        if(isPalindrome(input))
	        {	low_number=input-1;
	             high_number=input+1;
	        }
	      
	        
	        	
	        while(!isPalindrome(low_number)){
	        	low_number--;
	        }
	        
	        while(!isPalindrome(high_number)){
	        	high_number++;
	        }
	        
	        long floorDiff=input-low_number;
	        long ceilingDiff=high_number-input;
	        
	        if(floorDiff<ceilingDiff) {
	         	return low_number;
	        }
	        else if(floorDiff>ceilingDiff) {
	         	return high_number;
	        }
	        else
	        	return low_number;
	        
		
	    }
	    
	    
	    boolean isPalindrome(Long number){
	        String input=new Long(number).toString();
	        int i=0;
	        int j=input.length()-1;
	        
	        while(i<=j){
	            if(input.charAt(i++)!=input.charAt(j--)){
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		String input="807045053224792883";
		ClosestPalindrome cp=new ClosestPalindrome();
		String answer=new Long(cp.nearestPalindromic(input)).toString();
		System.out.println(answer);
	}
}
