package Lecture12;

import Lecture12.DeleteinaBST.TreeNode;

public class ValidateBST {

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
	
	class Solution {
	    public boolean isValidBST(TreeNode root) {
	    	return isBST(root).isbst;
	        
	    }
	    
	    public BSTpair isBST(TreeNode root) {
	    	if(root == null) {
	    		return new BSTpair();
	    	}
	    	BSTpair left = isBST(root.left);
	    	BSTpair right =isBST(root.right);
	    	BSTpair sp = new BSTpair();
	    	sp.max = Math.max(root.val, Math.max(left.max,right.max));
	    	sp.min = Math.min(root.val, Math.min(left.min, right.min));
	    	sp.isbst = left.isbst && right.isbst && root.val >left.max && root.val < right.min;
	    	return sp;
	    }
	    
	    
	    class BSTpair{
	    	boolean isbst = true;
	    	long max = Long.MIN_VALUE;
	    	long min = Long.MAX_VALUE;
	    }
	}

}
