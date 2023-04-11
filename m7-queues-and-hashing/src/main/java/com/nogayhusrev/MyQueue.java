package com.cydeo;


import java.util.NoSuchElementException;

public class MyQueue<T> {
    QNode<T> front;
    QNode<T> back;
    int size = 0;



    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(T item){
        QNode<T> node = new QNode<>(item);
        if (isEmpty())
            front = back = node;
        else {
            back.next = node;
            back = node;
        }
        size++;
    }

    public T dequeue(){

        QNode<T> frontNode;
        if (isEmpty())
            throw new NoSuchElementException();

        if (front == back){
            frontNode = front;
            front = back = null;
        }else {
            frontNode = front;
            front = front.next;
        }
        size--;

        return (T) frontNode.val;
    }

    public int size(){
        return size;
    }





}
