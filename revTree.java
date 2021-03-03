import java.util.*;
import java.util.Queue;

public class revTree {
	// tree structure
	static class Node {
		int key;
		Node left, right;

		Node(int k) {
			key = k;
			left = right = null;
		}
	}
	// end

	// Inorder Traversal of tree
	static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);

	}

	// Preorder Traversal
	static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.key + " ");
		preorder(root.left);
		preorder(root.right);

	}

	// postorder traversal
	static void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key + " ");

	}

	// height of tree
	static int height(Node root) {
		if (root == null)
			return 0;
		return (1 + Math.max(height(root.left), height(root.right)));
	}

	// print nodes at k distance
	static void nodeAtK(Node root, int k) {
		if (root == null)
			return;
		if (k == 0) {
			System.out.print(root.key + " ");
		}
		nodeAtK(root.left, k - 1);
		nodeAtK(root.right, k - 1);
	}

	//level order travelsal in single line
	static void level(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			Node curr=q.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
			
		}
	}
	
	//level order traversal line by line
	static void levelLine(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			int size=q.size();
			for(int i=0;i<size;i++)
			{
				Node curr=q.poll();
				System.out.print(curr.key+" ");
				
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
	//size of tree
	static int size(Node root)
	{
		if(root==null)
			return 0;
		return (1+size(root.left)+size(root.right));
	}
	
	//maxium element in tree
	static int max(Node root)
	{
	 if(root==null)
		 return Integer.MIN_VALUE;
	 return (Math.max(root.key, Math.max(max(root.left), max(root.right))));
	}
	
	//left view of subtree
	static void leftView(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false)
		{   int count=q.size();
		
			for(int i=0;i<count;i++)
			{ Node curr=q.poll();
				if(i==0)
					System.out.print(curr.key);
				if(curr.left!=null)	
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
	
	//children sum property {root=left+right}
	static boolean childPro(Node root)
	{
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		int sum=0;
		if(root.left!=null)
			sum+=root.left.key;
		if(root.right!=null)
			sum+=root.right.key;
	     return(root.key==sum && childPro(root.left) && childPro(root.right));
		
	}
	//tree to dll
	static Node treeToLL(Node root)
	{ Node prev=null,curr=root;
		if(curr==null)
		return curr;
		
		Node head=treeToLL(root.left);
		if(prev==null)
			head=curr;
		else
			{prev.right=curr;
		curr.left=prev;}
		
		prev=curr;
		
		treeToLL(root.right);
		return head;
		
	}
	
	
	
	////////////////*****************************////////////////*****************///////////////************//////////
	public static void main(String[] args) {
		Node root = new Node(9);
		root.left = new Node(5);
		root.right = new Node(4);
		root.left.left = new Node(3);
		root.left.right = new Node(2);
		root.right.left = new Node(4);
		//root.right.right = new Node();

		// inorder(root);
		// preorder(root);
		// postorder(root);
		// System.out.println(height(root));
		// nodeAtK(root,2);
		//level(root);
		//levelLine(root);
		//System.out.println(size(root));
		//System.out.println(max(root));
		//leftView(root);
		//System.out.println(childPro(root));
		treeToLL(root);
		inorder(root);
	}

}
