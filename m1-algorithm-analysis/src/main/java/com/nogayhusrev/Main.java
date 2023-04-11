package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {


        long numberOfOperations = 0;
        int n = 100000;
        long startTime;
        long endTime;


        //---------------------O(n^2)--------------------
        System.out.println("---------------------Big O In Single Loop O(n)=n---------------------------");
        System.out.println("Input size n is = " + n);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations++;
        }
        endTime = System.currentTimeMillis();
        System.out.println("NUmber of operations: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");


        //---------------------O(n^2)--------------------
        System.out.println("---------------------Big O In Nested Loop O(n)=n^2---------------------------");
        System.out.println("Input size n is = " + n);
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("NUmber of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        //---------------------Logarithmic Operations--------------------
        System.out.println("---------------------Logarithmic Operations O(n)=Log(n)---------------------------");
        System.out.println("Input size n is = " + n);
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i *= 2) {
            numberOfOperations++;
        }
        endTime = System.currentTimeMillis();
        System.out.println("NUmber of operations: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");


        //---------------------O(n^3)--------------------
        System.out.println("---------------------Big O In Triple Nested Loop O(n)=n^3---------------------------");
        n = 10000;
        System.out.println("Input size n is = " + n);
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations++;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("NUmber of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

    }
}