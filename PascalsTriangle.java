import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {		
        List<List<Integer>> pList=new ArrayList<List<Integer>>();
        if(numRows==0){
        	return pList;
        }
        pList.add(Arrays.asList(1));
        if(numRows==1){
        	return pList;
        }
        pList.add(Arrays.asList(1,1));
        if(numRows==2){
        	return pList;
        }
        for(int i=2;i<numRows;i++){
        	List<Integer> innerList=new ArrayList<Integer>();
        	innerList.add(1);
        	for(int j=1;j<i;j++){
        		innerList.add((pList.get(i-1).get(j-1)+pList.get(i-1).get(j)));
        	}
        	innerList.add(1);
        	pList.add(innerList);
        }
        return pList;
    }
	public static void main(String[] args) {
//		List<List<Integer>> pList=new ArrayList<List<Integer>>();
//        pList.add(Arrays.asList(1));
//        pList.add(Arrays.asList(2,3));
//        System.out.println(pList.get(1).get(1));
		System.out.println(generate(0));
	}
}
