
public class unionintersection {
	static void union(int[] arr,int[] arr2,int n,int m)
	{
		int i=0,j=0;
		while(i<n && j<m)
		{
			if(arr[i]<arr2[j])
			{System.out.print(arr[i]+" ");
			i++;}
			else if(arr[i]>arr2[j])
			{
				System.out.print(arr2[j]+" ");
				j++;
			}
			else
			{
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
		}
		while(i<n)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		while(j<m)
		{
			System.out.print(arr[j]+" ");
			j++;
		}
		System.out.println();
	}
	
	static void intersection(int[] arr,int[] arr2,int n,int m)
	{
		int i=0,j=0;
		while(i<n && j<m)
		{
			if(arr[i]<arr2[j])
			{
			i++;}
			else if(arr[i]>arr2[j])
			{
				
				j++;
			}
			else
			{
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,4,6,8,9};
		int[] arr2=new int[] {2,3,5,6,7};
		int n=arr1.length;
		int m=arr2.length;
		union(arr1,arr2,n,m);
		intersection(arr1,arr2,n,m);
		
	}

}
