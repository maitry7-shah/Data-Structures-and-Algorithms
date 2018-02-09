package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	int count=0;
	public List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   backtrack(list, new ArrayList<>(), nums);
		   return list;
		}

		private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
			count++;
			if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		    	  
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         backtrack(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		      }
		   }
		}
		
		  public static void main (String[] args) {
		        int arr[] = {1,2,3};
		        int n = arr.length;
		        Permutations p=new Permutations();
		        List<List<Integer>> ans=p.permute(arr);
		        System.out.println(p.count);
		    }
}
