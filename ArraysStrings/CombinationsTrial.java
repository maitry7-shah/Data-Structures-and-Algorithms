package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class CombinationsTrial {

	public List<String> findCombinations(String arr) {
		List<String> result=new ArrayList<>();
		 combinations(arr,result, 0,new StringBuilder() );
		 return result;
	}
	
	private void combinations(String arr, List<String> result, int start,StringBuilder temp) {
		if(!result.contains(temp))
		result.add(new StringBuilder(temp).toString());
		
		for(int i=start;i<6;i++) {
			temp.append(arr.charAt(i));
			combinations(arr,result,i+1,temp);
			temp.deleteCharAt(temp.length()-1);
			
		}
	}

	public static void main(String[] args) {
		CombinationsTrial c=new CombinationsTrial();
		String arr = "()()()";
		List<String>  ans=c.findCombinations(arr);
		System.out.println(ans.size());
	}
}
