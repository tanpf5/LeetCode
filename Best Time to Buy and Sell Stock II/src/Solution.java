
public class Solution {
    public static int maxProfit(int[] prices) {
    	int buy = -1, max = 0;
    	for (int i = 0; i < prices.length - 1; i++) {
    		if (prices[i] < prices[i + 1])
    			if (buy == -1) 
    				buy = i;
    		if (prices[i] > prices[i + 1])
    			if (buy != -1) {
    				max += (prices[i] - prices[buy]);
    				buy = -1;
    			}
    	}
    	if (buy != -1)
    		max += (prices[prices.length - 1] - prices[buy]);
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,1,4,4,5,3,7,8};
		System.out.println(Solution.maxProfit(a));
	}

}
