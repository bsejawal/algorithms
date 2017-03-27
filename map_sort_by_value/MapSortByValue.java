package map_sort_by_value;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import http_client_in_core_java.Student;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapSortByValue {

	public static void main(String args[]) {

		Map<String, Student> map = new HashMap<>();
		map.put("one", new Student("Bhesh", "Sejawal"));
		map.put("two", new Student("Rajiv", "Neupane"));
		map.put("three", new Student("Naresh", "Maharjan"));
		map.put("four", new Student("Minesh", "Maharjan"));

		for (Entry<String, Student> entry : map.entrySet()) {
			System.out.println(entry.getValue().getLastName() + ", " + entry.getValue().getFirstName());
		}
		Map<String, Student> sortedMap = sortByValues(map);

		System.out.println("Sorted >>>>\n\n");
		for (Entry<String, Student> entry : sortedMap.entrySet()) {
			System.out.println(entry.getValue().getLastName() + ", " + entry.getValue().getFirstName());
		}

	}

	public static <K extends Comparable, V extends Comparable> Map<K, V> sortByValues(Map<K, V> map) {
		List<Map.Entry<K, V>> entries = new LinkedList<Map.Entry<K, V>>(map.entrySet());

		Collections.sort(entries, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		// LinkedHashMap will keep the keys in the order they are inserted
		// which is currently sorted on natural ordering
		Map<K, V> sortedMap = new LinkedHashMap<K, V>();

		for (Map.Entry<K, V> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}
}
