package santosh;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	private static Set<Integer> setOfChar = new HashSet<>();

	public static void main(String[] args) {
		int[] arr; // = {8,2};
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		arr = new int[input.length()];
		for (int i = 0; i < input.length(); i++)
			arr[i] = Integer.parseInt(input.charAt(i) + "");

		findCombination(arr);
		System.out.println(isTen(arr));
	}
	
	static boolean isTen(int[] arr){
		for (int i : arr) {
			if (!setOfChar.contains(i))
				return false;
		}
		return true;
		
		
	}

	public static void findCombination(int[] elements) {

		for (int i = 0; i <= elements.length; i++) {
			if (i != elements.length) {
				int sum = elements[i];
				for (int j = i + 1; j < elements.length; j++) {
					sum += elements[j];
					if (sum == 10) {
						for (int k = i; k < j + 1; k++) {
							setOfChar.add(elements[k]);
						}
						break;
					} else if (sum > 10)
						break;
				}
			}
		}

	}

}
