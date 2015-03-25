
public class Solution {

	public static int singleNumber(int[] A) {
		int ans = 0;
        for (int i = 0; i < A.length; i++)
        	ans = ans ^ A[i];
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 3, 2, 5, 2, 3, 1};
		System.out.println(Solution.singleNumber(A));
	}

}
