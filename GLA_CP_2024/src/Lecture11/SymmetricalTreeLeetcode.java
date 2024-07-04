package Lecture11;

import Lecture11.DiameterLeetcode.TreeNode;

public class SymmetricalTreeLeetcode {

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

	public boolean isSymmetric(TreeNode root) {
		return isSym(root.left,root.right);
	}

	private boolean isSym(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1==null && root2 ==null) { // dono null
			return true;
		}
		if(root1==null || root2 ==null) { // Ek null
			return false;
		}
		if(root1.val != root2.val) {
			return false;
		}
		
		boolean checkone = isSym(root1.left, root2.right);
		boolean checktwo = isSym(root1.right,root2.left);
		
		return checkone && checktwo;
	}

}
