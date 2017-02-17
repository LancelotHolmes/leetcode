
public class MoveZeroes {
	public static void main(String[] args) {
//		int[] nums={0,1,0,3,12};
		int[] nums={1,3,4,0,0,0,2,0,5};
		for(int i=0,j=i+1;i<nums.length&&j<nums.length;){
			if(nums[i]==0&&nums[j]!=0){
				if(i<j){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					i++;
					j++;
				}
				else{
					j=i+1;
				}
			}
			else if(nums[i]==0&&nums[j]==0){
				j++;
			}
			else if(nums[i]!=0&&nums[j]!=0){
				i++;
			}
			else{
				i++;
				j++;
			}
		}
		for(int k=0;k<nums.length;k++){
			System.out.printf(nums[k]+" ");
		}
	}
}
