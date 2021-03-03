import java.math.*;

public class quardatic {

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static void roots(int a, int b, int c) {
		int D = (b * b) - (4 * a * c);
		if (D > 0) {
			double X = ((-b) + (Math.sqrt(D))) / (2 * a);
			double Y = ((-b) - (Math.sqrt(D))) / (2 * a);
			System.out.println("this eq has Diff roots : " + X + "," + Y);
		} else if (D == 0) {
			double X = ((-b) + (Math.sqrt(D))) / (2 * a);
			System.out.println("this eq has same roots : " + X + "," + X);
		} else
			System.out.println("Imaginary roots");
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////

	static int digitFac(int N) {
		if (N <= 1)
			return (1);
		else {
			double x = 0;
			for (int i = 2; i <= N; i++)
				x = x + Math.log10(N);

			return ((int) (Math.floor(x)) + 1);
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static void AbsDiff(int arr[]) {
		int max = arr[0], min = arr[0];
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

				temp = i;
			}
		}
		// System.out.println("max: "+max);
		for (int i = 0; i < temp; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		// System.out.println("min : "+min);
		System.out.println("Absolute Diffrence : " + (max - min));
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////
	static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
		int temp = arr[sizeOfArray - 1];
		for (int i = index; i < sizeOfArray; i++) {
			arr[i] = arr[i + 1];

		}
		arr[index] = element;

	}

//////////////////////////////////////////////////////////////////////////////////////////
	static void reverseInGroups(int[] arr, int n, int k) {

		for (int i = 0; i < n; i += k) {
			int start = i;
			int end = Math.min(i + k - 1, n - 1);
			while (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;

			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	////////////////////////////////////////////////////////////////////////////////////////
	static void rotateArr(int arr[], int d, int n) {
		int[] arrNew = new int[n];
		int j = 0;
		for (int i = 0; i < n - d; i++) {
			arrNew[i] = arr[i + d];
		}
		for (int i = n - d; i < n; i++) {
			arrNew[i] = arr[j];
			j++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arrNew[i] + " ");
		}

	}

	//////////////////////
	static void reverse(int[] arr, int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;

		}
	}
	///////////////// effiicient rotate

	static void effRotateArr(int arr[], int d, int n) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	///////////////////////////////////////////////////////
	static  int minAdjDiff(int arr[], int n) {
		 
		 int minRes=arr[0];
		 for(int i=0;i<n;i++)
		 {
			 int curr=0;
			 if(i<n-1) { 
				 curr=(arr[i]-arr[i+1]);
				 if(curr<0)
					 curr=curr*(-1);
				 
			 
				 if(curr<minRes)
				 {
					 minRes=curr;
				 }
		}   
		 else {
			 curr=(arr[0]-arr[n-1]);
			 if(curr<0)
				 curr=curr*(-1);
			 if(curr<minRes)
			 {
				 minRes=curr;
			 }
			}
		}
	        return minRes;
	  }
////////////////////////////////////////////////////////////////////////////////////////////////////
	static void leaders(int[] arr)
	{  int n=arr.length;
	int[] arrL=new int[n];
	int leader=arr[n-1];
		 arrL[0]=arr[n-1];
		 int j=1;
		
		for(int i=n-2;i>=0;i--)
		{   
			if(arr[i]>leader)
			{    leader=arr[i];
				 arrL[j]=leader;
				 j++;
				 }
		}
		//reversing arrL
		int low=0,high=j-1,temp=0;
		while(low<high)
		{ System.out.println("check");
		    temp=arrL[low];
			arrL[low]=arrL[high];
			arrL[high]=temp;
			low++;
			high--;
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.print(arrL[i]+" ");
		}
	}//////////////////////////////////////////////////////////////
	 public static void convertToWave(int arr[], int n){
		 
		 if(n%2==0)
		 { int temp=0;
			 for(int i=0;i<n;i+=2)
			 {
				 temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
			 }
		 }
		 else
		 {
			 int temp=0;
			 for(int i=0;i<n-1;i+=2)
			 {
				 temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<n;i++)
		 {System.out.print(arr[i]+" ");}
	        
	       
	    }//////////////////////////////////////////////////
	 static int  remDuplicate(int[] arr,int n)
	 {
		 int res=1;
		 for(int i=1;i<n;i++)
		 {
			 if(arr[i]!=arr[res-1])
			 {
				 arr[res]=arr[i];
				 res++;
			 }
		 }
		 return res;
		 
	 }
///////////**********************************************************************************************//////////////

	public static void main(String[] args) {
		int a = 1, b = -2, c = 1;
		// roots(a,b,c);
		// System.out.println(digitFac(100));
		int[] arr = new int[] {1,1,3,3,5,5,6,6};
		// AbsDiff(arr);
		// reverseInGroups(arr,4, 3);
		// effRotateArr( arr, 3, 10);
		//System.out.println(minAdjDiff(arr, 7));
		//convertToWave(arr, 5);
		System.out.print(remDuplicate(arr,8));
		

	}

}
