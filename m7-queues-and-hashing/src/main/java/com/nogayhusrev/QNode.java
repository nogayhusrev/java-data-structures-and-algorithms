package com.nogayhusrev;

public class QNode<T> {

    T val;

    QNode<T> next;

    public QNode(T val) {
        this.val = val;
    }
}
