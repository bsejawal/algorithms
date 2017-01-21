package linklist;

public class MyLinkList<T> {
	private Node<T> head;
	private int size = 0;

	public Object getFirst() {
		if (isValidIndex(0) == false)
			return null;
		return head.value;

	}

	public void removeLast() {
		if (size <= 1) {
			removeFirst();
			return;
		}
		Node<T> temp = head;
		while (null != temp.next) {
			temp = temp.next;
		}
		temp.previous.next = null;
		size--;

	}

	public void removeFirst() {
		if (null == head) {
			System.out.println("List is empty");
			return;
		}
		Node<T> temp = head;
		if (temp.next != null) {
			temp.next.previous = null;
		}
		head = temp.next;
		size--;

	}

	public void remove(int index) {
		if (isValidIndex(index) == false)
			return;
		if (index == 0) {
			removeFirst();
			return;
		} else if (1 + index == size) {
			removeLast();
			return;
		}
		int count = 0;
		Node<T> temp = head;
		while (count != index) {
			temp = temp.next;
			count++;
		}
		temp.previous.next = temp.next;
		temp.next.previous = temp.previous;
		temp = temp.next;
		size--;
	}

	public void addLast(T value) {
		add(value);
	}

	public void addFirst(T value) {
		Node<T> newNode = new Node<T>(value);
		if (null == head) {
			head = newNode;
		} else {
			Node<T> temp = head;
			head = newNode;
			temp.previous = head;
			head.next = temp;
		}
		size++;
	}

	public boolean contains(T value) {
		Node<T> temp = head;
		if (temp.compareTo(value) == 0)
			return true;
		while (null != temp.next) {
			temp = temp.next;
			if (temp.compareTo(value) == 0)
				return true;
		}
		return false;
	}

	public void add(T value) {
		if (null == head) {
			addFirst(value);
			return;
		} else {
			Node<T> newNode = new Node<T>(value);
			Node<T> temp = head;
			while (null != temp.next) {
				temp = temp.next;
			}

			temp.next = newNode;
			temp.next.previous = temp;
		}
		size++;
	}

	public Object get(int index) {
		if (isValidIndex(index) == false)
			return null;
		Node<T> temp = head;
		int count = 0;
		while (count != index) {
			temp = temp.next;
			count++;
		}
		return temp.value;
	}

	public String toString() {
		String str = "[";
		Node<T> temp = head;
		while (null != temp) {
			str += temp.value;
			temp = temp.next;
			if (null != temp)
				str += ", ";
		}
		str += "]";
		return str;
	}

	public int size() {
		return size - 1;
	}

	public boolean isValidIndex(int index) {
		if (size <= index || 0 > index) {
			System.out.println("invalid index");
			return false;
		}
		return true;
	}
}

class Node<T> implements Comparable<T> {
	Node<T> next;
	Node<T> previous;
	T value;

	public Node(T value) {
		this.value = value;
	}

	@Override
	public int compareTo(T t) {
		if (this.value == t) {
			return 0;
		}
		return 1;
	}
	public String toString(){
		return value.toString();
	}

}
