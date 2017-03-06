package dp;

public class GetMinStep {
	public static void main(String[] args) {
		new GetMinStep();
		System.out.println(getMinStep2(10));
	}
	//DP solution
	public static int getMinStep(int n){
		int[] dp=new int[n+1];
		dp[1]=0;
		for(int i=2;i<=n;i++){
			dp[i]=1+dp[i-1];
			if(i%2==0){
				dp[i]=Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0){
				dp[i]=Math.min(dp[i], dp[i/3]+1);
			}
		}
		return dp[n];
	}
	//Memorization solution
	private static int n=20;
	public static int[] dp=new int[n+1];
	
	public GetMinStep(){
		for(int i=0;i<dp.length;i++){
			dp[i]=-1;
		}
	}
	public static int getMinStep2(int x){
		if(x==1){	//base case
			return 0;
		}
		int r;
		if(dp[x]!=-1){
			return dp[x];
		}
		r=getMinStep2(x-1)+1;
		if(x%2==0){
			r=Math.min(r, 1+getMinStep2(x/2));
		}
		if(x%3==0){
			r=Math.min(r, 1+getMinStep2(x/3));
		}
		dp[x]=r;
		return r;
	}
	
}
