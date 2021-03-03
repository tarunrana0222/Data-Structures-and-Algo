import java.util.*;
public class que_1 {
	static Scanner scan =new Scanner(System.in);

	public static void main(String[] args) 
		{
		System.out.println("Enter size of the array followed by its elements");
		int L=scan.nextInt();
		int[] arr=new int[L];
		for(int i=0;i<L;i++)
			{
			arr[i]=scan.nextInt();
			}
		System.out.println("Inserted element are");
		System.out.println();
		for(int i=0;i<L;i++)
			{
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		System.out.println("Enter index for breakpoint in range of 1-"+(L));
		int brkPt=scan.nextInt();
		int[] acc=new int[brkPt];
		int[] dec=new int [(L-brkPt)];
		for(int i=0;i<L;i++)
			{
			if(i<brkPt)
				acc[i]=arr[i];
			}
		for(int i=brkPt;i<L;i++)
		{
			int j=0;
			dec[j]=arr[i];
			j=j+1;
		}
//		System.out.println(arr.length);
//		System.out.println(acc.length);
//		System.out.println(dec.length);
		for(int i=0;i<acc.length;i++)
		{
		System.out.print(acc[i]+" ");
		}
		System.out.println();
		for(int i=0;i<dec.length;i++)
		{
		System.out.print(dec[i]+" ");
		}
		System.out.println();
		Arrays.sort(acc);
		int temp;
		for (int i=0;i<dec.length;i++)
			{
			if(dec[i]<dec[i+1])
			{
				temp=dec[i];
				dec[i]=dec[i+1];
				dec[i+1]=temp;
			}
			}
		for(int i=0;i<acc.length;i++)
		{
			arr[i]=acc[i];
		}
		for(int i=0;i<dec.length;i++)
		{
			arr[brkPt]=dec[i];
			++brkPt;
		}
		for(int i=0;i<L;i++)
		{
		System.out.print(arr[i]+" ");
		}
		}

}
