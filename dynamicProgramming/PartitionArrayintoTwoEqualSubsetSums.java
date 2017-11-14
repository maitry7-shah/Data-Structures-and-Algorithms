package dynamicProgramming;

public class PartitionArrayintoTwoEqualSubsetSums {
	
	public boolean partitionArray(int[] array,int index,int target) {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum+=array[i];
		}
		if(sum%2==0)
		 target=sum/2;
		else 
			return false;
		
		boolean[][] dp=new boolean[index+1][target+1];
		
		for(int i=0;i<=target;i++) {
			dp[1][i]=false;
		}
		
		return false;
	}

	public static void main(String args[]) {
		PartitionArrayintoTwoEqualSubsetSums ss=new PartitionArrayintoTwoEqualSubsetSums();
		int n=9;
		int s[]= {1,2,3,6,7,5,4};
		boolean p=ss.partitionArray(s, s.length-1,n);
		System.out.println(p);
	}
}
