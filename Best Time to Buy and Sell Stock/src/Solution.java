
public class Solution {
    public static int maxProfit(int[] prices) {
    	if (prices.length <= 1) return 0;
    	int n = prices.length;
        int min = prices[0], ans = 0;
        prices[0] = 0;
        for (int i = 1; i < n; i++) {
        	if (prices[i] < min) {
        		min = prices[i];
        		prices[i] = 0;
        	} else
        		prices[i] = Math.max(prices[i - 1], prices[i] - min);
        	ans = Math.max(prices[i], ans);
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,1};
		System.out.println(Solution.maxProfit(a));
	}

}
