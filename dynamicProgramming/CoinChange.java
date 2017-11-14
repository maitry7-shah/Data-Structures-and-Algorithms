
public class CoinChange {
	public int coinChange(int number,int[] set,int sindex) {
		
		if(number==0)
		return 1;
		
		if(number<0 || sindex<0)
		return 0;
		
		
		
		return coinChange(number,set,sindex-1) + coinChange(number-set[sindex],set,sindex);
			
		
	}
	
	public static void main(String args[]) {
		CoinChange cc=new CoinChange();
		int n=10;
		int s[]= {1,2,3};
		int p=cc.coinChange(n,s,2);
		System.out.println(p);
	}
}
