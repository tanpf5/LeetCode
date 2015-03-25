
public class Solution {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0) return n;
        if (n == 0) return m;
        int [][] ans = new int[m + 1][n + 1];
    	for (int i = 0; i <= m; i++)
    		ans[i][0] = i;
    	for (int j = 0; j <= n; j++)
    		ans[0][j] = j;
    	for (int i = 1; i <= m; i++)
    		for (int j = 1; j <= n; j++) {
    			ans[i][j] = Math.min(ans[i - 1][j], ans[i][j - 1]) + 1;
    			ans[i][j] = Math.min(ans[i][j], ans[i - 1][j - 1] +
    					(word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1));
    		}
    	return ans[m][n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "sunny";
		String word2 = "snowy";
		System.out.println(Solution.minDistance(word1, word2));
	}

}
