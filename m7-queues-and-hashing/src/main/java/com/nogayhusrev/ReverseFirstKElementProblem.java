package com.nogayhusrev;

import java.util.Stack;

public class ReverseFirstKElementProblem {
    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println("--------------Before-------------");


        reverseFirstK(queue, 4);
        int k = queue.size();
        for (int i = 0; i < k; i++) {
            System.out.println(queue.dequeue());
        }


    }


    public static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < queue.size - k; i++) {
            queue.enqueue(queue.dequeue());
        }


        return queue;
    }

}
