
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums=new int[]{4,1,2,3,5};
		int val=4;
//		int i=0;
//		for(int j=0;j<nums.length;j++){
//			if(nums[j]!=val){
//				nums[i++]=nums[j];
//			}
//		}
//		System.out.println(i);
//		System.out.println("-----------");
		
		int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;
	        } else {
	            i++;
	        }
	    }
//	    return n;
	    for(int k=0;k<nums.length;k++){
			System.out.print(nums[k]+" ");
		}
	}
}
