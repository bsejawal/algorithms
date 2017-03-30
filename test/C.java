package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C {

	public static void main(String[] args) {
		
		

//		System.out.println(isValidPassword("A2a"));
		System.out.println(zipCode(5596, 6789));

	}

	public static int zipCode(int A, int B) {
		String a = Integer.toString(A);
		String b = Integer.toString(B);
		String s = "";
		String restDigit = "";
		int length = 0;
		if (a.length() < b.length()) {
			length = a.length();
			restDigit = b.substring(length, b.length());
		} else if (a.length() > b.length()) {
			length = b.length();
			restDigit = a.substring(length, a.length());
		} else {
			length = a.length();
			restDigit = "";
		}
		for (int i = 0; i < length; i++) {
			s += a.charAt(i);
			s += b.charAt(i);
		}
		s += restDigit;
		
		double zipCode = Double.parseDouble(s);
		int ret = -1;
		if(zipCode < 100000000)
			ret  = (int) zipCode;
		Queue<String> q = new LinkedList();
		return ret;
		
		
	}

	public static int isValidPassword(String password) {

		String largest = "";
		String subString = "";
		boolean hasUpperCase = false;
		for (Character c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				if (subString != "" && subString.length() > largest.length() && hasUpperCase) {
					largest = subString;
					hasUpperCase = false;
				}
				subString = "";
			} else {
				subString += c;
				if (Character.isUpperCase(c)) {
					hasUpperCase = true;
				}
			}

			if (hasUpperCase && largest.length() < subString.length()) {
				largest = subString;
			}
		}
		return largest == "" ? -1 : largest.length();
	}

}