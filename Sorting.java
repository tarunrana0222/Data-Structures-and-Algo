import java.util.Arrays;

public class Sorting {
	static void bubbleSort(int arr[])
	{
		int len=arr.length;
		for(int i=0;i<len;i++)
		{  boolean swapped=false;
			for(int j=0;j<len-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
				
			}
			if(swapped==false)
				break;
		}	
	}
	
	
	static void selectionSort(int arr[])
	{
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
             if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; }
	}
	static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
					int j=i-1;
					while(j>=0 && arr[j]>key)
					{
						arr[j+1]=arr[j];
						j--;
					}
					arr[j+1]=key;
			
		}
	}
	public static void main(String sarg[])
	{
		int[] arr = new int[] {2,1,3,4,8,6,0,7};
		//bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		System.out.println("Array = "+Arrays.toString(arr));
	}

}
