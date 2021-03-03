
public class powerOf {
	
	//countout will store the the power of 2
	static int countout=0,ans=1;
	
	///to check power of 2 in every no
	static void power(int i)
	{  int countin=0;
		while(i>1)
		{
			
			
			//if no is divisible than only it will enter in the loop
			if(i%2==0)
			{
				countin++;
				i=i/2;   //end loop condition
			}
			
		}
		if(countin>countout)
		{
			countout=countin;//to update the outer count value
		}
	}
	static void funOf(int a,int b)
	{
		for(int i=a;i<b;i++)
		{
			power(i); //call to check power in every no
		}
		for(int i=1;i<=countout;i++)
		{
			ans=ans*2;
		}
		System.out.println(ans);
	}
	
	public static void main(String abc[])
	{
		funOf(4,10);
	}

}
