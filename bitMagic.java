import java.util.*;
public class bitMagic {
  static void	kBitSet(int n,int k)
  {
	  if( (n & (1<<(k-1)))!=0)
		  System.out.println("Set");
	  else
		  System.out.println("notset");
  }
 static int countBit(int n)
  { int count=0;
	  while(n>0)
	  {
		  n=n&(n-1);
		  count++;
	  }
	  return count;
  }
 static boolean isPower2(int n)
 { 
	 if(n==0)
		 return false;
	 if((n&(n-1))==0)
		 return true;
	 else
		 return false;
 }
 
 static int odd(int[] arr)
 { int res=0;
	 for(int i=0 ;i<arr.length;i++)
	 {
		 res=res^(arr[i]);
	 }
	 return res;
 }
	public static void main(String arg[])
	{
		kBitSet(5,2);
		System.out.println(countBit(8));
		System.out.println(isPower2(16));
		int[] arr=new int[]{1,2,1,3,3};
		System.out.println(odd(arr));
		

		
		
	}

}
