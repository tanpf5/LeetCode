
public class Solution {

    public static int trailingZeroes(int n) {
    	int ans = 0;
        while (n > 0) {
        	ans += n / 5;
        	n = n / 5;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(50));
	}

}
