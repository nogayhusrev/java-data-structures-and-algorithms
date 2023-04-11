package com.nogayhusrev;

public class MySinglyLinkedListDemo {

    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        System.out.println(list.isEmpty());

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println("-------------PrintNodes()------------");
        list.printNodes();


        System.out.println("-------------indexOf()------------");
        System.out.println(list.indexOf(2));

        System.out.println("-------------KthElement()------------");
        System.out.println(list.getKthItemFromLast(10));

        System.out.println("-------------removeKthElement()------------");
        list.removeKthItemFromLast(10);
        list.printNodes();

        System.out.println("-------------KthElement()------------");
        System.out.println(list.getKthItemFromLast(10));


    }
}
