package ArraysStrings;

import java.util.Comparator;
import java.util.TreeSet;

public class RoseBlossom {

	public static int kEmptySlots(int[] flowers, int k) {
		TreeSet<Rose> treeSet = new TreeSet<Rose>(new Comparator<Rose>() {

			@Override
			public int compare(Rose o1, Rose o2) {
				// TODO Auto-generated method stub
				if(o1.value>o2.value)
					return 1;
				else if(o1.value==o2.value)
					return 0;
				else return -1;
			}

		});
		int pre=0,next=flowers.length+1;
		for (int i = 0; i < flowers.length; i++) {

			Rose current=new  Rose(i+1,flowers[i]);
			
			if(treeSet.higher(current)!=null)
			 next = treeSet.higher(current).value;
			
			if (next - current.value == k+1) {
				return current.day;
			}
			
			if(treeSet.lower(current)!=null)
			 pre = treeSet.lower(current).value;
			
			if (current.value-pre== k+1) {
				return current.day;
			}
			
			treeSet.add(current);
		}
		return -1;
	}

	public static  void main(String[] args) {
		int[] P= {2,5,1,4,3};
		RoseBlossom rs=new RoseBlossom();
		int i=kEmptySlots(P,2);
		System.out.println(i);

	}

}

class Rose{
	int day;
	int value;

	Rose(int day,int value){
		this.day=day;
		this.value=value;
	}
}
