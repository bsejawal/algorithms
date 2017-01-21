package map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyMap<K, V> {
	private int length;
	private int DEFAULT_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	private MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];

	public void remove(K key) {
		for (int i = 0; i < length; i++) {
			if (values[i].getKey().equals(key)) {
				values[i] = null;
				length--;
				condenseArray(i);
				return;
			}
		}
	}

	private void condenseArray(int start) {
		for (int i = start; i < length; i++) {
			values[i] = values[i + 1];
		}
	}

	public Set<K> keySet() {
		Set<K> set = new HashSet<K>();
		for (int i = 0; i < length; i++)
			set.add(values[i].getKey());
		return set;

	}

	public void put(K key, V value) {
		for (int i = 0; i < length; i++) {
			if (values[i].getKey().equals(key)) {
				values[i].setValue(value);
				return;
			}
		}

		// for new entry
		ensureCapacity();
		values[length++] = new MyEntry<K, V>(key, value);
	}

	private void ensureCapacity() {
		if (length == values.length) {
			int newLength = values.length * 2;
			values = Arrays.copyOf(values, newLength);
		}
	}

	public int size() {
		return length;
	}

	public V get(K key) {
		for (int i = 0; i < length; i++) {
			if (null != values[i]) {
				if (values[i].getKey().equals(key)) {
					return values[i].getValue();
				}
			}
		}
		return null;
	}

}
