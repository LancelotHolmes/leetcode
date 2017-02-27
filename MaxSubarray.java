
public class MaxSubarray {
	public static void main(String[] args) {
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
//		int[] nums={1};
		System.out.println(maxSubArray(nums));
	}
	public static int maxSubArray(int[] nums) {
		int maxSoFar=nums[0],maxEndingHere=nums[0];
		for(int i=1;i<nums.length;i++){
			maxEndingHere=nums[i]+(maxEndingHere>=0?maxEndingHere:0);
			maxSoFar=Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
    }
//	public static int maxSubArray(int[] nums,int begin,int end) {        
//    }
	
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
