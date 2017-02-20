import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindDisappearedNo {
    public static void main(String[] args) {
//      int[] nums=new int[0];
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> test=findDisappearedNumbers(nums);    
        System.out.println(test.toString());
    }
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> numsList=new ArrayList<>(n);

        //traverse the array and map the element(since it's within 1~n) to index(0~n-1) 
        //and mark the element of index negative the first time the element visit
        for(int i=0;i<nums.length;i++){
            int val=Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val]=-nums[val];
            }
        }
        //the index of positive means the according element never appears
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                numsList.add(i+1);
            }
        }        
        return numsList;
    }

}
