import java.util.Arrays;
import java.util.Stack;


public class Solution {
/*    public static TreeNode buildTree(int[] preorder, int[] inorder) {
    	if (preorder.length == 0) return null;
        int x = preorder[0];
        TreeNode root = new TreeNode(x);
        int inindex = 0;
        while (inorder[inindex] != x) ++inindex;
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + inindex), Arrays.copyOfRange(inorder, 0, inindex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + inindex, preorder.length), Arrays.copyOfRange(inorder, inindex + 1, inorder.length));
        return root;
    } */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
    	if (preorder.length == 0) return null;
        TreeNode dummy = new TreeNode(0);
        TreeNode node = null, curr = dummy;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(dummy);
        int i = 0, j = 0;
        while (j < inorder.length) {
        	if (s.peek().val == inorder[j]) {
        		node = s.pop();
        		j++;
        	} else {
        		if (node == null) {
        			curr = new TreeNode(preorder[i]);
        			s.peek().left = curr;
        			s.push(curr);
        		} else {
        			curr = new TreeNode(preorder[i]);
        			node.right = curr;
        			s.push(curr);
        			node = null;
        		}
        		++i;
        	}
        }
        return dummy.left;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {1, 2, 4, 5, 3};
		int[] inorder = {4, 2, 5, 1, 3};
		TreeNode root = Solution.buildTree(preorder, inorder);
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
/*		while (!s.empty()) {
			TreeNode node = s.pop();
			System.out.print(node.val + " ");
			if (node.left == null) 
				System.out.print("# ");
			else 
				s.push(node.left);
			if (node.right == null) 
				System.out.print("# ");
			else 
				s.push(node.right);
		}*/
	}

}
