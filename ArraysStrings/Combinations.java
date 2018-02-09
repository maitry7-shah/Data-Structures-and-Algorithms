package ArraysStrings;

// Java program to print all combination of size r in an array of size n
import java.util.*;
 
class Combinations {
 
	public static List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, 0);
	    return list;
	}

	private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    if(tempList.size()==2)
		list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
	        tempList.add(nums[i]);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
	        System.out.print(i);
	    }
	   
	}

    public static void main (String[] args) {
        int arr[] = {1,2,3};
        int n = arr.length;
        List<List<Integer>> ans=subsets(arr);
        
    }
}