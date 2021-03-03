

public class StackImplement {
	static class myStack {

		int top;
		int cap;
		int arr[];

		myStack(int size) {
			cap = size;
			arr = new int[cap];
			top = -1;
		}

		void push(int x) {
			if (top == cap - 1) {
				System.out.print("Full..");
				return;
			}
			top++;
			arr[top] = x;

		}

		int pop() {
			if (top == -1) {
				System.out.print("Empty..");
				return Integer.MIN_VALUE;
			}
			int res = arr[top];
			top--;
			return res;
		}

		int peek() {
			if (top == -1) {
				System.out.print("Empty..");
				return Integer.MIN_VALUE;
			}
			return arr[top];

		}

		int size() {
			return (top + 1);
		}

		boolean isEmpty() {

			return (top == -1);
		}

	}
	
	public static void main(String arg[])
	{
		myStack stack=new myStack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.isEmpty());
		stack.push(3);
		System.out.println(stack.peek());
		System.out.println(stack.size());




	}

}
