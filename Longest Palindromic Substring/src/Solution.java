
public class Solution {
	public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int n = s.length(), max = 0, min = 0;
        boolean[][] b = new boolean[n][n];
        for (int i = 0; i < n; i++) b[i][i] = true;
        for (int k = 1; k < n; k++) {
        	for (int i = 0; i < n - k; i++) {
        		int j = i + k;
        		if (k <= 1) 
        			b[i][j] = s.charAt(i) == s.charAt(j);
        		else b[i][j] = b[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
        		if (b[i][j]) {
        			max = j;
        			min = i;
        		}
        	}
        }
        return s.substring(min, max + 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.longestPalindrome("aba"));
	}

}
