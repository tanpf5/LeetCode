import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public static List<List<Integer>> fourSum(int[] num, int target) {
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (num == null || num.length < 4) return ans;
        Arrays.sort(num);
        nSum(num, target, 0, 4, ans, new ArrayList<Integer>());
        return ans;
    }
	private static void nSum(int[] num, int target, int s, int n, List<List<Integer>> ans, List<Integer> triplet) {
		// TODO Auto-generated method stub
		if (n == 2) {
			twoSum(num, target, s, ans, triplet);
			return;
		}
		for (int i = s; i < num.length - (n - 1); i++) {
			if (i - 1 >= s && num[i] == num[i - 1])
				continue;
			triplet.add(num[i]);
			nSum(num, target - num[i], i + 1, n - 1, ans, triplet);
			triplet.remove(triplet.size() - 1);
		}
	}
	private static void twoSum(int[] num, int target, int s, List<List<Integer>> ans, List<Integer> triplet) {
		// TODO Auto-generated method stub
		int low = s, high = num.length - 1;
		while (low < high) {
			if (num[low] + num[high] == target) {
				List<Integer> l = new ArrayList<Integer>(triplet);
				l.addAll(Arrays.asList(num[low], num[high]));
				ans.add(l);
			}
			if (num[low] + num[high] < target) 
				while (low < high && num[low + 1] == num[low++]);
			else
				while (low < high && num[high - 1] == num[high--]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {0, 0, 0, 0};
		List<List<Integer>> ans = Solution.fourSum(num, 0);
		for (List<Integer> triplet: ans) {
			for (int x: triplet) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
