import java.util.*;

public class josh {
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	//{1,0,2,0,3,4,5,0};
	static void moveZeros(int arr[])
	{   int count=0;
		for(int i=0;i<arr.length;i++)
		{ if(arr[i]==0)
		{
			int temp=arr[i];
			arr[i]=arr[count];
			arr[count]=temp;
			count++;
			
		}
		
			
		}
	}
	static void keypad(String s)
	{   HashMap<Character,Integer> h=new HashMap<>();
		s=s.toLowerCase();
		char arr[]=s.toCharArray();
		h.put('a',2);
		h.put('b',22);
		h.put('c',222);
		h.put('d',3);
		h.put('e',33);
		h.put('f',333);
		h.put('g',4);
		h.put('h',44);
		h.put('i',444);
		h.put('j',5);
		h.put('k',55);
		h.put('l',555);
		h.put('m',6);
		h.put('n',66);
		h.put('o',666);
		h.put('p',7);
		h.put('q',77);
		h.put('r',777);
		h.put('s',7777);
		h.put('t',8);
		h.put('u',88);
		h.put('v',888);
		h.put('w',9);
		h.put('x',99);
		h.put('y',999);
		h.put('z',9999);
		h.put(' ',0);


		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(h.get(arr[i]));	
		}
	}
	
	static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	static Node spiral(Node head) {
		if (head == null)
			return head;

		// counting no of nodes
		Node curr = head;
		int count = 0;
		while (curr != null) {
			curr = curr.next;
			count++;
		}
		curr = head;

		// checking nodes are even or odd
		Node left, right;
		if (count % 2 == 0) {
			for (int i = 0; i < (count / 2)-1; i++) {
				curr = curr.next;
			}
			left = curr;
			right = curr.next;

		} else {
			for (int i = 0; i < (count / 2) -1 ; i++) {
				curr = curr.next;
			}
			left = curr;
			right = curr.next;
		}

		// reversing nodes form head to left
		Node end=left.next;
		curr = head;
		Node prev = null;
		while (curr != end) {
			Node next = curr.next;
			curr.next=prev;
			prev = curr;
			curr = next;
		}
		head.next=right;
		head = prev;
		
		

		// now arranging in spiral order
		if (count % 2 == 0) {
			curr = head;
			head=left;
			for (int i = 0; i < (count / 2)-1; i++) {
				Node nextR = right.next;
				Node nextL = left.next;
				
				
		       left.next=right;
		        right.next=nextL;
				left = nextL;
				right = nextR;
			}
			return head;
		}
		
		else
		{
			curr = head;
			head=right;
			for (int i = 0; i < count / 2; i++) {
				Node nextR = right.next;
				Node nextL = left.next;

				right.next=left;
				left.next=nextR;
				left = nextL;
				right = nextR;
			}
			return head;
		}

	}

	public static void main(String str[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);

//		print(head);
//		System.out.println();
//		head=spiral(head);
//		print(head);
		//keypad("Hello World");
		int arr[]=new int[] {0,1,0,0,3,4,5,0,0};
		moveZeros(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
