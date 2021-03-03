import java.util.*;

public class revMaths {
	// count no of digits in the no
	static int countDigits(int n) {
		int res = 0;
		while (n > 0) {
			n = n / 10;
			res++;
		}
		return res;
	}

	// check whether no is palindrome or not
	static boolean palindrome(int n) {
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (rev == n)
			return true;
		else
			return false;
	}

	// factorial of no
	static long fact(int n) {
		if (n <= 1)
			return n;
		long res = 1;
		for (int i = 2; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

	// trailing zeros in fact
	static int trailZeros(int n) {

		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + n / i;

		}
		return res;
	}

	// HCF of 2 no
	static int hcf(int a, int b) {
		if (b == 0)
			return a;
		return hcf(b, a % b);
	}

	// LCM of 2 no
	static int lcm(int a, int b) {
		int res = (a * b) / hcf(a, b);
		return res;
	}

	// no is prime or not
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// all prime factors
	static void primeFact(int n) {
		if (n <= 1)
			return;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
	}

	// all divisors of a no
	static void allDiv(int n) {
		if (n < 1)
			return;
		for (int i = 1; i * i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " " + n / i + " ");
			}
		}
	}

	// all prime no in range 1-n Using Sive algo
	static void sieve(int n) {
		boolean arr[] = new boolean[n + 1];
		for (int i = 2; i * i <= n; i++) {
			if (arr[i] == false) {
				for (int j = 2 * i; j <= n; j += i) {
					arr[j] = true;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (arr[i] == false)
				System.out.print(i + " ");
		}
	}

	public static void main(String arg[]) {
		System.out.println("NO of digits are : " + countDigits(1000000));
		System.out.println("Palindrome check : " + palindrome(10101));
		System.out.println("Factorial of no : " + fact(5));
		System.out.println("Trailing zeros  : " + trailZeros(1));
		System.out.println("HCF of no is: " + hcf(10, 3));
		System.out.println("LCM of no is: " + lcm(10, 5));
		System.out.println("is No prime: " + isPrime(12546787));
		primeFact(98);
		System.out.println();
		allDiv(20);
		System.out.println();
		sieve(9);

	}

}
