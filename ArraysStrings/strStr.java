package ArraysStrings;

public class strStr {
	
	public int implementstrStr(String haystack,String needle) {
		if(haystack.compareTo(needle)==0)
			return haystack.length();
		
		int len=0;
		len=implementstrStr(haystack.substring(0, haystack.length()-2),needle);
		if(len!=0)
			return len-needle.length();
		else return -1;
	}
	

	public static void main(String[] args) {
		String haystack="hello";
		String needle="ll";
		strStr r=new strStr();
		System.out.println(r.implementstrStr(haystack,needle));
	}
}
