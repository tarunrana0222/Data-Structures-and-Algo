import java.util.*;

public class revHashSet {
	// count diffrent no
	static int uniqueEle(int arr[]) {
		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			h.add(arr[i]);

		}
		return h.size();
	}

	// pair of sum
	static void pairSum(int arr[], int sum) {
		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (h.contains(sum - arr[i]))
				System.out.print(arr[i] + " " + (sum - arr[i]));
			else
				h.add(arr[i]);
		}

	}

	// union of two arrr
	static void union(int arr1[], int arr2[]) {
		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			h.add(arr1[i]);

		}
		for (int i = 0; i < arr2.length; i++) {
			h.add(arr2[i]);
		}

		Iterator<Integer> i = h.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

	}
	// prefix array zero

	static boolean prefixZero(int arr[]) {
		HashSet<Integer> h = new HashSet<>();
		int prefix = 0;
		for (int i = 0; i < arr.length; i++) {
			prefix += arr[i];
			if (prefix == 0) {
				return true;
			} else if (h.contains(prefix))
				return true;
			else {
				h.add(prefix);
			}
		}
		return false;
	}

	// subarray with given sum
	static boolean subSum(int arr[], int sum) {
		HashSet<Integer> h = new HashSet<>();
		int prefix = 0;
		for (int i = 0; i < arr.length; i++) {
			prefix += arr[i];
			if (prefix == sum)
				return true;
			else if (h.contains(prefix - sum)) {
				return true;
			}

			else
				h.add(prefix);
		}
		return false;
	}
	
	//intersection of 2 arrays
	static void intersec(int arr1[],int arr2[])
	{
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			h.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{  if(h.contains(arr2[i]))
			System.out.print(arr2[i]+" ");
		h.remove(arr2[i]);
		}
		
	}
	
	
	
//////////////////*******************************************************///////////////////////*************//////////////
	public static void main(String arg[]) {
		int arr[] = new int[] { 1, 4, 3,1, -3, -4, 5 };
		int arr2[] = new int[] { 1, 3, 5, 6,1, 8, 9 };
//		System.out.println(uniqueEle(arr));
//		pairSum(arr,9);
//		System.out.println();
//		union(arr,arr2);
		// System.out.println(prefixZero(arr));
		//System.out.println(subSum(arr, 8));
		intersec(arr,arr2);
	}

}
