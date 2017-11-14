package Heap;

import java.util.PriorityQueue;

public class KthLargestContiguousSumSubArray {

	
    static int kthLargestSum(int arr[],  int k)
    {	int n=arr.length;
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = arr[0];
        for (int i = 2; i <= n; i++)
            sum[i] = sum[i - 1] + arr[i - 1];
         
        PriorityQueue<Integer> Q = new PriorityQueue<Integer> ();
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                int x = sum[j] - sum[i - 1];
    
                if (Q.size() < k)
                    Q.add(x);
                else
                {     
                    if (Q.peek() < x)
                    {
                        Q.poll();
                        Q.add(x);
                    }
                }
            }
        }
         
      
        return Q.poll();
    }
	
	public static void main(String[] args) {
		 int a[] = new int[]{ 1,2,3 };
	        
	        int k = 6;
	
	        System.out.println(kthLargestSum(a, k)); 
		
	}
}
