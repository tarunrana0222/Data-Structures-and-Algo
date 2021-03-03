import java.util.*;

public class revLinkedList {
	static class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
			next = null;
		}
	}

	// print LL
	static void print(Node head) {
		Node curr = head;

		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
	}

	// insert at begin
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		if (head == null)
			return temp;
		else {
			temp.next = head;
			return temp;
		}
	}

	// insert at last
	static Node insertLast(Node head, int x) {
		Node temp = new Node(x);
		if (head == null)
			return temp;
		Node curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = temp;
		return head;
	}

	// insert at index
	static Node insertIndex(Node head, int x, int index) {
		Node temp = new Node(x);
		if (head == null)
			return temp;
		if (index == 0) {
			temp.next = head;
			return temp;
		}

		Node curr = head;
		int i = 0;
		while (curr.next != null && i < index - 1) {
			curr = curr.next;
			i++;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}

	// delete from head

	static Node deleteHead(Node head) {
		if (head == null)
			return head;
		else
			return head.next;
	}

	// delete from tail
	static Node deleteTail(Node head) {
		if (head == null || head.next == null)
			return null;
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;

		}
		curr.next = null;
		return head;

	}

	// delete at given index
	static Node deleteIndex(Node head, int x) {
		if (head == null || head.next == null)
			return null;
		if (x == 0)
			return head.next;
		Node curr = head;
		int a = 0;
		while (curr.next.next != null && a < x - 1) {
			curr = curr.next;
			a++;
		}
		curr.next = curr.next.next;
		return head;
	}

	// search in ll
	static boolean search(Node head, int x) {
		Node curr = head;
		while (curr != null) {
			if (curr.val == x)
				return true;
			curr = curr.next;
		}
		return false;
	}

	// sorted insert
	static Node sortedInsert(Node head, int x) {
		Node temp = new Node(x);
		Node curr = head, slow = null;
		while (curr.next != null) {
			if (curr.val < x) {
				slow = curr;
				curr = curr.next;
			} else
				break;
		}
		if (slow == null) {
			temp.next = head;
			return temp;

		}
		if (curr.val < x) {
			curr.next = temp;
			return head;
		}
		temp.next = slow.next;
		slow.next = temp;
		return head;
	}

	// middle of linked list
	static int middle(Node head) {
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}

	// nth node from the end
	static int nThNode(Node head, int n) {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		curr = head;

		for (int i = 1; i < count - n + 1; i++) {
			curr = curr.next;
		}
		return curr.val;
	}

	// reverse the linked list
	static Node reverse(Node head) {
		Node curr = head, prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	// remove duplicates from the sorted array
	static Node remDup(Node head) {
		Node curr = head;
		while (curr.next != null) {
			if (curr.val == curr.next.val)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}
		return head;
	}

	// reverse in group
	static Node reverseGroup(Node head, int k) {

        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<k){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
            }
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
        }
        return head;
    
	}

	//////////////// ***************************/////////////////////////////////////////////////
	public static void main(String arg[]) {
		Node head = null;
		head = insertLast(head, 1);
		head = insertLast(head, 2);
		head = insertLast(head, 3);
		head = insertLast(head, 4);
		head = insertLast(head, 5);
		head = insertLast(head, 6);

		print(head);
		System.out.println();
		head = reverseGroup(head, 3);

		print(head);

	}
}
