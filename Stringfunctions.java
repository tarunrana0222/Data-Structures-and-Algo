import java.util.*;

public class Stringfunctions {
	////////////////////////////// **********************************************//////////////////////////////////////
	static void charFreq(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + " " + count[i]);
			}
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static String concatenatedString(String s1, String s2) {
		int[] Char = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			Char[s1.charAt(i)]++;
		}
		for (int i = 0; i < s1.length(); i++) {
			Char[s2.charAt(i)]++;
		}
		char[] arr = new char[s1.length() + s2.length()];
		int j = 0;
		for (int i = 0; i < 256; i++) {
			if (Char[i] == 1) {
				arr[j] = (char) (i);
				j++;
			}
		}
		String s = new String(arr);
		return s;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static boolean isPal(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;

			start++;
			end--;
		}
		return true;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static boolean isAnagram(String s, String s2) {
		int[] charArr = new int[256];

		if (s.length() != s2.length())
			return false;
		for (int i = 0; i < s.length(); i++) {
			charArr[s.charAt(i)]++;
			charArr[s2.charAt(i)]--;
		}
		for (int i = 0; i < 256; i++) {
			if (charArr[i] != 0)
				return false;
		}
		return true;

	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static int leftRepeated(String s) {
		int res = -1;
		boolean[] charArr = new boolean[256];
		for (int i = s.length() - 1; i >= 0; i--) {
			if (charArr[s.charAt(i)] == true)
				res = i;
			else
				charArr[s.charAt(i)] = true;

		}
		return res;

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static boolean isRotation(String a, String b) {
		String s = a + b;
		return s.contains(b);

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static void reverse(char[] a, int low, int high) {
		char temp;
		while (low < high) {
			temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;

		}
	}

	static void reverseWords(String s) {
		char[] arr = s.toCharArray();
		int start = 0, end = 0;
		for (end = 0; end < arr.length; end++) {
			if (arr[end] == ' ') {
				reverse(arr, start, end - 1);
				start = end + 1;

			}
		}
		end = arr.length - 1;
		reverse(arr, start, end);
		start = 0;
		reverse(arr, start, end);

		String S = new String(arr);
		System.out.println(S);

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static void binaryIndex(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == '1') {
						count++;
					}
				}

			}
		}
		System.out.print(count);

	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 static boolean isPanagram(String s)
 {
	 boolean[] arr =new boolean[256];
	 s=s.toLowerCase();
	 for(int i=0;i<s.length();i++)
	 {
		 arr[s.charAt(i)]=true;
	 }
	 for(int i=97;i<123;i++)
	 {
		 if(arr[i]!=true)
			 return false;
	 }
	 return true;
	 
 }
 
 static boolean isIso(String s)
 {
	 int[] arr=new int[256];
	 s=s.toLowerCase();
	 for(int i=0;i<s.length();i++)
	 {
		 arr[s.charAt(i)]++;
		 
	 }
	 for(int i=97;i<123;i++)
	 {
		 if(arr[i]>1)
			 return false;
	 }
	 return true;
 }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static void rotByTwo(String s,String s2) {
		String anti="";
		String clock="";
	int	len=s2.length();
	anti=anti+s2.substring(len-2,len)+s2.substring(0,len-2);
	clock=clock+s2.substring(len-2, len)+s2.substring(0,2);
	if(s.equals(anti)||s.equals(clock))
	{
		System.out.println("tru");
	}
	else
		System.out.println("no no no");

		
		
		
	}

	////////////////////////////// **********************************************//////////////////////////////////////
	public static void main(String[] arg) {
		String a = "machiine";
		String b = "azonam";
		// charFreq(a);
		// System.out.println(isPal(a));
		// System.out.println(isAnagram(a, b));
		// System.out.println(leftRepeated(a));
		// reverseWords(a);
		// System.out.println(isRotation(a,b));
		// System.out.println(concatenatedString(a,b));
		//binaryIndex(a);
		//rotByTwo(a,b);
		 System.out.println(isIso(a));

	}

}
