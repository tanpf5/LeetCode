
public class Solution {
    public static int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return sumOfNumbers(root, 0, 0);
    }
	private static int sumOfNumbers(TreeNode root, int number, int sum) {
		// TODO Auto-generated method stub
		number = number * 10 + root.val;
		if (root.left == null && root.right == null) {
			sum += number;
			return sum;
		}
		if (root.left != null) sum = sumOfNumbers(root.left, number, sum);
		if (root.right != null) sum = sumOfNumbers(root.right, number, sum);
		return sum;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		System.out.println(Solution.sumNumbers(root));
	}
}
