
public class negitiveElements {
	

	public static void main(String[] args) {
		int[] arr =new int[] {-1,2,3,4,-3,-5,6,-8,7,0,-4,-20,-9,-6,-5};
		for(int i=0;i<arr.length;i++)
		{System.out.print(arr[i]+" ");}
		System.out.println();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{if(count>0)
				{
				int temp=arr[i];
				arr[i]=arr[i-count];
				arr[i-count]=temp;
				
						
				}}
			else
				count++;
		}
		for(int i=0;i<arr.length;i++)
		{System.out.print(arr[i]+" ");}
		System.out.println();

	}

}
