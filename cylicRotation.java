import java.util.*;
public class cylicRotation {
	static Scanner  scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,5,6,7,8,8,9,9,};
		System.out.println("Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");

		}
		System.out.println();

		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		System.out.println(" cyclic rotated Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");

		}
		System.out.println();
		

		

	}

}
