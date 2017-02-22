
public class RotateArray {
	public static void main(String[] args) {
		int[] nums={1,2,3,4,5,6,7};
		printArray(nums);
		rotate(nums,7);
		System.out.println();
		printArray(nums);
	}
	
	public static void rotate(int[] nums, int k) {
		int n=nums.length;
		if(k>n){
			k%=n;
		}
		reverseArray(nums,0,n-k-1);
		reverseArray(nums,n-k,n-1);
		reverseArray(nums,0,n-1);		
    }
	public static void reverseArray(int[] a,int start,int end){
		int temp=0;
		for(int i=start,j=end;i<j;i++,j--){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
//		return a;
	}
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
