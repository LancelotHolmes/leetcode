
public class PlusOne {
	public static void main(String[] args) {
//		int[] nums={1,2,1};
//		int[] nums={9,8,9,9,9};
		int[] nums={9,9};
		printArray(nums);
		nums=plusOne(nums);
		System.out.println();
		printArray(nums);
	}
	 public static int[] plusOne(int[] digits) {
		 int n=digits.length;
		 int i=n-1;
		 while(i>=0){
			 if(digits[i]!=9){				 
				 break;
			 }
			 digits[i--]=0;
		 }
		 if(i==-1){
			 digits=new int[n+1];
//			 digits[0]=1;
			 i++;
		 }
		 digits[i]+=1;
		 return digits;
	 }
	 
	 public static void printArray(int[] a){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
}
