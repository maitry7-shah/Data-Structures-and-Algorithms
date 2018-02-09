package dynamicProgramming;

public class KnapSackProblem {

	public static int knapSack(int totalWeight,int[] individualWeights, int[] value) {

		int[][] dp=new int[individualWeights.length+1][(totalWeight)+1];

		for(int i=0;i<=individualWeights.length;i++) {
			for(int j=0;j<=totalWeight;j++) {
				if(i==0|| j==0)
				dp[i][j]=0;
				else {
				if(j>=individualWeights[i-1]) {

										System.out.println(dp[i-1][j]);
										System.out.println(dp[(i-individualWeights[i-1])][(j-individualWeights[i-1])]);
										System.out.println(value[i-1]);
										
					dp[i][j]=Math.max(dp[i-1][j],(dp[(i-1)][(j-individualWeights[i-1])]+value[i-1]));

				}
				else
				dp[i][j]=dp[i][j-1];

			}

		}
			}
				
//				if(individualWeights[i-1]>j) {
//					
//					dp[i][j] = Math.max(value[i-1], dp[i-1][j]);
//				
//				}
		

		return dp[individualWeights.length][totalWeight];
	}

	public static void main(String[] args) {
		int val[] = {6, 10, 12};
		int wt[] = {1, 2, 3};
		int  W = 5;

		System.out.println(knapSack(W, wt, val));


	}
}
