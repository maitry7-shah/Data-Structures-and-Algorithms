package ArraysStrings;

public class KMPPatternSearch {

	public boolean kMPPatternSearch(String input,String set) {
		int[] arr=new int[input.length()];
		//char[] carray=input.toCharArray();
		arr[0]=0;
		int j=0;
		for(int i=1;i<arr.length;i++) {
			while(input.charAt(j)!=input.charAt(i) && j>0)
			{
				j=arr[j-1];	
			}
		
			if(input.charAt(i)==input.charAt(j))
			{
				arr[i]=j+1;
				j++;
			}
		}
		
		j=0;
		for(int i=0;i<set.length();i++) {
			if(set.charAt(i)!=input.charAt(j) && j>0) {
				j=arr[j-1];
			}
			if(j==input.length()-1)
			{
				return true;
			}
			j++;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		String input="abcaby";
		String toSearch="abxabcabcaby";
		KMPPatternSearch k=new KMPPatternSearch();
		System.out.println(k.kMPPatternSearch(input, toSearch));
	}
}
