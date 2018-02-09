package ArraysStrings;

public class BinaryAddition {

	
	public String addBinary(String b1,String b2) {
		
		char[] c1=b1.toCharArray();
		char[] c2=b2.toCharArray();
		int length1=c1.length;
		int length2=c2.length;
		int max=Math.max(length1, length2);
		char[] newc1=new char[length1];
		char[] newc2=new char[length1];
		char[] result=new char[max];
		
		if(length1>length2) {
			
			System.arraycopy(c2, 0, newc2, length1-length2, length2);
			
			for(int i=0;i<length1-length2;i++) {
				newc2[i]='0';
			}
			System.arraycopy(c1, 0, newc1, 0, length1);
		}
		else if(length1<length2) {
			System.arraycopy(c2, 0, newc1, length2-length1, length1);
			
			for(int i=0;i<length2-length1;i++) {
				newc1[i]='0';
			}
			System.arraycopy(c2, 0, newc2, 0, length2);
		}
		int carry=0;
		
		for(int i=max-1;i>=0;i--) 
		{
			int a=newc1[i]-'0';
			int b=newc2[i]-'0';
			int sum=a^b^carry;
			carry=a&b;
			result[i]=(char) (sum + '0');
			
		}
	
		
		
		return new String(result);
	}
	
	public static void main(String[] args) {
		BinaryAddition b =new BinaryAddition();
		System.out.println(b.addBinary("110110","0101"));
		
	}
}
