
public class Solution {

    public static int maxProduct(int[] A) {
    	int n = A.length;
    	int[] pos = new int[n], nag = new int[n];
    	int max = A[0];
    	pos[0] = A[0];
    	nag[0] = A[0];
        for (int i = 1; i < n; i++) {
        	pos[i] = Math.max(A[i], Math.max(pos[i - 1] * A[i], nag[i - 1] * A[i]));
        	nag[i] = Math.min(A[i], Math.min(pos[i - 1] * A[i], nag[i - 1] * A[i]));
        	max = Math.max(pos[i], max);
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2,3,-4};
		System.out.println(Solution.maxProduct(a));
	}

}
