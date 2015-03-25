
public class Solution {

    public static int numTrees(int n) {
    	if (n <= 0) return 0;
        int[] a = new int[n + 1];
        a[0] = 1;
        for (int i = 1; i <= n; i++)
        	for (int j = 0; j < i; j++) {
        		a[i] += a[j] * a[i - 1 - j];
        	}
        return a[n];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.numTrees(5));
	}

}
