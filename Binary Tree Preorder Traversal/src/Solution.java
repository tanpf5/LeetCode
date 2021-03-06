import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
 /*   public static List<Integer> preorderTraversal(TreeNode root) {    	
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) return l;
        return preorder(root, l);
    }
	
	private static List<Integer> preorder(TreeNode root, List<Integer> l) {
		// TODO Auto-generated method stub
		l.add(root.val);
		if (root.left != null) l = preorder(root.left, l);
		if (root.right != null) l = preorder(root.right, l);
		return l;
	}*/

/*	public static List<Integer> preorderTraversal(TreeNode root) {   
		List<Integer> l = new ArrayList<Integer>();
		if (root == null) return l;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while (!s.isEmpty()) {
        	TreeNode tn = s.pop();
        	l.add(tn.val);
        	if (tn.right != null) s.push(tn.right);
        	if (tn.left != null) s.push(tn.left);
        }
        return l;
    }*/
	public static List<Integer> preorderTraversal(TreeNode root) {   
		List<Integer> l = new ArrayList<Integer>();
		if (root == null) return l;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null) {
        	while (current != null) {
        		l.add(current.val);
        		if (current.right != null) s.push(current.right);
        		current = current.left;
        	}
        	if (!s.empty()) current = s.pop();
        }
        return l;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		System.out.println(Solution.preorderTraversal(root));
	}

}
