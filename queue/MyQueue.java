package queue;

public class MyQueue<T> {
	Node<T> front, rear;
	int size=0;
	
	// rear enqueue here ->4,3,2,1 front
	public void enqueue(T value){
		rear = new Node<T>(value);
		if(front == null){
			front = rear;
		}else{
			Node<T> temp = front;
			while(temp.link != null){
				temp = temp.link;
			}
//			rear.link
		}
		size++;
	}
//	rear 4,3,2,1-> dequeue here  front
//	public T dequeue(){
//		
//	}
	public T peek(){
		return front.value;
	}
	
	public boolean isEmpty(){
		return front == null;
	}
	
	
	
	
	class Node<V> {
		Node<V> link;

		V value;

		Node(V value) {
			this.value = value;
		}

		public String toString() {
			return value.toString();
		}

	}

}
