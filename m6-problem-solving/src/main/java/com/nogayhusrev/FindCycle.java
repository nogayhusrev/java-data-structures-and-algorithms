package com.nogayhusrev;

import java.util.HashSet;

public class FindCycle {

    public static void main(String[] args) {

        MySinglyLinkedList a = new MySinglyLinkedList();


        for (int i = 1; i <= 50; i++) {
            a.add(i);

        }


        System.out.println(isCycle2(a.getHead()));
        System.out.println(isCycle(a.getHead()));


    }

    public static boolean isCycle2(Node head) {

        HashSet<Node> list = new HashSet<>();

        Node current = head;

        while (current != null) {
            current = current.next;
            if (!list.add(current))
                return true;
        }
        return false;
    }


    public static boolean isCycle(Node head) {
        Node current = head;
        boolean isCycle = false;
        while (current != null) {
            current = current.next;
            if (current == head)
                return true;
        }
        return false;
    }
}
