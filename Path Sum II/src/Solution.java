import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	if (root == null) return ans;
    	List<Integer> l = new ArrayList<Integer>();
    	pathSumPaths(root, sum, ans, l);
    	return ans;
    }
	private static void pathSumPaths(TreeNode root, int sum,
			List<List<Integer>> ans, List<Integer> l) {
		// TODO Auto-generated method stub
		if (root.left == null && root.right == null) 
			if (root.val == sum) {
				List<Integer> ll = new ArrayList<Integer>(l);
				ll.add(root.val);
				ans.add(ll);
				return;
			}
			else return;
		List<Integer> ll = new ArrayList<Integer>(l);
		ll.add(root.val);
		if (root.left != null) 
			pathSumPaths(root.left, sum - root.val, ans, ll);
		if (root.right != null) 
			pathSumPaths(root.right, sum - root.val, ans, ll);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		List<List<Integer>> ans = Solution.pathSum(root, 22);
		for (List<Integer> triplet: ans) {
			for (int x: triplet) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
