
public class Solution {

    public static int maxSubArray(int[] A) {
    	int n = A.length;
    	int[] ans = new int[n];
    	ans[0] = A[0];
    	int max = ans[0];
    	for (int i = 1; i < n; i++) {
    		ans[i] = Math.max(A[i], ans[i - 1] + A[i]);
    		max = max < ans[i]? ans[i]: max;
    	}
		return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(Solution.maxSubArray(a));
	}

}
