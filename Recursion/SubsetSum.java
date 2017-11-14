package Recursion;

public class SubsetSum {
	public boolean subsetSum(int[] array,int index, int number) {
		
		 if(number==0)
				return true;
		
		if(number<0 || index<0)
			return false;
		
		
		
		return subsetSum(array,index-1,number-array[index]) || subsetSum(array,index-1,number) ;
		
		
	}
	
	public static void main(String args[]) {
		SubsetSum ss=new SubsetSum();
		int n=9;
		int s[]= {3, 34, 4, 12, 5, 2};
		boolean p=ss.subsetSum(s, s.length-1,n);
		System.out.println(p);
	}
}
