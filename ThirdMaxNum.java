
public class ThirdMaxNum {
//	public int thirdMax(int[] nums){
//		
//	}
	public int thirdMax(int[] nums){
		Integer max1=null;
		Integer max2=null;
		Integer max3=null;
		for(Integer n:nums){
			if(n.equals(max1)||n.equals(max2)||n.equals(max3)){//这个判断很精髓，直接跳过了重复的元素，默认各个元素唯一性
				continue;
			}
			if(max1==null||n.compareTo(max1)>0){
				max3=max2;
				max2=max1;
				max1=n;
			}
			else if(max2==null||n.compareTo(max2)>0){
				max3=max2;
				max2=n;
			}
			else if(max3==null||n.compareTo(max3)>0){
				max3=n;
			}
		}
		return max3==null?max1:max3;
	}
	
	public static void main(String[] args) {
//		int[] nums=new int[]{1,3,4,5,7,7,9};
		int[] nums=new int[]{2,2,3,1};
//		int[] nums=new int[]{1,2};
//		int[] nums=new int[]{3,2,1};
		int min=nums[0];
		for(int i=0;i<nums.length;i++){
			if(min>=nums[i]){
				min=nums[i];
			}
		}
		
		int max=min,max2=min,max3=min;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				max3=max2;
				max2=max;
				max=nums[i];
			}
			else if(nums[i]>max2&&nums[i]<max){
				max3=max2;
				max2=nums[i];
			}else if(nums[i]>max3&&nums[i]<max2){
				max3=nums[i];
			}
		}
		if(max2==max3)
			System.out.println(max);
		else
			System.out.println(max3);
//		System.out.println(max2);
		System.out.println(new ThirdMaxNum().thirdMax(nums));
	}
}
