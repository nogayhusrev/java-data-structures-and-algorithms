package com.nogayhusrev;

public class SearchUtility {

    public static int linearSearch(int[] array, int e) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                index = i;
                break;
            }
        }


        return index;
    }

    public static int binarySearchIterative(int[] array, int e) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (array[middle] == e)
                return middle;
            else if (e < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] array, int e) {
        return binarySearchRecursive(array, e, 0, array.length - 1);
    }

    private static int binarySearchRecursive(int[] array, int e, int left, int right) {

        if (left > right)
            return -1;

        int middle = (right + left) / 2;

        if (array[middle] == e)
            return middle;
        else if (e < array[middle])
            right = middle - 1;
        else
            left = middle + 1;

        return binarySearchRecursive(array, e, left, right);
    }

    public static int ternarySearchIterative(int[] array, int e) {
        int left = 0;
        int right = array.length - 1;


        while (left <= right) {
            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - partition;
            if (array[middle1] == e) return middle1;
            if (array[middle2] == e) return middle2;
            if (e < array[middle1]) right = middle1 - 1;
            else if (e > array[middle2]) left = middle2 + 1;
            else {
                left = middle1 + 1;
                right = middle2 - 1;
            }
        }

        return -1;
    }

    public static int ternarySearchRecursive(int[] array, int e, int left, int right) {


        if (left > right) return -1;


        int partition = (right - left) / 3;
        int middle1 = left + partition;
        int middle2 = right - partition;
        if (array[middle1] == e) return middle1;
        if (array[middle2] == e) return middle2;
        if (e < array[middle1]) return ternarySearchRecursive(array, e, left, middle1 - 1);
        else if (e > array[middle2]) return ternarySearchRecursive(array, e, middle2 + 1, right);
        else return ternarySearchRecursive(array, e, middle1 + 1, middle2 - 1);


    }

    public static int jumpSearch(int[] array, int e) {
        int blockSize = (int) (Math.sqrt(array.length));
        int start = 0;
        int next = blockSize;
        while (start < array.length && array[next - 1] < e) {
            start = next;
            next += blockSize;
            if (next > array.length) next = array.length;
        }

        for (int i = start; i < next; i++) {
            if (array[i] == e)
                return i;
        }

        return -1;
    }

    public static int exponentialSearch(int[] array, int e) {
        int bound = 1;
        while (bound < array.length && array[bound] < e) bound *= 2;

        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);

        return binarySearchRecursive(array, e, left, right);
    }


}