
public class BuySellStock {
	public static int maxProfit(int[] prices) {
		int maxDiff=0;
		for(int i=1;i<prices.length;i++){
			int diff=prices[i]-minPrice(prices,i-1);
			maxDiff=maxDiff<diff?diff:maxDiff;
		}
		return maxDiff;
    }
	public static int minPrice(int[] prices,int p){
		if(p==0){
			return prices[p];
		}
		return minPrice(prices,p-1)<prices[p]?minPrice(prices,p-1):prices[p];
	}
	public static void main(String[] args) {
//		int[] prices={7,1,5,3,6,4};
		int[] prices={9,1,12};
		System.out.println(maxProfit(prices));
	}
}
