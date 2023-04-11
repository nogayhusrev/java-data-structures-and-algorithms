package com.nogayhusrev;

public class StackNode<T> {

    T data;

    StackNode<T> next;

    public StackNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
