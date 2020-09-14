package datastructure.stack;

public class MyStack<T> {
	Node<T> head;
	int size;

	public void push(T value) {
		Node<T> newNode = new Node<T>(value);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			head = newNode;
			head.next = temp;
		}
		size++;
	}

	public boolean isEmpty() {
		return null == head;
	}

	public Object pop() {
		if (isEmpty())
			return null;
		T value = head.value;
		head = head.next;
		size--;
		return value;
	}

	public Object peek() {
		if (isEmpty())
			return null;
		return head.value;
	}

	public void printStack() {

		Node<T> curr = head;
		while (null != curr) {
			System.out.println(curr.value);
			curr = curr.next;

		}

	}

	class Node<V> {
		Node<V> next;
		V value;

		Node(V value) {
			this.value = value;
		}

		public String toString() {
			return value.toString();
		}
	}

}
