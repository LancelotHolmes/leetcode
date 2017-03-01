import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> pList=new ArrayList<Integer>();
		for(int i=0;i<=rowIndex;i++){
			pList.add(1);			
			for(int j=i-1;j>=1;j--){
				pList.set(j,(pList.get(j)+pList.get(j-1)));
			}
		}
		return pList;
    }
	public static void main(String[] args) {
		System.out.println(getRow(1));
	}
}
