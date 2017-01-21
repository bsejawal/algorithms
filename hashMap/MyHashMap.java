package hashMap;

public class MyHashMap<K, V> {
	private MyEntry<K, V>[] table; //Array of Entry
	private int capacity=4;// initial capacity of HashMap	

	static class MyEntry<K, V> {
		K key;
		V value;
		MyEntry<K, V> next;

		public MyEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	@SuppressWarnings("unchecked")
	public MyHashMap(){
		table = new MyEntry[capacity];
	}
	
	public void put(K newKey, V data){
		if(null == newKey) return; // does not allow to store null key
		
		int hash = hash(newKey); // calculate hash of key
		
		//create new object from MyEntry
		MyEntry<K, V> newEntry = new MyEntry<K, V>(newKey, data);
		
		// if location does not contain any entry, store entry there
		if(null == table[hash])
			table[hash] = newEntry;
		else{
			MyEntry<K, V> tempEntry = table[hash];
			
			while(null == tempEntry.next){
				
			}
			
			
		}
		
	}
	
	private int hash(K newKey){
		return Math.abs(newKey.hashCode()) % capacity;
	}

}
