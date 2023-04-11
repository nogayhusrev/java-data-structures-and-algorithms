package com.cydeo;

public class QNode<T> {

    T val;

    QNode<T> next;

    public QNode(T val) {
        this.val = val;
    }
}
