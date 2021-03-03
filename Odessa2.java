import java.util.*;

public class Odessa2 {
	static Scanner sc = new Scanner(System.in);

	static void decrypt(String s, int k) {
		char arr[] = s.toCharArray();

		if (k <= 25) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '.')
					arr[i] = ' ';

				else if (arr[i] >= 'a' && arr[i] <= 'z') {
					int val = arr[i] + k;
					if (val > 'z')
						arr[i] = (char) (val - 26);
					else
						arr[i] = (char) (arr[i] + k);

				}
				else
				{
					int val=arr[i]+k;
					if(val>'Z')
						arr[i]=(char)(val-26);
					else
						arr[i]=(char)(arr[i]+k);
				}

			}
		}

		else {
			k = k - 26;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '.')
					arr[i] = ' ';
				else if(arr[i]>='a' && arr[i]<='z') {
					int check = arr[i] + k;
					if(check>'z')
						arr[i]=(char)((check-26)-32);
					
					else {
						arr[i] = (char) ((arr[i] + k)-32);
					}

				}
				else
				{
					int check = arr[i] + k;
					if(check>'Z')
						arr[i]=(char)((check-26)+32);
					
					else {
						arr[i] = (char) ((arr[i] + k)+32);
					}
				}

			}

		}
		String res = new String(arr);
		System.out.println(res);

	}

	public static void main(String arg[]) {
		decrypt("E", 29);
	}

}
