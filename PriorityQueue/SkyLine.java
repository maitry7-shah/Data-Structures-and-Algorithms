package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//public class SkyLine {

////	public List<int[]> getSkyline(int[][] buildings) {
////	    List<int[]> result = new ArrayList<int[]>();
////	    ArrayList<Point> points = new ArrayList<Point>();
////	    int n = buildings.length;
////	    for (int i = 0; i < n; ++i) {
////	        points.add(new Point(buildings[i][0], buildings[i][2], 0));
////	        points.add(new Point(buildings[i][1], buildings[i][2], 1));
////	    }
////	    Collections.sort(points, new Comparator<Point>() {
////	        public int compare(Point a, Point b) {
////	        	if(a.val>b.val)
////					return 1;
////				else if(a.val==b.val)
////					return 0;
////				else return -1;
//////	            if (a.val != b.val) return a.val - b.val;
//////	            if (a.flag != b.flag) return a.flag - b.flag;  // Starting point first.
//////	            if (a.flag == 0 && b.flag == 0) return b.height - a.height; // Both starting points, with larger height first.
//////	            return a.height - b.height;     // Both ending points, with smaller height first.
////	        }
////	    });
////	    // Max heap of heights.
////	    PriorityQueue<Integer> heights = new PriorityQueue<Integer>(9, Collections.reverseOrder());
////	    for(Point p : points) {
////	        if (p.flag == 0) {      
////	        // p is a starting point.
////	           if (heights.isEmpty() || p.height > heights.peek()) {
////	               int[] keyPoint = new int[2];
////	               keyPoint[0] = p.val;
////	               keyPoint[1] = p.height;
////	               result.add(keyPoint);
////	           }
////	           heights.add(p.height);
////	        } else {
////	            // This is an ending point.
////	            if (p.height == heights.peek()) {
////	                // This happens to be the highest point.
////	                heights.poll();
////	                if (heights.isEmpty() || p.height > heights.peek()) {
////	                    int[] keyPoint = new int[2];
////	                    keyPoint[0] = p.val;
////	                    keyPoint[1] = heights.isEmpty() ? 0 : heights.peek();
////	                    result.add(keyPoint);
////	                }
////	            }   {
////	                // Does not affect the current height. 
////	            	heights.remove(p.height);
////	            }
////	        }
////	    }
////	    return result;
////	}
////
////	 static class Point {
////	    int val;
////	    int height;
////	    int flag;       // 0 for start and 1 for end.
////	    Point(int val, int height, int flag) {
////	        this.val = val;
////	        this.height = height;
////	        this.flag = flag;
////	    }
////	}
//	
//	public static void main(String[] args) {
//		SkyLine s=new SkyLine();
//		int[][] buildings= { {2, 9, 10}, {3, 7, 15},  {5, 12, 12}, {15, 20, 10}, {19, 24, 8} };
//		List<int[]> answer=s.getSkyline(buildings);
//		}
//	} 
class Point{
	int val;
	int height;
	int flag;

	Point(){
		this.val=0;
		this.height=0;
		this.flag=0;
	}

	Point(int val,int height, int flag){
		this.val=val;
		this.height=height;
		this.flag=flag;
	}
}

class Coordinates{
	int x;
	int y;
	
	Coordinates(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class SkyLine{

	public List<Coordinates>  drawSkyLine(int[][] arr){
		List<Point> points=new ArrayList<Point>();
		for(int[] i:arr ){
			points.add(new Point(i[0],i[2],0));
			points.add(new Point(i[1],i[2],1));

		}

		Collections.sort(points, new Comparator<Point>(){
			@Override
			public int compare(Point p1, Point p2){
				if(p1.val>p2.val)
					return 1;
				else if(p1.val==p2.val)
				{
					if(p1.flag>p2.flag){
						return 1;
					}
					else if(p1.flag==p2.flag){
						return p2.height-p1.height;
					}
					else
						return -1; 

				}
				else
					return -1;
			}
		});

		PriorityQueue<Integer> heights=new PriorityQueue<Integer>(Collections.reverseOrder());
		List<Coordinates> result=new ArrayList<Coordinates>();
		for(Point p: points) {
			if(p.flag==0){
				if(heights.isEmpty() || p.height>heights.peek()){
				
					result.add(new Coordinates(p.val,p.height));
				}
				heights.add(p.height);
			}
			else{
				if(p.height==heights.peek()){
					heights.poll();
					if(heights.isEmpty()){
						result.add(new Coordinates(p.val,0));
					}
					else
					result.add(new Coordinates(p.val,p.height));
					
					
				}
				heights.remove(p.height);
			}
		
	}
		return result;
	}
	public static void main(String[] args){
		int[][] arr={ {2, 9, 10}, {3, 7 ,15}, {5, 12 ,12}, {15 ,20, 10}, {19, 24, 8}	};
		SkyLine s=new SkyLine();
		s.drawSkyLine(arr);
	}
}

