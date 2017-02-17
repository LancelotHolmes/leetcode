

import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums,int target){
//		HashMap<Integer,int[]> sumIndices=new LinkedHashMap<>();
//		for(int i=0;i<nums.length-1;i++){
//			for(int j=i+1;j<nums.length;j++){			
//				int[] indices=new int[2];
//				indices[0]=i;
//				indices[1]=j;
//				sumIndices.put(nums[i]+nums[j], indices);
//			}
//		}		
//		return sumIndices.get(target);
		
//		int[] result=new int[2];
//		HashMap<Integer,Integer> sumIndices=new LinkedHashMap<>();
//		for(int i=0;i<nums.length;i++){
//			if(sumIndices.containsKey(target-nums[i])){
//				result[1]=i;
//				result[0]=sumIndices.get(target-nums[i]);
//				return result;
//			}
//			sumIndices.put(nums[i], i);
//		}
//		return result;
		Map<Integer,Integer> indices=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(indices.containsKey(target-nums[i])){
				return new int[]{indices.get(target-nums[i]),i};
			}
			indices.put(nums[i], i);
		}
		return new int[]{-1,-1};
	}
	
	public static void main(String[] args) {
		int[] nums={2,7,11,15};
//		int[] nums={3,3};
		int[] indices=new int[2];
		indices=new TwoSum().twoSum(nums,18);
		for(int i=0;i<indices.length;i++)
			System.out.println(indices[i]);
	}
}
