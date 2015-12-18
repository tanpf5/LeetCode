import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public static List<List<Integer>> threeSum(int[] num) {
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	if (num == null || num.length < 3) return ans;
    	Arrays.sort(num);
    	for (int i = 0; i < num.length - 2; i++) {
    		if (i - 1 >= 0 && num[i] == num[i - 1]) continue;
    		int new_target = 0 - num[i];
    		int j = i + 1, k = num.length - 1;
    		while (j < k) {
    			if (num[j] + num[k] == new_target) {
    				ans.add(Arrays.asList(num[i], num[j], num[k]));
    			}
    			if (num[j] + num[k] < new_target)
    				while (j < k && num[j + 1] == num[j++]) ;
    			else 
    				while (j < k && num[k - 1] == num[k--]) ; 
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-1, 0, 1, 2, -1, -4, -1};
		List<List<Integer>> ans = Solution.threeSum(num);
		for (List<Integer> triplet: ans) {
			for (int x: triplet) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
