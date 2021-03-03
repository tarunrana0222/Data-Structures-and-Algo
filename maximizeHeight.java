import java.util.Arrays;
import java.util.Scanner;

public class maximizeHeight {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		int k = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (k < arr[i]) {
				arr[i] = arr[i] - k;
			} else
				arr[i] = k + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println(arr[arr.length - 1] - arr[0]);

	}

}
