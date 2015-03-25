
public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int ans = 0;
        for (int i = 0; i < 32; i++) {
        	ans += n & 1;
        	n = n >>> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
    	System.out.println(Solution.hammingWeight(-2147483648));
    }
}
