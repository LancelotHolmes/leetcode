import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindDisappearedNo {
	public static void main(String[] args) {
//		int[] nums=new int[0];
		int[] nums={4,3,2,7,8,2,3,1};
		List<Integer> test=findDisappearedNumbers(nums);
		
		System.out.println(test);
//		System.out.println();
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int n=nums.length;
        List<Integer> numsList=new ArrayList<>(n);
        //add all elements of 1~n        
        for(int i=1;i<=n;i++){
        	numsList.add(i);
        }
        //traverse the array and remove elements appeared in List
        for(int i=0;i<nums.length;i++){
        	if(numsList.contains(nums[i])){
        		//to distinguish with remove(index)
        		numsList.remove(new Integer(nums[i]));        		        		
        	}
        }
        return numsList;
    }

}
