# Linked List
### Find the middle node in LinkedList
[code is here](https://github.com/bsejawal/algorithms/blob/96c1afd740112c9dcaa0f6fe82575f892d327107/src/main/java/com/bsejawal/algorithms/linklist/LinkedList.java#L154) 
```
 public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

```

![Find the middle Node in LinkedList](find_middle_node_in_linked_list.jpg)