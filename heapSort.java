import java.util.*;
public class heapSort {
	static void buildHeap(int arr[],int len)	
	{
		for(int i=len/2 -1;i>=0;i--)
		{
			heapify(arr,len,i);
		}
	}
	
	static void heapify(int arr[],int len,int key)
	{
		int large=key;
		int lt=2*key+1;
		int rt=2*key+2;
		
		if(lt<len && arr[lt]>arr[large])
			large=lt;
		if(rt<len && arr[rt]>arr[large])
			large=rt;
		
		if(large!=key)
		{
			int temp=arr[key];
			arr[key]=arr[large];
			arr[large]=temp;
			
			heapify(arr,len,large);
		}
		
	}
	
	static void sort(int arr[])
	{
		int  len=arr.length;
		buildHeap(arr,len);
		
		for(int i=len-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
			
		}
		
	}
	static void print(int arr[])
	
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String arg[])
	{
		int arr[]=new int [] {1,3,6,2,5,4};
		sort(arr);
		print(arr);
	}

}
