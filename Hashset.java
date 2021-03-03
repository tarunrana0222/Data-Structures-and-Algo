import java.util.*;
public class Hashset {
	//////////////////////////////////////////////////////////////////////////////////////////////
	static int countDist(int[] array,int n)
	{
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			h.add(array[i]);
		}
		System.out.println(h);
		return h.size();
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	static boolean pairSum(int[] arr,int sum)
	{
		HashSet<Integer> h =new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(h.contains(sum-arr[i]))
				return true;
			
			h.add(arr[i]);
			
		}
		return false;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	static int union(int[] arr1,int[] arr2)
	{
		int ans=0;
	HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			h.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			h.add(arr2[i]);
		}
		ans=h.size();
			
		return ans;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	static boolean subArrZero(int[] arr,int n)
	{
		HashSet<Integer> h=new HashSet<>();
		int prefix=0;
		for(int i=0;i<n;i++)
		{
			prefix+=arr[i];
			if(prefix==0)
				return true;
			
			if(h.contains(prefix))
				return true;
			
			h.add(prefix);
		}
		return false;
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	static boolean subArrSum(int[] arr,int sum)
	{
		HashSet<Integer> h=new HashSet<>();
		int prefix=0;
		for(int i=0;i<arr.length;i++)
		{
			prefix+=arr[i];
			if(prefix==0)
				return true;
			
			if(h.contains(prefix-sum))
				return true;
			
			h.add(prefix);
		}
		return false;
		
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////////////////////////////////////
	
	static int intersection(int[] arr1,int[] arr2)
	{
		int ans =0;
		HashSet<Integer> h=new HashSet<>();
		for(int i=0; i<arr1.length;i++)
		{
			h.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(h.contains(arr2[i]))
			{
				ans++;
				h.remove(arr2[i]);
			}
		}
		return ans;
	}
	
	
////////////////////////**********************************************************////////////////////////////////////////////	
	public static void main(String arg[])
	{
       int[] arr=new int[] {5, 8, 6, 13, 3, -1};
       int n=arr.length;
       
       int[] arr1=new int[] {1,2,3,4,5,5,3,2,1};
       int[] arr2=new int[] {3,4,5,6,7,};
     //  System.out.println(intersection(arr1,arr2));
        // System.out.println(union(arr1,arr2));
        // System.out.println(pairSum(arr2,100));
      // System.out.println(subArrZero(arr,n));
      // System.out.println(countDist(arr,n));
       System.out.println(subArrSum(arr,22));
       
       
       
		
		
		/* implementtation
		HashSet<String> h = new HashSet<String>();
		h.add("tarun");
		h.add("avinash");
		h.add("rahul");
		
	System.out.println(h);
	System.out.println(h.contains("n"));
	h.remove("tarun");
	System.out.println(h.size());
	
	
	Iterator<String> i= h.iterator();
	while(i.hasNext())
	{
		System.out.print(i.next()+" ");
	}*/ 
	
	}

}
