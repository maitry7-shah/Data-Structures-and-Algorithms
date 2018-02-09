package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	
	public List<List<Integer>> findSubsets(int[] input){
		List<List<Integer>> result=new ArrayList<>();
		Arrays.sort(input);
		
		backtrack(input,new ArrayList<Integer>(),result,0);
	
		return result;
	}
	
	
	public void backtrack(int[] arr, List<Integer> tempList,List<List<Integer>> result, int start) {
		result.add(new ArrayList<>(tempList));
		for(int i=start;i<arr.length;i++) {
			if(i>start && arr[i]==arr[i-1]) continue;//for subsets with repetition
			tempList.add(arr[i]);
			backtrack(arr,tempList,result,i+1);
			tempList.remove(tempList.size()-1);
			
		}

	}
	
	
public static void main(String[] args) {
	int[] arr= {1,3,4,5,3,1};
	Subsets s=new Subsets();
	List<List<Integer>> result=s.findSubsets(arr);
	for(int i=0;i<result.size();i++) {
		for(int j=0;j<result.get(i).size();j++) {
			System.out.print(result.get(i).get(j));
		}
	}
}
}
