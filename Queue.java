import java.util.*;
public class Queue {
	static class queue{
		int arr[];
		int cap,front,rear,size;
		queue(int size)
		{   cap=size;
			arr=new int[cap];
			front=size=0;
			rear=size;
		}
		void enque(int x)
		{
			if(size==0)
			{
				arr[size]=x;
				front=rear=0;
			}
			else
				arr[size]=x;
			front=size;
		}
		int deque()
		{
			if(size==0)
			{return -1;}
			else
			{
				int res=arr[size];
				size--
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
