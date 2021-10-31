package gradleProjOct21;

import java.util.Arrays;
import java.util.Scanner;

public class NextLargest {

	public void exchange(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public String findLargest(char ar[], int n) {

		if (ar == null) {

			return null;
		}

		int i;

		for (i = n - 1; i > 0; i--) {
			if (ar[i] > ar[i - 1]) {
				break;
			}
		}

		if (i == 0) {
			System.out.println("Not possible");
		} else {
			int x = ar[i - 1], min = i;

			for (int j = i + 1; j < n; j++) {
				if (ar[j] > x && ar[j] < ar[min]) {
					min = j;
				}
			}

			exchange(ar, i - 1, min);

			Arrays.sort(ar, i, n);

		}

		String str = new String(ar);
		return str;

	}

	public static void main(String[] args)

	{

		NextLargest nextLargest = new NextLargest();

		System.out.println("Enter the number ==>");
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();

		if (s == null || s.length() == 0 || s.equals(" "))
			System.out.print("No inpur received");

		else {
			char digits[] = s.toCharArray();
			int n = digits.length;
			String num = nextLargest.findLargest(digits, n);

			System.out.print(num);
		}
	}
}