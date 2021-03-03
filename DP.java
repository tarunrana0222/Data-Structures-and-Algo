import java.util.*;

public class DP {
	static int memo[];

	static int fibo(int a) {
		if (memo[a] == -1) {
			if (a == 0 || a == 1)
				memo[a]=a;
			else {
				memo[a]= fibo(a - 1) + fibo(a - 2);
			}
		}
		return memo[a];

	}
	static int LCS(String s1,String s2,int n,int m)
	{   
		if(n==0 || m==0)
			return 0;
		if(s1.charAt(n)==s2.charAt(m))
			return 1+LCS(s1,s2,n-1,m-1);
		else
			return Math.max(LCS(s1,s2,n,m-1), LCS(s1,s2,n-1,m));
	}

	public static void main(String arg[]) {
//		int a = 5;
//		memo = new int[a + 1];
//		Arrays.fill(memo, -1);
//		System.out.println(fibo(a));
		System.out.println(LCS("abgjd","bkgej",4,4));
		
	}

}
