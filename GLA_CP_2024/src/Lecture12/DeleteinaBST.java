package Lecture12;

import Lecture12.InsertIntoBST.TreeNode;

public class DeleteinaBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) {
			return null;
		}
		
		if(root.val> key) {
			root.left = deleteNode(root.left, key);
		}
		else if(root.val< key) {
			root.right = deleteNode(root.right, key);
		}
		else { //key found
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else { //both child present
				int temp = max(root.left); //get max from left subtree
				deleteNode(root.left, temp); //delete the max
				root.val = temp; // replace value
			}
		}
		return root;
	}
	
	public int max(TreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int r = max(root.right);
		
		return Math.max(root.val, r);
	}

}
