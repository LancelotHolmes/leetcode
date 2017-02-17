
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums=new int[]{1,1,1,2,2,3,3,3,5,7};
//		int[] nums=new int[]{};
		int cnt=nums.length;
		for(int i=0,j=i+1;j<nums.length;j++){
			if(nums[i]==nums[j]){
				cnt--;
			}
			if(nums[i]!=nums[j]){
				i++;
				nums[i]=nums[j];
			}
		}
//		return cnt;
//		System.out.println(cnt);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]);
		}
	}
}
