import java.util.*;

public class stackRevision {
///////////////////////////////////////////////////////Stock Span Problem/////////////////////
	static void stockSpan(int arr[]) {
		Stack<Integer> s = new Stack<>();
		s.push(0);
		System.out.print(1 + " ");
		int span = 0;
		for (int i = 1; i < arr.length; i++) {
			while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
				s.pop();
			}
			span = s.isEmpty() ? i + 1 : i - s.peek();
			System.out.print(span+" ");
			s.push(i);

		}

	}
	
	////////////////////////////////////////Prev Greater//////////////////////////////////////
	static void prevGreater(int arr[])
	{
		Stack<Integer> s=new Stack<>();
		s.push(arr[0]);
		System.out.print(-1+" ");
		int pg=0;
		for(int i=1;i<arr.length;i++)
		{
			while(s.isEmpty()==false && s.peek()<=arr[i])
			{
				s.pop();
			}
			pg=s.isEmpty()?-1:s.peek();
			System.out.print(pg+" ");
			s.push(arr[i]);
			
			
		}
	}
//////////////////////////////////////////////////////Balanced Pranthesis/////////////////////////////////////
	static boolean matching(char a, char b) {
		return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
	}

	static boolean balBrackets(String S) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '{' || S.charAt(i) == '[' || S.charAt(i) == '(') {
				st.add(S.charAt(i));
			} else {
				if (st.isEmpty())
					return false;
				else if (matching(st.peek(), S.charAt(i)) == false)
					return false;
				else
					st.pop();
			}

		}
		return st.isEmpty();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static class twoStacks {
		int arr[];
		int top1, top2, cap;

		twoStacks(int size) {
			cap = size;
			arr = new int[cap];
			top1 = -1;
			top2 = cap;
		}

		void push1(int x) {
			if (top1 < top2 - 1) {
				top1++;
				arr[top1] = x;
			} else
				return;
		}

		void push2(int k) {
			if (top1 < top2 - 1) {
				top2--;
				arr[top2] = k;

			} else
				return;
		}

		int pop1() {
			if (top1 > -1) {
				int res = arr[top1];
				top1--;
				return res;
			} else
				return -1;
		}

		int pop2() {
			if (top2 < cap) {
				int res = arr[top2];
				top2++;
				return res;

			} else
				return -1;
		}
	}

	static class stackStruc {
		int[] arr;
		int top;
		int cap;

		stackStruc(int size) {
			cap = size;
			arr = new int[cap];
			top = -1;

		}

		void insert(int a) {
			if (top == cap - 1)
				return;
			top++;
			arr[top] = a;
		}

		int del() {
			if (top == -1)
				return -1;
			int res = arr[top];
			top--;
			return res;
		}

		int size() {
			return top + 1;
		}

		boolean isEmpty() {
			return (top == -1);
		}

		int peak() {
			if (top == -1)
				return -1;
			return arr[top];
		}
	}

	static class StackLinked {
		static class Node {
			Node next;
			int val;

			Node(int a) {
				val = a;
			}
		}

		int size;
		Node head;

		StackLinked() {
			size = 0;
			head = null;

		}

		void insert(int key) {
			if (head == null) {
				head = new Node(key);
				size++;
			} else {
				Node temp = new Node(key);
				temp.next = head;
				head = temp;
				size++;
			}
		}

		int del() {
			if (head == null)
				return -1;
			else {
				int res = head.val;
				head = head.next;
				size--;
				return res;

			}
		}

		int size() {
			return size;
		}

		boolean isEmpty() {
			return (head == null);
		}

		int peak() {
			if (head == null)
				return -1;
			else {
				return head.val;
			}
		}

	}

	public static void main(String arg[]) {

//		twoStacks s=new twoStacks(5);
//		s.push1(1);
//		s.push2(2);
//		s.push1(3);
//		s.push2(4);
//		s.push1(5);
//		s.push2(6);
//		s.push1(10);
//		System.out.println(s.pop2());
//		System.out.println(s.pop2());
//		s.push2(6);
//		s.push1(10);
//		System.out.println(s.pop1());

//		stackStruc stack=new stackStruc(10);
//		stack.insert(1);
//		stack.insert(2);
//		stack.insert(3);
//		stack.del();
//		stack.del();
//		stack.del();
//
//		System.out.println(stack.isEmpty());

//		StackLinked stack=new StackLinked();
//		stack.insert(1);
//		stack.insert(10);
//		stack.insert(15);
//
//		stack.insert(30);
//		stack.del();
//		System.out.println(stack.peak());
//		stack.insert(100);
//		System.out.println(stack.peak());
//		String s = "{([])}() {{}";
//		System.out.println(balBrackets(s));
		
		int arr[]=new int[] {20,30,10,5,15,12};
		//stockSpan(arr);
		prevGreater(arr);
////
//		

//		

	}

}
