package datastructure.linklist;

//import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
//		LinkedList<String> t = new LinkedList<>();
		/*MyLinkList<Integer> list = new MyLinkList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		String abc = "new string abc";
		String def = "new string def";
		String q = abc;
		MyLinkList<String> myList = new MyLinkList<>();
		myList.add(abc);
		myList.add(def);
		myList.add(abc);
		System.out.println(list);*/
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
//		System.out.println(list);
//		System.out.println(list.get(1));
//		System.out.println(list.contains(10));
//		list.remove(2);
//		System.out.println(list);
		
//		list.removeFirst();
//		System.out.println("1"+list);
//		list.removeFirst();
//		System.out.println("2"+list);
//		list.removeFirst();
//		System.out.println("3"+list);
//		list.removeFirst();
//		System.out.println("4"+list);
//		list.removeFirst();
//		System.out.println("5"+list);
	
		
//		list.removeLast();
//		System.out.println(list);
//		list.removeLast();
//		System.out.println("3"+list);
//		list.removeLast();
//		System.out.println("2"+list);
//		list.removeLast();
//		System.out.println("1"+list);
//		list.removeLast();
//		System.out.println("0"+list);
//		
		
//		list.remove(0);
//		System.out.println("2"+list);
//		list.remove(0);
//		System.out.println("3"+list);
//		list.remove(0);
//		System.out.println("4"+list);
findCycle();
	}
	public static void findCycle(){
		MyLinkList<Node<Integer>> l = new MyLinkList<>();
		Node<Integer> one = new Node<Integer>(1);
		Node<Integer> two = new Node<Integer>(2);
		Node<Integer> three = new Node<Integer>(3);
		Node<Integer> four = new Node<Integer>(4);
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> six = new Node<Integer>(6);
		Node<Integer> seven = new Node<Integer>(7);
		l.add(one);
		l.add(two);
		l.add(three);
		l.add(four);
		l.add(five);
		l.add(two);
		l.add(six);
		l.add(seven);
		
		System.out.println(l);
	}

}
