package com.bsejawal.algorithms.linklist;

public class TestLinkList {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.removeLast();
        System.out.println("-> should be empty ");
        myLinkedList.printList();
        myLinkedList.prepend(5);
        System.out.println("-> after");
        myLinkedList.printList();
//        myLinkedList.append(2);
//        myLinkedList.append(1);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        myLinkedList.printList();

    }
}
