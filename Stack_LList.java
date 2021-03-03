
public class Stack_LList {
	//node class
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	//stack class
	static class myStack{
		Node head;
		int sz;
		myStack()
		{
			head=null;
			sz=0;
		}
		 //stack funtions
		
		void push(int x)
		{
			 Node temp=new Node(x);
			 temp.next=head;
			 head=temp;
			 sz++;
		}
		
		int pop()
		{
			if(head==null)
			{
				System.out.println("empty ");
				return Integer.MIN_VALUE;
				
			}
			int d=head.data;
			head=head.next;
			sz--;
			return d;
		}
		
		int size()
		{
			return sz;
		}
		int peek()
		{
			if(head==null)
			{
				System.out.println("empty ");
				return Integer.MIN_VALUE;
				
			}
			return head.data;
			
		}
		
		boolean isEmpty()
		{
			return (head==null);
		}
	}
	
	

	public static void main(String[] args) {
		myStack  stack=new myStack();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(6);

		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.isEmpty());
		stack.push(5);
		System.out.println(stack.peek());
		System.out.println(stack.size());

	}

}
