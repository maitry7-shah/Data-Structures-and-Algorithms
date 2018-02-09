package ArraysStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class DailyTemperatures {
	 public int[] dailyTemperatures(int[] temperatures) {
	        TreeMap<Integer, List<Integer>> map=new TreeMap<Integer, List<Integer>>();
	        
	        for(int i=0;i<temperatures.length;i++){
	        	
	            if(!map.containsKey(temperatures[i]))
	            {
		            List<Integer> newarr=new ArrayList<Integer>();
		            newarr.add(i);
		            map.put(temperatures[i],newarr);
	            }
	            else
	            {
	                List<Integer> temp=map.get(temperatures[i]);
	                temp.add(i);
	                map.put(temperatures[i],temp);
	            }   
	        }
	        int count;
	        int key=0;
	        int[] result=new int[temperatures.length];
	        for(int i=0;i<temperatures.length;i++){
	            count=0;
	            int temperatureValue=temperatures[i];
	            while(count==0) {
	            		
	            	if(map.higherKey(temperatureValue)!=null)
	            		key=map.higherKey(temperatureValue);
	            	
		            List<Integer> value=map.get(key);
		            for(int j=0;j<value.size();j++){
		                if(value.get(j)>i)
		                {   count=value.get(j)-i;
		                    break;
		                }
		            }
		            temperatureValue=key;
	            }
	            result[i]=count;
	        }
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 int[] arr= {73, 74, 75, 71, 69, 72, 76};
		 DailyTemperatures d=new DailyTemperatures();
		 d.dailyTemperatures(arr);
	 }
}
