import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Solution {
 /*   public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new LinkedList<Integer>();
        LinkedList<Integer> l = new LinkedList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while (!s.isEmpty()) {
        	TreeNode tn = s.pop();
        	l.addFirst(tn.val);
        	if (tn.left != null) s.push(tn.left);
        	if (tn.right != null) s.push(tn.right);
        }
        return l;
    }*/
	
	public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        if (root == null) return l;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null || !s.isEmpty()) {
        	while (current != null) {
        		l.addFirst(current.val);
        		if (current.left != null) s.push(current.left);
        		current = current.right;
        	}
        	if (!s.isEmpty()) current = s.pop();
        }
        return l;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		System.out.println(Solution.postorderTraversal(root));
	}

}
