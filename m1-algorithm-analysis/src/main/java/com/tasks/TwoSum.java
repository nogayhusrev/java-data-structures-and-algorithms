package com.tasks;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] values = new int[]{2, 7, 9, 11};
        int target = 2;
        System.out.println(Arrays.toString(twoSum(values, target)));


    }

    private static int[] twoSum(int[] ints, int target) {
        //Brute Force Solution
        for (int i = 0; i < ints.length; i++)
            for (int j = 1; j < ints.length; j++)
                if (i != j && ints[i] + ints[j] == target)
                    return new int[]{i, j};


        return null;
    }


}

/*
Two Sum
• Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */