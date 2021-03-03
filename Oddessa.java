import java.util.*;
public class Oddessa {
	static Scanner sc=new Scanner(System.in);

	static String decrypt(String s, int key) {
		String res = "";
		if (key <= 25) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '.')
					res += ' ';
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

					int val = (s.charAt(i) + key);
					if (val > 'Z') {
						val = val - 26;
						res += (char) (val);
					}

					else
						res += (char) (s.charAt(i) + key);

				}
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

					int val = (s.charAt(i) + key);
					if (val > 'z') {
						val = val - 26;
						res += (char) (val);
					}

					else
						res += (char) (s.charAt(i) + key);

				}

			}
		} else if (key > 25 && key <= 51) {
			key = key - 26;
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) =='.')
					res +=' ';

				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					int val = (s.charAt(i) + key);
					if (val > 'Z') {
						val = val - 26;
						res += (char) ((val) + 32);
					}

					else
						res += (char) ((s.charAt(i) + key) + 32);

				}
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					int val = (s.charAt(i) + key);
					if (val > 'z') {
						val = val - 26;
						res += (char) ((val) - 32);
					} else
						res += (char) ((s.charAt(i) + key) - 32);

				}

			}
		}
		return res;

	}

	public static void main(String[] args) {
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int key=sc.nextInt();
			String s=sc.next();
			System.out.println(decrypt(s,key));
		}
		

	}

}
