import java.util.ArrayList;
import java.util.List;


public class Solution {

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (numRows < 1) return list;
        if (numRows == 1) {
        	List<Integer> row = new ArrayList<Integer>();
        	row.add(1);
        	list.add(row);
        	return list;
        }
        list = generate(numRows - 1);
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> prev = list.get(list.size() - 1);
        row.add(1);
        for (int i = 1 ; i <= numRows - 2; i++) {
        	row.add(prev.get(i - 1) + prev.get(i));
        }
        row.add(1);
        list.add(row);
        return list;
    }
    
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        if (rowIndex < 0) return row;
        if (rowIndex == 0) {
        	row.add(1);
        	return row;
        }
        row.add(1);// k = 0
        if (rowIndex == 1) {
        	row.add(1);
        	return row;
        }
        row.add(1);// k = 1;
        
        for (int i = 1; i <= rowIndex; i++) {
        	for (int j = 1; j <= i - 1; j++) {
        		if (j == 1) {
        			row.add(j, row.get(j - 1) + row.get(j));
        		}
        		else {
        			row.add(j, row.get(j) + row.get(j + 1));
        			row.remove(j + 1);
        		}
        	}
        }
        return row;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(0));
		System.out.println(getRow(4));
	}

}
