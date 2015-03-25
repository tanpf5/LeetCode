
public class Solution {
    public static boolean canJump(int[] A) {
    	int max = 0, goal = A.length - 1;
    	if (A.length == 0) return false;
    	if (A.length == 1) return true;
    	max = A[0];
        for (int i = 0; i <= max; i++) {
        	max = Math.max(max, i + A[i]);
        	if (max >= goal) return true;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0};
		System.out.println(Solution.canJump(a));
	}

}
