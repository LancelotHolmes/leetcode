import java.util.HashSet;

public class ContainDuplicate {
	public static void main(String[] args) {
		int[] nums=new int[]{1,2,3,1,4,2};		
		System.out.println(containsDuplicate(nums));
//		System.out.println(sets.size()!=nums.length);
	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> sets=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(sets.contains(nums[i])){
				return true;
			}
			sets.add(nums[i]);
		}
		return false;
	}
}
