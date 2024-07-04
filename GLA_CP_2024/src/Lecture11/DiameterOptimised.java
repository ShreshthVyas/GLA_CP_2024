package Lecture11;

import Lecture11.DiameterLeetcode.TreeNode;

public class DiameterOptimised {

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
	    public int diameterOfBinaryTree(TreeNode root) {
	        Diapair temp = dia(root);
	        return temp.d;
	    }
	    public Diapair dia(TreeNode root) {
	    	if(root==null) {
	    		return new Diapair();
	    	}
	    	
	    	Diapair left = dia(root.left);
	    	Diapair right = dia(root.right);
	    	Diapair sdp = new Diapair();
	    	sdp.ht = Math.max(left.ht, right.ht) + 1;
	    	int sd = left.ht + right.ht +2;
	    	sdp.d = Math.max(sd, Math.max(left.d, right.d));
	    	
	    	return sdp;
	    	
	    }
	    class Diapair{
	    	int ht =-1;
	    	int d =0;
	    }
	}

}
