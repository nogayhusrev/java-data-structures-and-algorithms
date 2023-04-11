package com.cydeo;

import java.util.Arrays;
import java.util.Map;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(3 + "th element is: " + getKthLargest(array,3));
    }

    public static int getKthLargest(int[] array, int k){
        //create a heap
        MyHeap myHeap = new MyHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            myHeap.insert(array[i]);
        }

        for (int i = 0; i < k-1; i++) {
            myHeap.remove();
        }

        return myHeap.remove();
    }
}
