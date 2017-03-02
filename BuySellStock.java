
public class BuySellStock {
	public static int maxProfit(int[] prices) {
        int maxDiff=0;
        for(int i=prices.length-1;i>0;i--){
    		int max=prices[i],min=prices[i];
        	for(int j=i-1;j>=0;j--){
        		if(prices[j]<min){
        			min=prices[j];
        		}        		
        	}
        	if(maxDiff<(max-min)){
        		maxDiff=(max-min);
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
