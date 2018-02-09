package ArraysStrings;

import java.util.*;

public class LongestSubstringWORepeatingCharacters {

	public int findLengthofLongestRepeatingCharacters(String str) {
		Set<Character> set=new HashSet<Character>();
		int max=Integer.MIN_VALUE;
		int i=0,j=0;
		for(Character c:str.toCharArray()) {
			
			if(set.contains(c)) {
				set.remove(str.charAt(j));
				j++;
			}
			else {
				set.add(c);
				
			}
			max=Math.max(max,set.size() );
		}
	
		return max;
	}
	
	public static void main(String[] args) {
		String str1="abcabcbb";
		LongestSubstringWORepeatingCharacters m=new LongestSubstringWORepeatingCharacters();
		System.out.println(m.findLengthofLongestRepeatingCharacters(str1));
	}
}

