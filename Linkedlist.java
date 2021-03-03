import java.util.*;

public class Linkedlist {
	// node Structure of Singly linked list
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}
	/////////////////// end node Structure

	// add at begin
	static Node addBegin(Node head, int x) {
		Node temp = new Node(x);
		if (head == null)
			return temp;
		else {
			temp.next = head;
			return temp;
		}
	}

	// add at end
	static Node addEnd(Node head, int x) {
		Node temp = new Node(x);
		if (head == null)
			return temp;
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

	// sorted insert
	static Node sortedInsert(Node head, int key) {
		Node temp = new Node(key);
		if (head == null)
			return null;
		if (head.data > key) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while (curr.next != null && curr.next.data < key) {
			curr = curr.next;

		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}

	// insert at given position
	static Node insertAt(Node head, int x, int pos) {
		Node temp = new Node(x);
		if (head == null)
			return temp;
		if (pos <= 1) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		int count = pos - 1;
		while (curr.next != null && count > 1) {
			curr = curr.next;
			count--;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;

	}

	// deletelast node
	static Node deleteEnd(Node head) {
		if (head == null || head.next == null)
			return null;

		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}

	// delete first node
	static Node deleteBegin(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		head = head.next;
		return head;

	}

	// middle of linked list
	static void printMiddle(Node head) {
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Node : " + slow.data);
	}

	// reverse linked list by iterative approach
	static Node reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node curr = head, prev = null;
		while (curr != null) {
			Node next = curr.next;
			prev = curr;
			curr = next;

		}
		return prev;

	}

	// remove duplicates
	static void remDub(Node head) {
		Node curr = head;
		while (curr != null && curr.next != null) {
			if (curr.data == curr.next.data)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}

	}

	// search item
	static boolean search(Node head, int key) {
		if (head == null)
			return false;
		Node curr = head;
		while (curr != null) {
			if (curr.data == key)
				return true;

			curr = curr.next;
		}
		return false;
	}

	// delete node without head
	static void deleteNode(Node p) {
		Node temp = p.next;
		p.data = p.next.data;
		p.next = temp.next;
	}

	// segregating even and odd nodes from linked list
	static Node segregate(Node head) {
		Node eS = null, eE = null, oS = null, oE = null;
		int i = 0;
		for (Node curr = head; curr != null; curr = curr.next) {
			i = curr.data;
			if (i % 2 == 0) {
				if (eS == null) {
					eS = curr;
					eE = eS;
				} else {
					eE.next = curr;
					eE = eE.next;
				}
			} else {
				if (oS == null) {
					oS = curr;
					oE = oS;
				} else {
					oE.next = curr;
					oE = oE.next;
				}
			}
		}
		if (oS == null || eS == null)
			return head;
		eE.next = oS;
		oE.next = null;
		return eS;
	}

	// intersection point of Y shaped linkedlist
	static int intersectionPoint(Node head1, Node head2) {
		int count1 = 0, count2 = 0;
		Node curr1 = head1, curr2 = head2;
		while (curr1 != null) {
			count1++;
			curr1 = curr1.next;
		}
		while (curr2 != null) {
			count2++;
			curr2 = curr2.next;
		}

		int d = 0;
		if (count1 > count2) {
			d = count1 - count2;
			curr1 = head1;
			curr2 = head2;
			for (int k = 0; k < d; k++) {
				if (curr1 == null)
					return -1;
				curr1 = curr1.next;
			}
			while (curr1 != null && curr2 != null) {
				if (curr1.data == curr2.data)
					return curr1.data;
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
			return -1;

		} else {
			d = count2 - count1;
			curr1 = head1;
			curr2 = head2;
			for (int k = 0; k < d; k++) {
				if (curr2 == null)
					return -1;
				curr2 = curr2.next;
			}
			while (curr1 != null && curr2 != null) {
				if (curr1.data == curr2.data)
					return curr1.data;
				curr1 = curr1.next;
				curr2 = curr2.next;

			}
			return -1;

		}

	}

	// nth node from last
	static Node nthLast(Node head, int key, int pos) {
		Node temp = new Node(key);
		if (head == null)
			return temp;
		int len = 0;
		Node curr = head;
		while (curr != null) {
			len++;
			curr = curr.next;
		}
		if (pos > len) {
			temp.next = head;
			return temp;
		} else {
			curr = head;
			for (int i = 0; i < len - pos; i++) {
				curr = curr.next;

			}

			temp.next = curr.next;
			curr.next = temp;
			return head;
		}

	}

	// to detect loop using flyod cycle detection
	static boolean haveLoop(Node head) {
		if (head == null || head.next == null)
			return false;
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}

		}
		return false;

	}

	// detect and remove loop
	static void detectAndRemove(Node head) {
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (slow != fast)
			return;
		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;

		}
		fast.next = null;
	}

	// first node of loop
	static void loopStart(Node head) {
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (slow != fast)
			return;
		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;

		}
		System.out.println(fast.next.data);

	}

	// lenght of loop
	static void loopLen(Node head) {
		Node slow = head, fast = head;
		int count = 0;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (slow != fast)
			return;
		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;

		}
		while (slow != fast) {
			count++;
			slow = slow.next;
		}
		System.out.println(count);
	}

	// print LL
	static void print(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String arg[]) {

		Node head = null;
//		head=addBegin(head, 10);
//		head=addBegin(head,20);
//		head=addEnd(head,5);
//		head = addBegin(head, 15);
//		head = addBegin(head, 30);
//		print(head);
//		head = deleteBegin(head);
//		print(head);
//		head=deleteEnd(head);
//		print(head);
//		head=insertAt(head,40,0);
		head = addEnd(head, 5);
		head = addEnd(head, 6);
		head = addEnd(head, 7);
		head = addEnd(head, 8);
		head = addEnd(head, 4);
//		// print(head);
//		head = sortedInsert(head, 4);
//		head = sortedInsert(head, 4);
//		head = sortedInsert(head, 5);
//		print(head);
		// printMiddle(head);
		// head=nthLast(head,16,2);
		// remDub(head);
		// print(head);
	Node	head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		
		
		
//		//head.next.next.next.next=head.next;
//		System.out.println(haveLoop( head));
//		loopStart(head);
//		loopLen(head);		
		// detectAndRemove(head);
		// System.out.println(search(head,40));
		System.out.println(intersectionPoint(head,head1));

//		head = segregate(head);
//		print(head);

	}

}
