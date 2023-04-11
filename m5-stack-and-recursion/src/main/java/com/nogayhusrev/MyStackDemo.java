package com.nogayhusrev;

public class MyStackDemo {
    public static void main(String[] args) {

        System.out.println("---------------Stack Demo-------------");

        MyStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);

        }

        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());

        }


    }
}