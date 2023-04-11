package com.cydeo;

public class SortingMethods {

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap = true;
                }
            }
            if (!swap)
                return arr;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);

        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int toBeInserted = arr[i];
            int j = i - 1;
            while (j >= 0 && toBeInserted < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = toBeInserted;
        }

        return arr;
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0; //one pointer for each array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];

        }
        while (i < left.length) result[k++] = left[i++];

        while (j < right.length) result[k++] = right[j++];

    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2)
            return;

        int mid = arr.length / 2;

        int[] leftArray = new int[mid];
        for (int i = 0; i < mid; i++) leftArray[i] = arr[i];

        int[] rightArray = new int[arr.length - mid];
        for (int i = mid; i < arr.length; i++) rightArray[i - mid] = arr[i];

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);

    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int boundary = partition(arr, start, end);
        quickSort(arr, start, boundary - 1);
        quickSort(arr, boundary + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot)
                swap(arr, i, boundary++);
        }
        return boundary - 1;

    }


}




























