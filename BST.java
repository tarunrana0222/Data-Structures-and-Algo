import java.util.*;

public class BST {
	// structure of tree
	static class TreeNode {
		int key;
		TreeNode left, right;

		TreeNode(int k) {
			key = k;
		}
		// inorder

	}

	static void inorder(TreeNode root) {
		if (root == null)
			return;
		else {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}

	}

	// search
	static int search(TreeNode root, int x) {
		if (root == null)
			return -1;
		else {
			if (root.key == x)
				return root.key;
			else if (root.key < x)
				return search(root.right, x);
			else
				return search(root.left, x);

		}
	}

	// floor
	static int floor(TreeNode root, int x) {
		TreeNode res = null;
		while (root != null) {
			if (root.key == x)
				return root.key;
			else if (root.key > x)
				root = root.left;
			else {
				res = root;
				root = root.right;
			}
			
		}
		return res.key;
	}
	
	//ciel
	static int ciel(TreeNode root,int x)
	{
		TreeNode res=null;
		while(root!=null)
		{
			if(root.key==x)
				return root.key;
			else if(root.key<x)
			{
				root=root.right;
			}
			else
			{
				res=root;
				root=root.left;
			}
		}
		return res.key;
	}

	// insert in BST
	static TreeNode insert(TreeNode root, int k) {
		if (root == null) {
			return new TreeNode(k);
		}
		if (root.key < k)
			root.right = insert(root.right, k);
		if (root.key > k)
			root.left = insert(root.left, k);

		return root;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(25);
		root.left = new TreeNode(15);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(18);
		root.left.left.right = new TreeNode(12);
		root.right.left = new TreeNode(28);
		root.right.right = new TreeNode(70);

//		inorder(root);	
//		root=insert(root,5);
//		System.out.println();
//		inorder(root);
//		root=insert(root,52);
//		System.out.println();
//		inorder(root);
		System.out.println(ciel(root, 14));
//		
//		

	}

}
