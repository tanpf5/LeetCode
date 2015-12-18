
public class Solution {
    public static int rob(int[] nums) {
    	if (nums.length == 0) return 0;
        int[] a = new int[nums.length + 1];
        a[0] = 0; a[1] = nums[0];
        for (int i = 1; i < nums.length; i++)
        	a[i + 1] = Math.max(a[i - 1] + nums[i], a[i]);
        return a[nums.length];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 6, 2, 7, 3, 4, 7, 2};
		System.out.println(Solution.rob(nums));
	}

}
