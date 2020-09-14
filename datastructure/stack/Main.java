package datastructure.stack;

public class Main {
	public static void main(String args[]){
//		System.out.println("test");
		MyStack<Integer> s = new MyStack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.printStack();
		System.out.println();
		System.out.println(s.pop());
		System.out.println(s.pop());
//		s.printStack();
	}

}
