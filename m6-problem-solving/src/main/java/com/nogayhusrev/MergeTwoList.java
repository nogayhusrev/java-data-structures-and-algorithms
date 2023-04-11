package org.cydeo;

public class MergeTwoList {

    public static void main(String[] args) {
        MySinglyLinkedList a = new MySinglyLinkedList();
        MySinglyLinkedList b = new MySinglyLinkedList();
        for (int i = 1; i <= 50; i++) {
            a.add(i);
        }
        for (int i = 51; i <= 100; i++) {
            b.add(i);
        }

        a = mergeTwoList(a, b);

        a.printNodes();


    }

    public static MySinglyLinkedList mergeTwoList(MySinglyLinkedList a, MySinglyLinkedList b){
        for (int i = 1; i < b.size(); i++) {
            a.add(b.getKthItemFromLast(b.size()-i));
        }

        return a;
    }
}
