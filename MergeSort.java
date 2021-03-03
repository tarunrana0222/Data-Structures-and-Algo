import java.util.Arrays;

public class MergeSort {
	
	static void intersection(int arr[],int arr2[])
	{
		int n1=arr.length;
		int n2=arr2.length;
		
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(arr[i]==arr2[j])
			{
			System.out.print(arr[i]+" ");
			i++;
			j++;
			}
			else if(arr[i]<arr2[j])
			{
				i++;
			}
			else
				j++;
			
		}
	}
	
	static int countandmerge(int arr[],int low,int mid,int high)
	{
		int n1=mid-low+1,n2=high-mid;
		int[] left=new int[n1];
		int[] right=new int[n2];
		int i=0,j=0,k=low,res=0;
		
			while(i<n1 && j<n2)
			{
				if(left[i]<=right[j])
				{
					arr[k]=left[i];
					i++;
					k++;
					
				}
				else
				{
					arr[k]=right[j];
					res=res+(n1-i);
					k++;
					j++;
					
				}
			}
			
			while(i<n1)
			{
				arr[k]=left[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				arr[k]=right[j];
				k++;
				j++;
			}
			
		return res;
	}
	
	static int inversion(int arr[],int low,int high)
	{ int res=0;
		if(low<high)
		{ int mid=(low+high)/2;
			res+= inversion(arr,low,mid);
			res+=inversion(arr,mid+1,high);
			res+=countandmerge(arr,low,mid,high);
		}
		return res;
	}
	
	
	static void mergeSort(int arr[], int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			mergeRange(arr, low, mid, high);
		}
	}

	static void mergeArr(int arr[], int arr2[]) {
		int n1 = arr.length;
		int n2 = arr2.length;
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (arr[i] < arr2[j]) {
				System.out.print(arr[i] + " ");
				i++;
			} else {
				System.out.print(arr2[j] + " ");
				j++;
			}

		}

		while (i < n1) {
			System.out.print(arr[i] + " ");
			i++;

		}
		while (j < n2) {
			System.out.print(arr2[j] + " ");
			j++;

		}
	}

	static void mergeRange(int arr[], int low, int mid, int high) {
		int n1 = mid - low + 1, n2 = high - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[i + low];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (left[i] < right[j]) {
				arr[low] = left[i];
				low++;
				i++;
			} else {
				arr[low] = right[j];
				low++;
				j++;
			}
		}

		while (i < n1) {
			arr[low] = left[i];
			low++;
			i++;
		}
		while (j < n2) {
			arr[low] = right[j];
			low++;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2,4,1,3,5 };
		int[] arr2 = new int[] { 2, 4, 8, 9, 10 };

		// mergeArr(arr,arr2);
		// int[] arr3=new int[] {5,6,7,8,9,1,2,3,4};
		// mergeRange(arr3,0,8,4);

		//int[] arr4 = new int[] { 2, 4, 6, 8, 7, 23, 1, 100 };
		//mergeSort(arr4, 1, 7);
		//System.out.println("Array = " + Arrays.toString(arr4));
		
		//intersection(arr,arr2);
		System.out.println(inversion(arr,0,arr.length-1));

	}

}
