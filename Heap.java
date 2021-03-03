import java.util.*;

public class Heap {

	// heap is internaly denoted as array
	// left child is obtained by : 2*i +1, right by: 2*i+2, and parent by: (i-1)/2
	// where i is no of node;

	static class heapStruc {
		int arr[];
		int size;
		int cap;

		// constructor
		heapStruc(int k) {

			cap = k;
			arr = new int[cap];
			size = 0;
		}

		int left(int i) {
			return (2 * i + 1);
		}

		int right(int i) {
			return (2 * i + 2);
		}

		int parent(int i) {
			return ((i - 1) / 2);
		}

		// insert element in heap
		void insert(int val) {
			if (cap == size)
				return;
			size++;
			arr[size - 1] = val;

			for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i];) {
				int temp = arr[parent(i)];
				arr[parent(i)] = arr[i];
				arr[i] = temp;
				i = parent(i);

			}
		}

		// min heapify function
		void minheapify(int i) {
			int lt = left(i);
			int rt = right(i);
			int smallest = i;
			if (lt < size && arr[lt] < arr[i])
				smallest = lt;
			if (rt < size && arr[rt] < arr[smallest])
				smallest = rt;

			if (smallest != i) {
				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
				minheapify(smallest);
			}
		}

		// extract min
		int extract() {
			if (size <= 0)
				return Integer.MAX_VALUE;
			if (size == 1) {
				size--;
				return arr[0];

			}

			int temp = arr[0];
			arr[0] = arr[size - 1];
			arr[size - 1] = temp;
			size--;
			minheapify(0);
			return arr[size];
		}

		// update at given index with x
		void update(int index, int val) {
			arr[index] = val;

			while (index != 0 && arr[parent(index)] > arr[index]) {
				int temp = arr[index];
				arr[index] = arr[parent(index)];
				arr[parent(index)] = temp;
				index = parent(index);
			}
		}

		// delete key index is given
		void deleteKey(int i) {
			update(i, Integer.MIN_VALUE);
			extract();
		}

		// print heap
		void print() {
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	//////// heapsort///////////////////////////////////////////

	// build heap
	static void buildheap(int arr[], int n) {
		for (int i = n/2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

	}

	// heapify
	static void heapify(int arr[], int n, int i) {
		int lt = 2 * i + 1;
		int rt = 2 * i + 2;
		int min = i;
		if (lt < n && arr[lt] < arr[min])
			min = lt;
		if (rt < n && arr[rt] < arr[min])
			min = rt;

		if (min != i) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			heapify(arr, n, min);

		}

	}

	// extract min
static	int extract(int arr[],int size)
	{
		if(size<1)
			return Integer.MAX_VALUE;
		if(size==1)
		{
			size--;
			return arr[0] ;
		}
		
		int temp=arr[0];
		arr[0]=arr[size-1];
		arr[size-1]=temp;
		size--;
		heapify(arr,size,0);
		return(arr[size]);
	}

	// heap sort main function
	static void heapSort(int arr[]) {
		int len = arr.length;
		buildheap(arr, len);
		while (len != 0) {
		System.out.print(extract(arr, len)+" ");
			len--;
		}

	}
/////////////////////////////////////////////heap sort/////////////////////////////////////////////////
	
	static int  maxItems(int arr[],int sum)
	{
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		
			for(int i=0;i<arr.length;i++)
			{
				q.add(arr[i]);
			}
			int res=0;
			for(int i=0;i<arr.length;i++)
			{
				if(q.peek()<=sum)
				{
					sum-=q.poll();
					res++;
				}
				else
				{
					break;
				}
			}
			return res;	
	}

	//k largest elements
	static void kLarge(int arr[],int k)
	{
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		for(int i=0;i<k;i++)
		{
			q.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(q.peek()<arr[i])
			{
				q.poll();
				q.add(arr[i]);
			}
		}
		
		Iterator i=q.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}
	
	public static void main(String[] args) {
//		heapStruc h = new heapStruc(5);
//		h.insert(3);
//		h.insert(100);
//		h.insert(1);
//		h.insert(13);
//		h.insert(20);
//		h.update(2, 12);
//		h.print();
//		System.out.println();
//		h.deleteKey(1);
//		h.print();

		int arr[] = new int[] { 1,5,23,45,6,40,80};
		heapSort(arr);
		//System.out.println(maxItems(arr,36));
//		kLarge(arr,2);
	}

}
