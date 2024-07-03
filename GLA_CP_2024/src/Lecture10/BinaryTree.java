package Lecture10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	public class Node{
		int val;
		Node left;
		Node right;
	}
	Scanner sc = new Scanner(System.in);
	private Node root;
	
	public BinaryTree() {
		this.root  = createTree();
	}

	public Node createTree() {
		// TODO Auto-generated method stub
		Node nn = new Node();
		nn.val = sc.nextInt();
		System.out.println("Has Left child?");
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = createTree();
		}
		System.out.println("Has Right child?");
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = createTree();
		}
		return nn;
	}
	
	public void Display() {
		display(root);
	}

	private void display(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return;
		}
		String s = "" + temp.val;
		if(temp.left!=null) {
			s = temp.left.val +"<==" + s;
		}
		else {
			s =  ". <==" + s;
		}
		if(temp.right!=null) {
			s = s+ "==>" + temp.right.val;
		}
		else {
			s =  s +"==> .";
		}
		System.out.println(s);
		display(temp.left);
		display(temp.right);
	}
	
	public int Max() {
		return max(root);
	}

	private int max(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(temp.left);
		int right = max(temp.right);
		
		return Math.max(temp.val, Math.max(left, right));
	}
	
	public boolean Find(int k) {
		return find(root,k);
	}

	private boolean find(Node node, int k) {
		// TODO Auto-generated method stub
		if(node == null) {
			return false;
		}
		if(node.val == k) {
			return true;
		}
		boolean left = find(node.left, k);
		boolean right = find(node.right, k);
		
		return left || right;
	}
	
	public int Height() {
		return height(root);
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return 0;
		}
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		return Math.max(lh, rh) +1;
	}
	
	public void PreOrder() {
		preorder(root);
	}

	private void preorder(Node node) { //NLR
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		System.out.print(node.val + " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void PostOrder() {
		postorder(root);
	}
	
	private void postorder(Node node) {
		if(node == null) {
			return ;
		}
		postorder(node.left);	
		postorder(node.right);
		System.out.print(node.val+ " ");
	}
	
	public void InOrder() {
		inorder(root);
	}

	private void inorder(Node node) {
		// TODO Auto-generated method stub
		if(node ==null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.val);
		inorder(node.right);
	}
	
	public void LevelOrder() {
		levelorder(root);
	}

	public void levelorder(Node node) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			Node nn = q.remove();
			System.out.print(nn.val + " ");
			if(nn.left!=null) {
				q.add(nn.left);
			}
			if(nn.right!=null) {
				q.add(nn.right);
			}
		}
		System.out.println();
	}
}
