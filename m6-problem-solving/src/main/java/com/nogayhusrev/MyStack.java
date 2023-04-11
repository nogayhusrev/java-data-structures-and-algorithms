package com.nogayhusrev;

import java.util.NoSuchElementException;

public class MyStack<T> {

    private StackNode<T> top = null;
    private StackNode<T> bottom = null;
    private int size = 0;


    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T data) {
        StackNode<T> node = new StackNode<>(data);

        if (isEmpty()) {
            bottom = top = node;
        } else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() {
        return (T) top.getData();
    }

    public T pop() {
        StackNode<T> peekNode, prev;

        if (isEmpty())
            throw new NoSuchElementException();
        if (top == bottom) {
            peekNode = top;
            top = bottom = null;

        } else {
            peekNode = top;
            prev = bottom;

            while (prev.next != top)
                prev = prev.next;
            prev.next = null;
            top = prev;

        }
        size--;
        return (T) peekNode.getData();
    }


}
