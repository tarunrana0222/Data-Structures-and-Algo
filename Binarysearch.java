
public class Binarysearch {
	static int binarySearch(int[] arr, int k) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k)
				return mid;
			else if (arr[mid] > k)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	static int firstOcc(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x)
				high = mid - 1;
			else if (arr[mid] < x)
				low = mid + 1;
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else
					high = mid - 1;
			}
		}
		return -1;
	}
	static int searchInfinite(int[] arr ,int x)
	{   if(arr[0]==x)
		return 0;
	int i=1;
	int low=0,high=0;
		while(arr[i]<x)
	{       low=i;
			i=i*2;
	}
		high=i;
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	static int sqrtFlor(int x)
	{
		int low=1,high=x,ans=-1;
		while(low<=high)
		{
			long mid = low+(high-low)/2;
			long midsq=mid*mid;
			if(midsq==x)
				return (int)mid;
			else if(midsq>x)
				high=(int)mid-1;
			else
			{
				low=(int)mid+1;
				ans=(int)mid;
				
			}
		}
		return ans;
	}

	static int lastOcc(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x)
				high = mid - 1;
			else if (arr[mid] < x)
				low = mid + 1;
			else {
				if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
					return mid;

				} else
					low = mid + 1;
			}

		}
		return -1;

	}
	
	static int countOcc(int[] arr, int x)
	{
		int a=firstOcc(arr,x);
		int b=lastOcc(arr,x);
		if(a==-1)
			return -1;
		int ans=b-a+1;
		return ans;
	}
	static int count1(int[] arr)
	{
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]<1)
				low=mid+1;
			else
			{
				if(mid==0 || arr[mid-1]!=1)
					return (arr.length-mid);
				else
					high=mid-1;
			}
		}
		return -1;
	}
	
	static int searchSorted(int[] arr,int x)
	{
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return mid;
		if(arr[low]<arr[mid])
		{
				if(x>=arr[low] && x<arr[mid])
				{
					high=mid-1;
				}
				else 
					low=mid+1;
		}
			
			else
			{
				if(x>arr[mid] && x<=arr[high])
					low=mid+1;
				else
					high=mid-1;
			}
		}
		return -1;
				
	}

	public static void main(String arg[]) {
		int[] arr = new int[] {5,6,7,8,9,1,2,3,4 };
//		System.out.println(binarySearch(arr,2));
//		System.out.println(firstOcc(arr, 10));
//		System.out.println(lastOcc(arr,2));
		//System.out.println(countOcc(arr,2));
		//System.out.println(count1(arr));
		System.out.println(sqrtFlor(214756));
		//System.out.println(searchInfinite(arr,9));
		//System.out.println(searchSorted(arr,1));

		
		
	}

}
