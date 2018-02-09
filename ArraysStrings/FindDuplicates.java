package ArraysStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	    public String removeDuplicateLetters(String s) {
	        Set<Character> set=new HashSet<Character>();
	        
	        char[] arr=s.toCharArray();
	        Arrays.sort(arr);
	        for(Character c:arr){
	            if(!set.contains(c))
	            set.add(c);
	            
	        }
	        
	        
	        
	        StringBuilder sb=new StringBuilder();
	        for(Character key:set){
	        sb.append(key);
	    }
	        return sb.toString();
	}
	    
	    
	public static void main(String[] args) {
		FindDuplicates f=new FindDuplicates();
		System.out.println(f.removeDuplicateLetters("cbacdcbc"));
	}
}
