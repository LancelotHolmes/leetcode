package dp;

public class LongestIncreaseSequence {
	public static void main(String[] args) {
		int[] nums={7,5,1,9,3};
		System.out.println(lenOfLongest(nums));
	}
	public static int lenOfLongest(int[] a){
		int max=1;
		int temp_max=1;
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1]){
				temp_max++;
			}
			else{
				max=temp_max>max?temp_max:max;
				temp_max=1;
			}
		}
		return max;
	}
}
