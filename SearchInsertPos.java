import java.util.*;

public class SearchInsertPos {
	public int searchInsert(int[] nums,int target){
//		if(target<nums[0]){
//			return 0;
//		}
//		if(target>nums[nums.length-1]){
//			return nums.length;
//		}
//		int point=0;
//		for(int i=0;i<nums.length;i++){
//			if(nums[i]==target||(nums[i]>target&&nums[i-1]<target)){
//				point=i;
//				break;
//			}
//		}
//		return point;
		int lo=0,hi=nums.length-1;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(nums[mid]==target){
				return mid;
			}
			else if(nums[mid]>target){
				hi=mid-1;
			}
			else{
				lo=mid+1;
			}
		}
		return lo;
	}
	
	public static void main(String[] args) {
		int[] nums={1,3,5,6};
		System.out.println(new SearchInsertPos().searchInsert(nums, 4));
	}
}
