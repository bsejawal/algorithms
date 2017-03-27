package santosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {

	public static void main(String args[]) {

		List<String> sl = new ArrayList<>();
		sl.add("123");
		sl.add("234");
		sl.add("345");
		sl.add("456");
		Integer[] sa = sl.toArray(new Integer[0]);
		for (Integer s : sa) {
			System.out.println(s);
		}

	}

}
