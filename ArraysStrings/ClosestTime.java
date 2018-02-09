package ArraysStrings;

import java.util.Arrays;
import java.util.*;

public class ClosestTime {

	public String nextClosestTime(String time) {
		String newTime = null;
		String[] val=time.split(":");
		int hour=Integer.parseInt(val[0]);
		int minute=Integer.parseInt(val[1]);
		int[] digit=new int[4];
		digit[0]=hour/10;
		digit[1]=hour%10;
		digit[2]=minute/10;
		digit[3]=minute%10;
		List<String> times=new ArrayList<String>();
		Arrays.sort(digit);
		boolean flag=false;
		for(int i=0;i<digit.length;i++) {
			for(int j=0;j<digit.length;j++) {
				for(int k=0;k<digit.length;k++) {
					for(int l=0;l<digit.length;l++) {
						if(!times.contains(""+digit[i]+""+digit[j]+":"+digit[k]+""+digit[l]))
						{
							newTime=""+digit[i]+""+digit[j]+":"+digit[k]+""+digit[l];
							
							if (isValid(newTime)) {times.add(newTime);}
													
							
						}
					}
				}
				
				
			}
			
			
		}
		return nextClosestTime(times,time);
	}

	public String nextClosestTime(List<String> times,String time)
	{	
		int index=times.indexOf(time);
		if(index+1>times.size()-1)
			return times.get(0);
		else
			return times.get(index+1);
	}


	public boolean isValid(String newTime) {
		String[] val=newTime.split(":");
		int hour=Integer.parseInt(val[0]);
		int minute=Integer.parseInt(val[1]);
		if(hour<24 && minute<60)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
		ClosestTime p=new ClosestTime();

		String ans=p.nextClosestTime("19:52");
		System.out.println(ans);
		String ans1=p.nextClosestTime("23:59");
		System.out.println(ans1);
	}

}
