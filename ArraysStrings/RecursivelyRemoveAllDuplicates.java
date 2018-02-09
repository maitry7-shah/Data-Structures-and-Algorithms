package ArraysStrings;

public class RecursivelyRemoveAllDuplicates {

	public String recursivelyRemove(String input) {
		boolean flag=true;int count=0;
		int length=input.length();
		StringBuilder sb=new StringBuilder(input);
		for(int i=1;i<length;i++) {
			if(sb.charAt(i)==sb.charAt(i-1)) {
				count++;
			}
			else {
				if(count>0) {
						sb.delete(i-count-1, i);
						if(i-count-2>=0)
							i=i-count-2;
						else
							i=0;
						System.out.println(i);
						count=0;
						length=sb.length();
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String input="axxxya";
		RecursivelyRemoveAllDuplicates r=new RecursivelyRemoveAllDuplicates();
		r.recursivelyRemove(input);
	}
}
