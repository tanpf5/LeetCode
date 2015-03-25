
public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
    	if (root == null) return false;
    	if ((root.left == null) && (root.right == null) && (sum - root.val == 0)) return true;
    	if ((root.left != null) && (hasPathSum(root.left, sum - root.val))) return true;
    	if ((root.right != null) && (hasPathSum(root.right, sum - root.val))) return true;
		return false; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
