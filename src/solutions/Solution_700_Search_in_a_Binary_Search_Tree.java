class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
    TreeNode(int x, TreeNode left, TreeNode right) {
    	val = x;
    	this.left = left;
    	this.right = right;
    }
};

public class Solution_700_Search_in_a_Binary_Search_Tree {
	
	private TreeNode targetNode = null;
	
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		getTargetNode(root, val);
		return this.targetNode;
    }
	
	public void traverse(TreeNode root) {
		if (root == null) {
			
		}
		System.out.println(root.val);
		if (root.left != null) {
			traverse(root.left);
		}
		if (root.right != null) {
			traverse(root.right);
		}
	}
	
	public void getTargetNode(TreeNode root, int val) {
		if (root.val == val) {
			this.targetNode = root;
		}
		if (root.left != null) {
			getTargetNode(root.left, val);
		}
		if (root.right != null) {
			getTargetNode(root.right, val);
		}
	}
	
	public TreeNode getTargetNode() {
		return this.targetNode;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(7, null, null));
		
		Solution_700_Search_in_a_Binary_Search_Tree obj = new Solution_700_Search_in_a_Binary_Search_Tree();
		obj.traverse(obj.searchBST(root, 2));	
	}

}
