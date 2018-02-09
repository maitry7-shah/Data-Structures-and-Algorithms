package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms {

	public boolean meetingRooms(Interval[] intervals) {
		PriorityQueue<Interval> q=new PriorityQueue<Interval>(new Comparator<Interval>() {
			
			@Override
			public int compare(Interval i1,Interval i2) {
				if(i1.start>i2.start)
					return 1;
				else if(i1.start==i2.start)
					return 0;
				else
					return -1;		
			}
			
		});
		
		for(Interval i:intervals)
		{
			q.add(i);
		}
		
	
		while(!q.isEmpty()) {
			Interval temp=q.poll();
			if(q.peek()!=null && temp.end>q.peek().start)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Interval[] intervals= {new Interval(15,30), new Interval(35,70),new Interval(75,90), new Interval(2,13) };
		MeetingRooms m=new MeetingRooms();
		System.out.println(m.meetingRooms(intervals));
	}
}
class Interval{
	int start;
	int end;
	
	Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
}