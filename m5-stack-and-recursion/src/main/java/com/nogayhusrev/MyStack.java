package org.cydeo;

import java.util.NoSuchElementException;

public class MyStack<T> {

    private StackNode<T> top = null;

    private int size = 0;



    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data){
        StackNode<T> node = new StackNode<>(data);

        if (isEmpty()){
            top = node;
        }else {
            node.next = top;
            top = node;
        }
        size++;
    }

    public T peek(){
        return (T)top.getData();
    }

    public T pop(){
        StackNode<T> peekNode;

        if (isEmpty()){
            throw new NoSuchElementException();
        }else {
            peekNode = top;
            top = top.next;

        }
        size--;
        return (T) peekNode.getData();
    }


}
