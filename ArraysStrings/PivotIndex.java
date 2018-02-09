package ArraysStrings;

public class PivotIndex {
	public int pivotIndex(int[] nums) {
		if(nums.length==0)
			return 0;
		int previ=Integer.MIN_VALUE;
		int prevj=Integer.MIN_VALUE;

		int i=0, leftSum=0;
		int j=nums.length-1, rightSum=0;
		while(i<j){
			if(previ!=i)
			{
				leftSum+=nums[i];
				previ=i;
			}
			if(prevj!=j)
			{
				rightSum+=nums[j];
				prevj=j;
			}
			if(leftSum==rightSum)
			{	if(i+1==j-1)
				return i+1;
			}

			if(leftSum>rightSum){

				j--;
			}
			else if(leftSum<rightSum){

				i++;
			}


		}
		return -1;
	}
	public static void main(String[] args) {
		PivotIndex p=new PivotIndex();
		int[] arr= {-1,-1,-1,-1,-1,0};
		System.out.println(p.pivotIndex(arr));
	}
}
