package com.nogayhusrev;

public class MyQueueTest {
    public static void main(String[] args) {

        MyQueue<Integer> mq = new MyQueue<>();

        for (int i = 0; i < 10; i++) {
            mq.enqueue(i);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(mq.dequeue());
        }
    }
}