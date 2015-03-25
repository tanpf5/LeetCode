
public class Solution {

    public static int uniquePaths(int m, int n) {
    	int[] a = new int[n];
    	a[0] = 1;
    	for (int j = 1; j < n; j++)
    		a[j] = a[j - 1];
    	for (int i = 1; i < m; i++)
    		for (int j = 0; j < n; j++)
    			if (j != 0)
    				a[j] += a[j - 1];
    	return a[n - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.uniquePaths(3, 2));
	}

}
