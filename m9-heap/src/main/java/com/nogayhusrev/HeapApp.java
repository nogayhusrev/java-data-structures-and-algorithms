package com.cydeo;

public class HeapApp {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap(10);

        for (int i = 0; i < 10; i++) {
            myHeap.insert(i);
        }

        myHeap.printHeap();
        myHeap.remove();
        myHeap.printHeap();

    }
}