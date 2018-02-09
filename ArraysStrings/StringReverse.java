package ArraysStrings;

public class StringReverse {

	public void stringReverse(String str) {
		StringBuilder sb=new StringBuilder();
		int low=0;
		int high=str.length()-1;
		sb.setLength(str.length());
		while(low<high) {
			sb.insert(low, str.charAt(high));
			sb.insert(high,str.charAt(low));
			high--;
			low++;
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		String a="Maitri";
		StringReverse s=new StringReverse();
		s.stringReverse(a);
	}
}
