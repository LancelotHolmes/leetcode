
import java.util.*;

public class MissingNum {
	public static void main(String[] args) {
//		int[] nums=new int[]{0,1,3};
		int[] nums=new int[]{1,0};
		System.out.println(new MissingNum().missingNumber(nums));
	}
	public int missingNumber(int[] nums) {
//        if(nums.length==1){
//            if(nums[0]==0)
//                return 1;
//            else
//                return 0;
//        }
//		int i=0;
//		for(;i<nums.length;i++){
//			if(i!=nums[i]){
//			    return i;
//			}
//		}
////		return -1;
//		return i;
		//solution 1
//		int xor = 0, i = 0;
//		for (i = 0; i < nums.length; i++) {
//			xor = xor ^ i ^ nums[i];	//ÿһ��Ԫ�غ��±궼��xor�������
//			//����һ�����г��������ε�Ԫ�ػ�ֱ�ӵ���������������һ�ε�Ԫ�ػᱻ��¼����������Ҫ�ҵ�ȱʧԪ��
//		}
//		System.out.println(xor);
//		System.out.println(i);
//		return xor ^ i;
		//solution 2
		int sums=nums.length;
		for(int i=0;i<nums.length;i++){
			sums=sums+i-nums[i];
		}
		return sums;
    }

}
