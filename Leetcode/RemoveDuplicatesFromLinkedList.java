package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromLinkedList {
    /*

     */
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public static void removeDups(Node head) {
        //create a set
        Set<Integer> set = new HashSet<>();
        //create two pointers
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            int curData = curr.data;
            if (set.contains(curData)) {
                prev.next = curr.next;
            } else {
                set.add(curData);
                prev = curr;
            }
            curr = curr.next;
        }
    }

}
