import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static int minimumTotal(List<List<Integer>> triangle) {
    	int min = Integer.MAX_VALUE, n = triangle.size();
        int[] a = new int[n];
        int[] b = new int[n];
        int j = 0;
        for (List<Integer> l : triangle) {
        	int i = 0;
        	for (int x : l) {
        		if (j == 0) { 
        			b[0] = x;
        			break;
        		}
        		if (i == 0) {
        			b[i] = a[i] + x;
        			++i;
        			continue;
        		}
        		if (i == j) {
        			b[i] = a[i - 1] + x;
        			++i;
        			continue;
        		}
        		b[i] = Math.min(a[i], a[i - 1]) + x;
        		++i;
        	}
        	a = b.clone();
        	++j;
        }
        for (int i = 0; i < n; i++)
        	min = Math.min(min, b[i]);
    	return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList();
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		triangle.add(l);
		l = new ArrayList<Integer>();
		l.add(3);
		l.add(4);
		triangle.add(l);
		l = new ArrayList<Integer>();
		l.add(6);
		l.add(5);
		l.add(7);
		triangle.add(l);
		l = new ArrayList<Integer>();
		l.add(4);
		l.add(1);
		l.add(8);
		l.add(3);
		triangle.add(l);
		System.out.println(Solution.minimumTotal(triangle));
	}

}
