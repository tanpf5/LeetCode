
public class Solution {
    public static int numDistinct(String S, String T) {
        if (S == null || T == null) return 0;
        int m = S.length();
        int n = T.length();
        if (m <= n) return S.equals(T) ? 1 : 0;
        int[][] a = new int[m + 1][n + 1];
        a[0][0] = 1;
        for (int i = 1; i <= m; i++) a[i][0] = 1;
        for (int j = 1; j <= n; j++) a[0][j] = 1;
        for (int j = 1; j <= n; j++)
        	for (int i = j; i <= m; i++) {
        		if (S.charAt(i - 1) != T.charAt(j - 1))
        			a[i][j] = a[i - 1][j];
        		else {
        			int x = 1, y = 1;
        			while (i - x - 1 >= 0 && S.charAt(i - x - 1) == S.charAt(i - x)) ++x;
        			while (j - y - 1 >= 0 && T.charAt(j - y - 1) == T.charAt(j - y)) ++y;
        			if (y > x) {
        				a[i][j] = 0;
        				continue;
        			}
        			int z1 = 1, z2 = 1, x1 = x, y1 = y;
        			while (y1 > 0) {
        				z1 *= x1;
        				z2 *= y1;
        				x1--;
        				y1--;
        			}
        			z1 /= z2;
        			a[i][j] = a[i - x][j - y] * z1;
        		}
        	}
        return a[m][n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "rabbbbit";
		String s2 = "rabbit";
		System.out.println(Solution.numDistinct(s1, s2));
	}

}
