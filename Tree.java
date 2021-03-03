import java.util.Queue;
import java.util.*;

public class Tree {
	// Structure of Tree
	static class Node {
		int key;
		Node left;
		Node right;

		Node(int k) {
			key = k;
			left = right = null;
		}
	}

	// Inorder
	static void inorder(Node root) {
		if (root == null)
			return;
		else {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	// Preorder
	static void preorder(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right);

		}
	}

	// Postorder
	static void postorder(Node root) {
		if (root == null)
			return;
		else {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + " ");
		}

	}

	// height
	static int height(Node root) {
		if (root == null)
			return 0;
		else {
			return (1 + Math.max(height(root.left), height(root.right)));
		}
	}

	// print nodes at k distance from node
	static void nodeAtK(Node root, int k) {
		if (root == null)
			return;
		if (k == 0)
			System.out.print(root.key + " ");
		else {
			nodeAtK(root.left, k - 1);
			nodeAtK(root.right, k - 1);
		}
	}

	// level Order Traversal
	static void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.isEmpty() == false) {
			Node curr = q.poll();
			System.out.print(curr.key + " ");
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);

		}

	}

	// level order travesel line by line

	static void levelLine(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.isEmpty() == false) {

			int count = q.size();
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();
				System.out.print(curr.key + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);

			}
			System.out.println();
		}
	}

	// Size of Treee
	static int size(Node root) {
		if (root == null)
			return 0;
		else
			return (1 + size(root.left) + size(root.right));
	}

	// Max in tree
	static int getMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		else
			return (Math.max(root.key, Math.max(getMax(root.left), getMax(root.right))));
	}

	// Left view of tree
	static void leftView(Node root) {
		if (root == null) {
			return;

		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.isEmpty() == false) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();
				if (i == 0)
					System.out.print(curr.key);
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);

			}
			System.out.println();
		}
	}

	// Children Property of binary tree
	static boolean childProp(Node root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
		int sum = 0;
		if (root.left != null)
			sum += root.left.key;
		if (root.right != null)
			sum += root.right.key;

		return (root.key == sum && childProp(root.left) && childProp(root.right));

	}

	// balanced tree
	static int Balanced(Node root) {
		if (root == null)
			return 0;
		int lt = Balanced(root.left);
		if (lt == -1)
			return -1;
		int rt = Balanced(root.right);
		if (rt == -1)
			return -1;

		if (Math.abs(lt - rt) > 1)
			return -1;
		else
			return Math.max(lt, rt) + 1;
	}

	static int width(Node root) {
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int res = 0;
		while (q.isEmpty() == false) {
			int size = q.size();
			res = Math.max(res, size);
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null)
					q.add(curr.right);
			}

		}
		return res;
	}

	// tree to dll
	static Node treeToLL(Node root) {
		if (root == null)
			return root;
		Node prev = null;
		Node head = treeToLL(root.left);
		if (prev == null)
			head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		treeToLL(root.right);
		return head;
	}

	// print tree in spiral form
	static void printSpiral(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		boolean reverse = false;
		q.add(root);
		while (q.isEmpty() == false) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();
				if (reverse)
					s.add(curr.key);
				else
					System.out.print(curr.key + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			if (reverse) {
				while (s.isEmpty() == false) {
					System.out.print(s.pop() + " ");
				}
			}
			reverse = !reverse;
			System.out.println();
		}
	}

//Make a tree from Inorder and Preorder Array
	static int preIndex = 0;

	static Node createTree(int inorder[], int preorder[], int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;
		Node root = new Node(preorder[preIndex]);
		preIndex++;
		int midIndex = inStart;
		for (int i = inStart; i < inEnd; i++) {
			if (inorder[i] == root.key) {
				midIndex = i;
				break;
			}

		}
		root.left=createTree(inorder,preorder,inStart,midIndex-1);
		root.right=createTree(inorder,preorder,midIndex+1,inEnd);
		return root;

	}
	
	//diameter of tree
	static int res=0;
	static int diameter(Node root)
	{
		if(root==null)	
			return 0;
		int lh=diameter(root.left);
		int rh=diameter(root.right);
		res=Math.max(res,1+lh+rh);
		return (1+Math.max(lh, rh));
		
		
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(1);
		root.left.left = new Node(2);
		root.left.right = new Node(6);

		// inorder(root);
		// preorder(root);
		// postorder(root);
		// System.out.println(height(root));
		// nodeAtK(root,2);
		// levelOrder(root);
		// levelLine(root);
		// System.out.println(size(root));
		// System.out.println(getMax(root));
		// leftView(root);
		// System.out.println(childProp(root));
//		if(Balanced(root)>0)
//			System.out.println("Balanced");
//		else
//			System.out.println("not balanced")	;
		// System.out.println(width(root));
		// System.out.println(treeToLL(root));
		//printSpiral(root);
		
//		int in[]=new int[] {11,12,9,10,15,14,16};
//		int pre[]=new int[] {10,12,11,9,14,15,16};
//		postorder(createTree(in,pre,0,6));
		
		System.out.println("Height "+ diameter(root));
		System.out.println("Diameter : "+res);
		
		
	}

}
