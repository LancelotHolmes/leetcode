import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle3 {
	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> pList=new ArrayList<List<Integer>>();        
	    pList.add(Arrays.asList(1));
	    if(rowIndex==0){
	    	return pList.get(0);
	    }
	    pList.add(Arrays.asList(1,1));
	    if(rowIndex==1){
	    	return pList.get(1);
	    }
	    for(int i=2;i<=rowIndex;i++){
	    	List<Integer> innerList=new ArrayList<Integer>();
	    	innerList.add(1);
	    	for(int j=1;j<i;j++){
	    		innerList.add((pList.get(i-1).get(j-1)+pList.get(i-1).get(j)));
	    	}
	    	innerList.add(1);
	    	pList.add(innerList);
	    }
	    return pList.get(rowIndex);
	}
	public static void main(String[] args) {
		System.out.println(getRow(1));
	}
}
