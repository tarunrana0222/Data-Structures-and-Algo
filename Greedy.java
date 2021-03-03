import java.util.*;
public class Greedy {
	static int maxAmount(int arr[],int amount)
	{
		Arrays.sort(arr);
		int res=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]<=amount) {
			int c=(int)Math.floor(amount/arr[i]);
			res=res+c;
			amount=amount-(c*arr[i]);
			}
			if(amount==0)
				break;
				
			
		}
		return res;
	}
	public static void main(String arg[])
	{
		int coin[] = {5, 10, 2, 1}, amount = 90;
		System.out.println(maxAmount(coin,amount));
	}
}
