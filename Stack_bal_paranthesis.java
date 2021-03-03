import java.util.*;
import java.io.*;

public class Stack_bal_paranthesis {

	static boolean matching(char a, char b) {
		return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
	}
	

	static boolean isBalanced(String str) {
		Stack<Character> S = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
				S.add(str.charAt(i));
			else {
				if (S.isEmpty())
					return false;
				else if (matching(S.peek(), str.charAt(i)) == false)
					return false;
				else
					S.pop();
			}
		}
		return (S.isEmpty());
	}
	
	static void reverseInt(int x)
	{
		String s="";
		s=s+x;
		char[] c=s.toCharArray();
		int len=c.length;
	   if(c[0]==-1)
	   {
		   int i=1;
		   while(i<=len)
		   {
			   char temp=c[i];
			   c[i]=c[len];
			   c[len]=temp;
			   len--;
		   }
	   }
	   else
	   {
		   int i=0;
		   while(i<=len)
		   {
			   char temp=c[i];
			   c[i]=c[len];
			   c[len]=temp;
			   len--;
		   }
		   
	   }
	   String A=new String(c);
	   System.out.println(A);
	   
	}

	public static void main(String[] args) {
		String s = "{((){})}";
		System.out.print(isBalanced(s));
		reverseInt(123);

	}

}
