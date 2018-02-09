package SegmentTree;

import java.util.ArrayList;

public class SegmentTreetoFindSumofGivenRange {
	int[] st;
	
	SegmentTreetoFindSumofGivenRange(int[] arr){
		  int x = (int) (Math.ceil(Math.log(arr.length) / Math.log(2)));
		  
	        //Maximum size of segment tree
	        int max_size = 2 * (int) Math.pow(2, x) - 1;
	 
	        st = new int[max_size]; // Memory allocation
		int a=constructSegmentTree(arr, 0, arr.length-1,0);
		System.out.println("maitri");
	}
	
	public int constructSegmentTree(int[] arr,int startIndex, int endIndex, int index) {
		if(startIndex<0 || startIndex>endIndex) {
			return 0;
		}
		
		if(startIndex==endIndex )
		{
			st[index]=arr[startIndex];
			return st[index];
		}
		
		int mid=(startIndex+endIndex)/2;
		
		st[index]=constructSegmentTree(arr,startIndex,mid,2*index+1)
				+constructSegmentTree(arr,mid+1,endIndex,2*index+2);
		
		return st[index];
		
	}

	public int sumUtil(int[] arr, int startIndex,int endIndex,
			int queryStartIndex,int queryEndIndex, int index ) {
		
		if(endIndex<queryStartIndex ||queryEndIndex<startIndex || queryEndIndex<queryStartIndex)
			return 0;
		
		if(startIndex>=queryStartIndex &&  endIndex<=queryEndIndex)
			return st[index];
		
		int mid=(startIndex+endIndex)/2;
		
		return sumUtil(arr,startIndex,mid,queryStartIndex,queryEndIndex,2*index+1)
				+sumUtil(arr,mid+1,endIndex,queryStartIndex,queryEndIndex,2*index+2);
	}
	

	
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,11};
		SegmentTreetoFindSumofGivenRange stree=new SegmentTreetoFindSumofGivenRange(arr);
		System.out.println(stree.sumUtil(arr, 0,arr.length-1,4,5,0));
	}
}
