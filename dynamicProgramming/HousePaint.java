package dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class HousePaint {

	static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cost[][] = {{1,2,3},{9,4,12},{8,5,6},{7,10,11},{13,14,15}};
		
		list = new ArrayList<Integer>();
		HousePaint h = new HousePaint();
		h.calculateMinimumCost(cost,0,-1,0);
		System.out.println(Collections.min(list));
		
		
		System.out.println(h.minPaintCost(cost));
	}

	private void calculateMinimumCost(int[][] cost, int houseNumber,int prevIndex,int sum) {
		
		if(houseNumber==cost.length) {
			list.add(sum);
			return;
		}
		
		for(int i=0;i<cost[houseNumber].length;i++) {
			if(prevIndex!=i) {
				calculateMinimumCost(cost, houseNumber+1, i, sum+cost[houseNumber][i]);
			}
		}
		
	}
	
	public int minPaintCost(int[][] cost) {
	    if (cost == null || cost.length == 0) return 0;
	    int[][] dp = new int[cost.length][3];
	    dp[0][0] = cost[0][0];
	    dp[0][1] = cost[0][1];
	    dp[0][2] = cost[0][2];
	    for (int i = 1; i < cost.length; ++i) {
	        dp[i][0] = cost[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
	        dp[i][1] = cost[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
	        dp[i][2] = cost[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
	    }
	    return Math.min(dp[dp.length-1][0], Math.min(dp[dp.length-1][1],dp[dp.length-1][2]));
	}

}
