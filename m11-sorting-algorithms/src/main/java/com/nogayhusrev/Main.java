package com.nogayhusrev;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr;
        int len = 1000;
        long startTime;
        long finishTime;


        System.out.println("================Bubble Sort================");
        arr = intArrayGenerator(len);
        System.out.println("Before Sort: " + Arrays.toString(arr));
        startTime = System.nanoTime();
        arr = SortingMethods.bubbleSort(arr);
        finishTime = System.nanoTime();
        System.out.println("After Sort: " + Arrays.toString(arr));
        System.out.println("Time : " + (finishTime - startTime));
        System.out.println();

        System.out.println("================Selection Sort================");
        arr = intArrayGenerator(len);
        System.out.println("Before Sort: " + Arrays.toString(arr));
        startTime = System.nanoTime();
        arr = SortingMethods.selectionSort(arr);
        finishTime = System.nanoTime();
        System.out.println("After Sort: " + Arrays.toString(arr));
        System.out.println("Time : " + (finishTime - startTime));
        System.out.println();

        System.out.println("================Insertion Sort================");
        arr = intArrayGenerator(len);
        System.out.println("Before Sort: " + Arrays.toString(arr));
        startTime = System.nanoTime();
        arr = SortingMethods.insertionSort(arr);
        finishTime = System.nanoTime();
        System.out.println("After Sort: " + Arrays.toString(arr));
        System.out.println("Time : " + (finishTime - startTime));
        System.out.println();


        System.out.println("================Merge Sort================");
        arr = intArrayGenerator(len);
        System.out.println("Before Sort: " + Arrays.toString(arr));
        startTime = System.nanoTime();
        SortingMethods.mergeSort(arr);
        finishTime = System.nanoTime();
        System.out.println("After Sort: " + Arrays.toString(arr));
        System.out.println("Time : " + (finishTime - startTime));
        System.out.println();

        System.out.println("================Quick Sort================");
        arr = intArrayGenerator(len);
        System.out.println("Before Sort: " + Arrays.toString(arr));
        startTime = System.nanoTime();
        SortingMethods.quickSort(arr, 0, arr.length - 1);
        finishTime = System.nanoTime();
        System.out.println("After Sort: " + Arrays.toString(arr));
        System.out.println("Time : " + (finishTime - startTime));
        System.out.println();


    }

    private static int[] intArrayGenerator(int len) {


        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = new Faker().number().numberBetween(1, len);
        }

        return arr;

    }


}