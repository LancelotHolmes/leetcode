
public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] nums={0,0,0,0,0};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0,max=0;
        for(int i=0;i<nums.length;i++){        	
        	if(nums[i]==0){        		
        		cnt=0;
        	}
        	else{
        		cnt++;
        	}
        	if(max<cnt){
    			max=cnt;
    		}
        }
        return max;
    }
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
