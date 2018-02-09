package ArraysStrings;

import java.util.*;

public class WordLadder {

	public int wordLadder(String beginWord,String endWord, List<String> wordList) {
		HashSet<String> set=new HashSet<String>();
		HashSet<String> endSet=new HashSet<String>();
		HashSet<String> beginSet=new HashSet<String>();
		
		        if(beginWord.equals(endWord))
		            return 0;
		        int length=0;
		       
		        endSet.add(beginWord);
		        beginSet.add(beginWord);
		        set.add(beginWord);
		        while(!beginSet.isEmpty() && !endSet.isEmpty()) {
		        	if (beginSet.size() > endSet.size()) {
			        	HashSet<String> t=beginSet;
			        endSet=t;
			        beginSet=endSet;
		        }
		        	HashSet<String> temp=new HashSet<String>();
		       
		        for(String str: beginSet){
		            char[] c=str.toCharArray();
		            for(int j=0;j<str.length();j++){
		                for(char i='a'; i<='z';i++){
		                	    char old=c[j];
		                    c[j]=i;
		                    String newString=String.valueOf(c);
		                    if(newString.equals(endWord))
		                        return length+1;
		                    
		                    if(!set.contains(newString) && wordList.contains(newString)) {
		                    	temp.add(newString);
		                        set.add(newString);
		                    }
		                    c[j]=old;
		                }
		                
		            }
		            beginSet=temp;
		           length++;
		        }
		        }
		        
		        return length;
		    
		
		
	}
	
	public static void main(String[] args) {
		WordLadder w=new WordLadder();
		List<String> wordList=new ArrayList<String>();
//		wordList.add("hot");
//		wordList.add("dot");
//		wordList.add("dog");
//		wordList.add("lot");
//		wordList.add("log");
//		wordList.add("cog");
		wordList.add("a");
		wordList.add("b");
		wordList.add("c");
		System.out.println(w.wordLadder("a", "c", wordList));
		
	}
}
