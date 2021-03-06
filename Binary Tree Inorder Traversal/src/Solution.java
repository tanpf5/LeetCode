import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
/*    public static List<Integer> inorderTraversal(TreeNode root) {    	
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) return l;
        return inorder(root, l);
    }
	
	private static List<Integer> inorder(TreeNode root, List<Integer> l) {
		// TODO Auto-generated method stub
		if (root.left != null) l = inorder(root.left, l);
		l.add(root.val);
		if (root.right != null) l = inorder(root.right, l);
		return l;
	} */

	public static List<Integer> inorderTraversal(TreeNode root) {    	
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) return l;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null || !s.isEmpty()) {
        	while (current != null) {
        		s.push(current);
        		current = current.left;
        	}
        	current = s.pop();
        	l.add(current.val);
        	current = current.right;
        }
        return l;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		System.out.println(Solution.inorderTraversal(root));
	}

}
