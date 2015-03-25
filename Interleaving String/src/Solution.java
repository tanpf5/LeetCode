
public class Solution {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) return false;
        int x = s1.length(), y = s2.length(), z = s3.length();
        if (x + y != z) return false;
        if (x == 0) return s2.equals(s3);
        if (y == 0) return s1.equals(s3);
        boolean[][] b = new boolean[x + 1][y + 1];
        b[0][0] = true;
        for (int i = 1; i <= x; i++) b[i][0] = b[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        for (int j = 1; j <= y; j++) b[0][j] = b[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        for (int i = 1; i <= x; i++)
        	for (int j = 1; j <= y; j++) {
        		b[i][j] = (b[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) 
        				|| (b[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
        	}
        return b[x][y];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "";
		String s3 = "";
		System.out.println(Solution.isInterleave(s1, s2, s3));
	}

}
