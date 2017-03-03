
public class BuySellStock {
	public static int maxProfit(int[] prices) {
		if(prices.length<=0){
			return 0;
		}
		int soFarMin=prices[0];
		int maxDiff=0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]>soFarMin){
				maxDiff=maxDiff>(prices[i]-soFarMin)?maxDiff:(prices[i]-soFarMin);
			}
			else{
				soFarMin=prices[i];
			}
		}
		return maxDiff;
    }	
	public static void main(String[] args) {
//		int[] prices={7,1,5,3,6,4};
		int[] prices={};
		System.out.println(maxProfit(prices));
	}
}
