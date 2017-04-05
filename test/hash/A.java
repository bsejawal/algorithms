package test.hash;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		int max = 1000000000;
		for(int i=0; i<max; i++){
			map.put(""+i, ""+i);
		}
		System.out.println("max="+max);
		System.out.println("size="+map.size());

		/*
		 * int max = 100000000; int count=0; for (int i = 0; i < max ; i++) {
		 * s.put(i, i); if(i%10000000 == 0){ Runtime.getRuntime().gc();
		 * System.out.println(++count); } }
		 */

		// System.out.println("max = "+max);
		// System.out.println("size = "+s.size());
	}

}
