package sourceallies;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Hackerrank {

	public static void main(String[] args) {

		// System.out.println(anagram("Dormitory", "Dirty Room"));
		// Stem.out.println(changeCalculator("1.00"));

		// isSumPossible();
		System.out.println(shortestPalindrom("bananabn"));
	}

	public static int shortestPalindrom(String s) {
		if (s == null || s.length() <= 1)
			return 0;
		int front = 0;
		int rear = s.length() - 1;
		int count = 0;
		for (int i = 0; i < rear;) {
			if (front > rear)
				break;
			if (s.charAt(front) != s.charAt(rear))
				count++;
			else
				rear--;
			front++;
		}
		return count;
	}

	private static String anagram(String a, String b) {
		a = a.toLowerCase().replaceAll(" ", "");
		b = b.toLowerCase().replaceAll(" ", "");

		if (a.length() != b.length()) {
			return "No";
		}
		Stack<Character> stack = new Stack<>();
		for (char c : a.toCharArray()) {
			stack.push(c);
		}
		for (int i = 0; i < b.length(); i++) {
			if (a.indexOf(b.charAt(i)) > -1) {
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			return "Yes";
		} else
			return "No";
	}

	public static int changeCalculator(String money) {
		double money1 = Double.parseDouble(money);
		int coin = 0;
		double cent = money1 * 100;
		if (cent >= 50) {
			int fifty = (int) cent / 50;
			cent = cent - (fifty * 50);
			coin = fifty;
		}
		if (cent >= 25) {
			int quarter = (int) cent / 25;
			cent = cent - (quarter * 25);
			coin += quarter;
		}
		if (cent >= 10) {
			int dime = (int) cent / 10;
			cent = cent - (dime * 10);
			coin += dime;
		}
		if (cent >= 5) {
			int nickel = (int) cent / 5;
			cent = cent - (nickel * 5);
			coin += nickel;
		}

		coin += cent;

		return coin;
	}

	public static int isSumPossible(int[] input, int value) {
		Arrays.sort(input);
		int start = 0;
		int end = input.length - 1;
		while (start < end) {
			if ((input[start] + input[end]) == value) {
				return 1;
			} else if ((input[start] + input[end]) < value) {
				start++;
			} else {
				end--;
			}
		}
		return 0;
	}

	public static void kDifference(int a[], int k) {
		Scanner in = new Scanner(System.in);
		int res;

		String n = in.nextLine();
		String[] n_split = n.split(" ");

		int _a_size = Integer.parseInt(n_split[0]);
		int _k = Integer.parseInt(n_split[1]);

		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = pairs(_a, _k);
		System.out.println(res);
	}

	static int pairs(int[] a, int k) {
		/* Complete this function */
		Arrays.sort(a);
		int count = 0;
		Map<Integer, Integer> temp = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			temp.put(a[i] - k, i);
		}
		for (int i = 0; i < a.length; i++) {
			if (temp.containsKey(a[i])) {
				count++;
			}
		}
		return count;
	}

}
