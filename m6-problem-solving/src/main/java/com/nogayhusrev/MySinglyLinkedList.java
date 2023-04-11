package com.nogayhusrev;

public class MySinglyLinkedList {

    public Node head;
    public Node tail;
    private int size = 0;

    public void add(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size += 1;


    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;

    }

    public int indexOf(int id) {
        if (isEmpty())
            return -1;

        int pos = 0;
        Node current = head;

        while (current != null) {
            if (id == current.id)
                return pos;
            current = current.next;
            pos++;
        }

        return -1;

    }

    public int getKthItemFromLast(int k) {
        // create two pointers
        Node ptr1 = head;
        Node ptr2 = head;
        // move ptr2 k-1 times

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.id;
    }


    public void removeKthItemFromLast(int k) {
        Node prev = head;
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }

        while (ptr2 != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        delete(ptr1);
/*
       if (ptr1 == head){
           head = ptr1.next;
           ptr1.next = null;
           size--;
       } else if (ptr1 == tail) {
           tail = prev;
           prev.next = null;
           size--;
       }else {
           prev.next = ptr1.next;
           ptr1.next = null;
           size--;
       }*/

    }

    public void removeKthFromLast2(int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {

            ptr2 = ptr2.next;

            if (ptr2 == null) System.out.println("Less than k elements");

            else if (ptr2.next == null) {
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next != null) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }

        ptr1.next = ptr1.next.next;
        ptr1 = ptr1.next;
        ptr1 = null;


    }

    public void deleteById(int id) {

        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.id == id) {// there is a match

                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }

                size--;
            }

            prev = current;
            current = current.next;

        }

    }

    private void delete(Node node) {

        Node prev = head;
        Node current = head;

        while (current != null) {
            if (current.id == node.id) {// there is a match

                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }

                size--;
            }

            prev = current;
            current = current.next;

        }

    }

    public int size() {
        return size;
    }

    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.println("Current id is -> " + current.id);
            current = current.next;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}