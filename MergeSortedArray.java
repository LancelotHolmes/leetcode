
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1={0};
		int[] nums2={1};
		merge(nums1,0,nums2,1);
		for(int i=0;i<1;i++){
			System.out.print(nums1[i]+" ");
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n!=0){	
			if(m==0){
				for(int i=0;i<n;i++){
					nums1[i]=nums2[i];
				}
				return;
			}
	        if(nums1[m-1]<nums2[0]){
	        	for(int i=m;i<m+n;i++){
	        		nums1[i]=nums2[i-m];
	        	}
	        	return;
	        }
	        if(nums1[0]>nums2[n-1]){
	        	for(int i=n+m-1;i>=n;i--){
	        		nums1[i]=nums1[i-n];
	        	}
	        	for(int i=0;i<n;i++){
	        		nums1[i]=nums2[i];
	        	}
	        	return;
	        }
	        
	        int i=m-1,j=n-1,k=m+n-1;
	        while(i!=-1&&j!=-1){
	        	nums1[k--]=(nums1[i]>nums2[j]?nums1[i--]:nums2[j--]);
	        }
	        while(j!=-1){
	        	nums1[k--]=nums2[j--];
	        }
		}
    }

}
