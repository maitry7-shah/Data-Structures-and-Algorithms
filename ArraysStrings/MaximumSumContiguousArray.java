package ArraysStrings;

public class MaximumSumContiguousArray {

	public int findSum(int[] array) {
		int max_sofar=Integer.MIN_VALUE,sum=0;
		
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
			if(sum<0) {
				sum=array[i];
			}
			max_sofar=Math.max(sum, max_sofar);
		}
		
		
		return max_sofar;
	}
	
	
	public static void main(String args[]) {
		
		MaximumSumContiguousArray m=new MaximumSumContiguousArray();
		int[] arr= {-2,-1,-4};
		int result=m.findSum(arr);
		System.out.println(result);
	}
}
