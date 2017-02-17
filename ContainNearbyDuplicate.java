import java.util.HashMap;

public class ContainNearbyDuplicate {
	public static void main(String[] args) {
		int[] nums=new int[]{1,2,3,4,1,2,1};		
		System.out.println(containsNearbyDuplicate(nums,3));
	}
	public static boolean containsNearbyDuplicate(int[] nums,int k){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int key=nums[i];
			if(map.containsKey(key)){
				if(i-map.get(key)<=k){
					return true;
				}
			}
			map.put(key, i);
		}
		return false;
	}
}
