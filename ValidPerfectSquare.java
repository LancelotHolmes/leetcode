package binary_search;

public class ValidPerfectSquare {
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(14));
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(2));
		System.out.println(isPerfectSquare(4));
	}
 
	public static boolean isPerfectSquare(int num){
		long lo=1,hi=num;
		while(lo<=hi){
			long mid=(lo+hi)>>>1;
			if(mid*mid==num){
				return true;
			}
			else if(mid*mid<num){
				lo=mid+1;
			}
			else{
				hi=mid-1;
			}			
		}
		return false;
	}
	// square number is 1+3+5+7+...
	public static boolean isPerfectSquare2(int num){
		int i=1;
		while(num>0){
			num-=i;
			i+=2;
		}
		return num==0;
	}
	//Newton method,calculate the square root or num
	public static boolean isPerfectSquare3(int num){
		long x=num;
		while(x*x>num){
			x=(x+num/x)>>1;
		}
		return x*x==num;
	}
	
	
}
