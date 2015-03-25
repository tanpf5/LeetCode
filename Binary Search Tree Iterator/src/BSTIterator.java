import java.util.Stack;


public class BSTIterator {

	TreeNode node = null;
	Stack<TreeNode> stack = new Stack<TreeNode>();
	
    public BSTIterator(TreeNode root) {
        node = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !(stack.empty() && node == null);
    }

    /** @return the next smallest number */
    public int next() {
        if (node != null) {
        	while (node.left != null) {
        		stack.push(node);
        		node = node.left;
        	}
        } else {
        	node = stack.pop();
        }
    	int val = node.val;
    	node = node.right;
        return val;
    }

}
