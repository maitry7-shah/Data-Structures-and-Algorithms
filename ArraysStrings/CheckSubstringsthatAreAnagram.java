package ArraysStrings;


import java.util.*;

public class CheckSubstringsthatAreAnagram{

  public static void main(String[] args){
    System.out.println(checkAnagram("OGE","GOOGLE"));
  }
  
  public static boolean checkAnagram(String input, String input1){
	String longestString = input;
	String shortestString = input1;
	if(input.length() < input1.length()){
		longestString = input1;
		shortestString = input;
	}	

	List<String> subStrings = new ArrayList<>();
	for(int i=0; i< longestString.length();i++){
		if(i+shortestString.length() <=longestString.length()){
			subStrings.add(longestString.substring(i,i+shortestString.length()));
		}
	}
		
	for(String subString: subStrings){
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character character :subString.toCharArray()){
			if(map.containsKey(character)){
				map.put(character, map.get(character)+1);
			}else{
				map.put(character,1);
			}
		}

		boolean check = true;
		for(Character c :shortestString.toCharArray()){
			if(!map.containsKey(c)){
				check = false;
				break;
			}else{
				if(map.get(c) > 0){
					map.put(c, map.get(c)-1);
				}else{
					check = false;
					break;
				}
			}
		}
		if(check){
			return true;
		}
	}
	return false;
}

  
  
  
}