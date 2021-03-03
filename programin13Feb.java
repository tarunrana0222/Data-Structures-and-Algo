import java.util.*;

public class programin13Feb {
	static int searchInsert(int arr[], int key) {
		int low = 0, high = arr.length - 1;
		int res = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
				res = mid + 1;
			} else
				high = mid - 1;
		}
		return res;
	}

	static int[] firstAndLast(int arr[], int x) {

		int low = 0;
		int high = arr.length - 1;
		int res[]=new int[2] ;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x)
				high = mid - 1;
			else if (arr[mid] < x)
				low = mid + 1;
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					res[0]=mid;
					int count=0;
					for(int i=mid+1;i<arr.length-1;i++)
					{  //System.out.println("count "+count+" arr [mid] "+arr[mid]+" arr[mid+1] "+arr[mid+1]);
						if(arr[mid]==arr[mid+1])
						{	System.out.println("count "+count+" arr [mid] "+arr[mid]+" arr[mid+1] "+arr[mid+1]);
						count++;}
						else
							break;
					}
					
					res[1]=count+mid;
					return res;
				} else
					high = mid - 1;
			}
		}
		return res;
		
	
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 5,7,7,7,7,8,8,10 };
		
		String s=new String(Arrays.toString(firstAndLast(arr,7)));
		System.out.println(s);
		
	}

}
