import java.util.*;
public class Hashing {
	public static void main(String arg[])
	{
		HashSet<String> h = new HashSet<String>();
		h.add("tarun");
		h.add("avinash");
		h.add("rahul");
		
	System.out.println(h);
	System.out.println(h.contains("n"));
	
	
	Iterator<String> i= h.iterator();
	while(i.hasNext())
	{
		System.out.print(i.next()+" ");
	}
	
	}

}
