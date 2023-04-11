package org.cydeo;

import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);


        System.out.println("------------------Before---------------");
        System.out.println(node1);
        System.out.println("Node 1 next address is " + node1.next);
        System.out.println(node2);
        System.out.println("Node 2 next address is " + node2.next);
        System.out.println(node3);
        System.out.println("Node 3 next address is " + node3.next);
        System.out.println(node4);
        System.out.println("Node 4 next address is " + node4.next);


        System.out.println("------------------After---------------");
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        System.out.println(node1);
        System.out.println("Node 1 next address is " + node1.next);
        System.out.println(node2);
        System.out.println("Node 2 next address is " + node2.next);
        System.out.println(node3);
        System.out.println("Node 3 next address is " + node3.next);
        System.out.println(node4);
        System.out.println("Node 4 next address is " + node4.next);


        Node head,current;
        head = node1;
        current = node1;
        System.out.println("------------------Iterating List---------------");

        while (current != null){
            System.out.println("Id of node is: " + current.id) ;
            current = current.next;
        }

        ArrayList<Node> nodeArrayList = new ArrayList<>();


    }



}
