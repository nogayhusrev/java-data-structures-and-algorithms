package com.cydeo;

import java.util.Arrays;

import static com.cydeo.SearchUtility.*;

public class SearchApp {

    public static void main(String[] args) {
        int[] array = new int[100];
        int val = (int) (Math.random()*100);
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random()*100);
        }

        long time;


        Arrays.sort(array);
        System.out.println("-------------Array After Sorted-----------");
        System.out.println(Arrays.toString(array));
        System.out.println("Value to search: " + val);

        time = System.nanoTime();
        System.out.println("-------------Linear Search----------");
        System.out.println(linearSearch(array,val));
        System.out.println("Linear Search time Performance: " + (System.nanoTime()-time));

        time = System.nanoTime();
        System.out.println("-------------Iterative Binary Search----------");
        System.out.println(binarySearchIterative(array,val ));
        System.out.println("Iterative Binary Search time Performance: " + (System.nanoTime()-time));

        time = System.nanoTime();
        System.out.println("-------------Recursive Binary Search----------");
        System.out.println(binarySearchRecursive(array,val ));
        System.out.println("Recursive Binary Search time Performance: " + (System.nanoTime()-time));

        time = System.nanoTime();
        System.out.println("-------------Iterative Ternary Search----------");
        System.out.println(ternarySearchIterative(array,val ));
        System.out.println("Iterative Ternary Search time Performance: " + (System.nanoTime()-time));

        time = System.nanoTime();
        System.out.println("-------------Recursive Ternary Search----------");
        System.out.println(ternarySearchRecursive(array,val,0,array.length-1 ));
        System.out.println("Recursive Ternary Search time Performance: " + (System.nanoTime()-time));

        time = System.nanoTime();
        System.out.println("-------------Jump Search----------");
        System.out.println(jumpSearch(array,val ));
        System.out.println("Jump Search time Performance: " + (System.nanoTime()-time));

        time = System.nanoTime();
        System.out.println("-------------Exponential Search----------");
        System.out.println(exponentialSearch(array,val ));
        System.out.println("Exponential Search time Performance: " + (System.nanoTime()-time));
    }
}
