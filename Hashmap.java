import java.util.*;
public class Hashmap {
	static void countFreq(int[] arr,int n)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i])==true)
				hm.put(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i],1);
		}
		for(Map.Entry<Integer,Integer> e: hm.entrySet())
		{
			System.out.println(e.getKey()+"="+e.getValue());
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,3,4,4,4,5,5,5,6,6};
		int n=arr.length;
		countFreq(arr,n);
		
		
		
		// how to implement 
		/*
		HashMap<String, Integer> h=new HashMap<>();
		h.put("Tarun",12);
		h.put("avinash", 13);
		h.put("arun",14);
		System.out.println(h);
		
		System.out.println(h.size());
		System.out.println(h.containsKey("avinash"));
		System.out.println(h.containsValue(14));
		System.out.println(h.remove("Tarun",12));
		System.out.println(h.get("avinash"));
		
		
		//
		for(Map.Entry<String,Integer> e: h.entrySet())
		{
			System.out.print(e.getKey()+"="+e.getValue()+" ");
		}*/ 
	}

}
