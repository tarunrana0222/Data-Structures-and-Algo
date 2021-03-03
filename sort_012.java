
public class sort_012 {

	public static void main(String[] args) {
		int[] array=new int[] {0,1,2,0,2,0,1,0,0,2,1,2,1,2,0,1,2};
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int low=0,mid=0,temp=0;
		int high=array.length-1;
		while(mid<=high)
		{
			switch(array[mid])
			{
			case 0: 
			{
				temp=array[low];
				array[low]=array[mid];
				array[mid]=temp;
				low++;mid++;
				break;
			}
			case 1:
			{
				mid++;
				break;
			}
			case 2:
			{
				temp=array[mid];
				array[mid]=array[high];
				array[high]=temp;
				high--;
				break;
			}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		

	}

}
