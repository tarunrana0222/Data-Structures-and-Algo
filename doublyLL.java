import java.util.*;
public class doublyLL {
	//doubly ll structure
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int x)
		{
			data=x;
			prev=null;
			next=null;
		}
	}
	//end of node structure
	//add to end
	static Node addEnd(Node head,int x)
	{
		Node temp=new Node(x);
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		while(curr.next!=null)
		{curr=curr.next;}
		curr.next=temp;
		temp.prev=curr;
		return head;
	}
	
	//add at begin
	static Node addBegin(Node head,int x)
	{  Node temp=new Node(x);
		if(head==null)
			return temp;
		else
			temp.next=head;
		head.prev=temp;
		return temp;
			
	}
	// delete head
	static Node deleteHead(Node head)
	{
		if(head==null || head.next==null)
			return null;
		
		Node curr=head.next;
		curr.prev=null;
		return curr;	
	}
	
	//delete end node
	static Node deleteEnd(Node head)
	{
		if(head==null || head.next==null)
			return null;
		
		Node curr=head;
		while(curr.next.next!=null)
		{
			curr=curr.next;
			
		}
		curr.next.prev=null;  //prev of last node
		curr.next=null;        //second last node's next
		return head;
	}
	static Node reverse(Node head)
	{
		Node temp=null,curr=head;
		
		while(curr!=null)
		{ 
			temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        curr = curr.prev;
        
		}
		
		if(temp!=null)
			head=temp.prev; 
		
		return head;
		
	}
	
	
	//print DLL
	static void print(Node head)
	{
		if(head==null)
			System.out.print("Empty");
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
///                                                   main function
	public static void main(String[] args) {
		Node head=null;
		head=addBegin(head,5);
		 head=addBegin(head,10);
		head=addEnd(head,15);
		//head=deleteHead(head);
		//head=deleteEnd(head);
		
		head=reverse(head);
		print(head);
	

	}

}
