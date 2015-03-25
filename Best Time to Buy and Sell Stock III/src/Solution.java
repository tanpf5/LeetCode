
public class Solution {
    public static int maxProfit(int[] prices) {
    	if (prices == null || prices.length < 2) return 0;
        int n = prices.length;
        int[][] p = new int[n][n];
        int[] a = new int[n];
        for (int j = 0; j < n - 1; j++) {
	        int min = prices[j];
	        for (int i = j + 1; i < n; i++) {
	        	if (prices[i] < min) {
	        		min = prices[i];
	        		continue;
	        	}
	        	p[j][i] = Math.max(p[j][i - 1], prices[i] - min);
	        }
        }
        for (int i = 1; i < n; i++) {
        	a[i] = p[0][i];
        	for (int j = 1; j < i; j++) {
        		a[i] = Math.max(a[i], p[0][j] + p[j + 1][i]);
        	}
        }
        return a[n - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,1,4,1,5,3,7,8,7,1,3};
		System.out.println(Solution.maxProfit(a));
	}

}
