package BitManipulation;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
	    int xor = x ^ y, count = 0;
	    for (int i=0;i<32;i++) 
	    	count += (xor >> i) & 1;
	    return count;
	}
	
	public static void main(String[] args) {
		HammingDistance hd=new HammingDistance();
		System.out.println(hd.hammingDistance(1, 4));
	}
}
