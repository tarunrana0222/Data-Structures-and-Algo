import java.util.*;

public class programing14Feb {
static	int i=1;
	static void generate(String s, int open, int close) {
		if (open == 0 && close == 0) {
			System.out.println((i++)+ " " +s);
			return;
		}
		if (open > 0) {
			generate(s + '(', open - 1, close);
		}
		if (close > open) {
			generate(s + ')', open, close - 1);
		}
	}
	static int arr[]=new int[] {1,3,5};
	static int N=arr.length;
	
	static void genSubset(ArrayList<Integer> a,int index)
	{
		if(index==N)
		{
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
			return;
		}
		
		a.add(arr[index]);
		genSubset(a,index+1);
		a.remove(index);
		genSubset(a,index+1);
		
	}
	
	

	public static void main(String arg[]) {
		String s = "";
		generate(s, 3, 3);
		ArrayList<Integer> a=new ArrayList<Integer>();
		genSubset(a,0);

	}

}
