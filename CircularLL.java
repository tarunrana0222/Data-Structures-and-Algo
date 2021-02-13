import java.util.*;
class CircularLL{
	static class Node{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	//end of node structure
	//add at the end
	static Node addEnd(Node head,int x)
	{ Node temp=new Node(x);
		if(head==null)
		{
			temp.next=temp;
			return temp;
		}
		temp.next=head.next;
		head.next=temp;
		
		 int swap=head.data;
		 head.data=temp.data;
		 temp.data=swap;
		 return temp;
	}
	//delete head
	static Node deleteHead(Node head)
	{
		if(head==null || head.next==head)
		{
			return null;
		}
		else {
		int temp=head.data;
		head.data=head.next.data;
		head.next.data=temp;
		head.next=head.next.next;
		return head;}
	}
	//delete kth node
	static Node deleteK(Node head,int k)
	{
		if(head==null)
			return head;
		if(k==1)
			return deleteHead(head);
		
		Node curr=head;
		for(int i=0;i<k-2 && curr.next!=null;i++)
			curr=curr.next;
		
		curr.next=curr.next.next;
		return head;
		}
		
		
	//add at the begin
	static Node addBegin(Node head , int x)
	{
		Node temp=new Node(x);
		if(head==null)
		{
			temp.next=temp;
			return temp;
		}
		else
		{
		temp.next=head.next;
		head.next=temp;
		
		int d=head.data;
		head.data=temp.data;
		temp.data=d;
		
		return head;
		}
	}
	//print
	static void print(Node head)
	{
		if(head==null)
			System.out.println("Empty");
		Node curr=head;
		do {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		while(curr!=head);
		
		System.out.println();
	}
	public static void main(String arg[])
	{
		Node head=new Node(1);
		head.next=head;
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=head;
		head=addBegin(head,4);
		head=addEnd(head,5);
		print(head);
		head=deleteK(head,2);
		print(head);
		
	}
}