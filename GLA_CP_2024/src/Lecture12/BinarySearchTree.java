package Lecture12;


public class BinarySearchTree {
	
	public class Node{
		int val ;
		Node left;
		Node right;
	}
	private Node root;
	
	public BinarySearchTree(int arr[]) {
		this.root = createTree(arr,0,arr.length-1);
	}

	private Node createTree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		int mid = (si+ei)/2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = createTree(arr, si, mid-1);
		nn.right = createTree(arr, mid+1, ei);
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
	

}
