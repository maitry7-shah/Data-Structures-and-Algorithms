package Recursion;

public class LongestCommonSubsequenceRecursion {

	public int findLongestCommonSequence(String firstArray,String secondArray, int firstArrayIndex,int secondArrayIndex) {
		if(firstArrayIndex==-1 || secondArrayIndex==-1)
			return 0;
		
		if(firstArray.charAt(firstArrayIndex)==secondArray.charAt(secondArrayIndex) ){
			return 1+ findLongestCommonSequence(firstArray,secondArray,firstArrayIndex-1,secondArrayIndex-1);
		}
		else
			return Math.max(findLongestCommonSequence(firstArray,secondArray,firstArrayIndex-1,secondArrayIndex),findLongestCommonSequence(firstArray,secondArray,firstArrayIndex,secondArrayIndex-1));
	}
	
	
	public static void main(String args[]) {
		String first= "AGGTAB";
		String second="GXTXAYB";
		LongestCommonSubsequenceRecursion lcs=new LongestCommonSubsequenceRecursion();
		
		int result=lcs.findLongestCommonSequence(first,second,first.length()-1,second.length()-1);
		System.out.println(result);
	}
}
