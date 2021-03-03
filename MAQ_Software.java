import java.util.*;

public class MAQ_Software {
	// greatest element on right
	static void greaterEle(int arr[]) {
		int great = arr[arr.length - 1];
		Stack<Integer> s = new Stack<>();
		s.add(-1);
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > great)
				great = arr[i];
			
				s.add(great);
		}
		while (s.isEmpty() == false)
			System.out.print(s.pop() + " ");

	}
	
	//gcd of two no
	static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	
	//magic no
	static boolean magicNo(int a)
	{
		int sumOfDigits=0;
		int b=a;
		while(b>0)
		{
			sumOfDigits+=b%10;
			b=b/10;
			
		}
		
		int temp=sumOfDigits,reverse=0;
		while(temp>0)
		{
			reverse=(reverse*10) + (temp%10);
			temp=temp/10;
		}
		
		int product=sumOfDigits*reverse;
		if(product==a)
			return true;
		else
			return false;
	}
	
	//string 
	static void print(String s,int k)
	{   
		for(int i=0;i<k;i++)
		{
		System.out.print(s.charAt(i));
		}
		for(int i=s.length()-k;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
	}

	/////////////////////// *********************////////////////////////******************//////////////////////////
	public static void main(String arg[]) {
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		greaterEle(arr);
		//System.out.println(gcd(12,20));
		//System.out.println(magicNo(1729));
		//print("loremipsum",2);
		
//		int fibo[]=new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
//		int prime[]=new int [] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67};
//		int finalArray[]=new int[38];
//		int j=0,k=0;
//		for(int i=0;i<38;i++)
//		{
//			if(i%2==0)
//			finalArray[i]=fibo[j++];
//			else
//				finalArray[i]=prime[k++];	
//		}
//		String s=Arrays.toString(finalArray);
//		System.out.println(s);
//		int n=18;
//		if(n%2==0)
//		{
//			System.out.println(prime[(n-1)/2]);
//		}
//		else
//			System.out.println(fibo[n/2]);
//		
	}

}
