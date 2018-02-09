package ArraysStrings;

class Point{
	int x;
	int y;
	
	Point(){
		this.x=0;
		this.y=0;
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class IndexesofElementofMaximumSumSubArray {

	public Point returnIndexofMaxSum(int[] arr) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		Point p=new Point();
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
	
			if(max<sum)
			{
				max=sum;
				p.y=i;
			}
			
			if(sum<0)
			{
				sum=0;
				p.x=i;
			}
			
		}
		int temp=p.y;
		while(max!=0) {
			max=max-arr[temp];
			temp--;
		}
		p.x=temp+1;
		return p;
	}
	
	public static void main(String[] args) {
		IndexesofElementofMaximumSumSubArray i=new IndexesofElementofMaximumSumSubArray();
		int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
		Point p=i.returnIndexofMaxSum(arr);
		System.out.println(p.x);
		System.out.println(p.y);
	}
}
