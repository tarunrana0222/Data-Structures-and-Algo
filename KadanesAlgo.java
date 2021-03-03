
public class KadanesAlgo {
	public static void main(String arg[])
{
		int[] array=new int[] {1,3,0,-3,5,6,-7,9}	;
		int maxans=Integer.MIN_VALUE;
		int maxarray=0;
		for(int i=0;i<array.length;i++)
			{
			maxarray=maxarray+array[i];
			if(maxans<maxarray)
			{
				maxans=maxarray;
			}
			if(maxarray<0)
				maxarray=0;
			}
	System.out.println(maxans);
	
	}

}
