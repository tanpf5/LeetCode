public class Solution {
    public int removeElement(int[] A, int elem) {
        int ans = A.length;
        int[] count = new int[A.length];
        int c = 0;
        for (int i = 0; i <= A.length - 1; i++) {
        	if (A[i] == elem) { 
        		ans--; c++; count[i] = Integer.MAX_VALUE;
        	}
        	else count[i] = c;
        }
        for (int i = 0; i <=A.length - 1; i++) {
        	if (i - count[i] >= 0) A[i - count[i]] = A[i]; 
        }
        return ans;
    }
}
