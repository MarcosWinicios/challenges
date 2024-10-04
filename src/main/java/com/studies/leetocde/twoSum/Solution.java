package com.studies.leetocde.twoSum;


import com.studies.utils.UseFullMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Result {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int loops = 0;

        for (int i = 0; i < nums.length; i++) {
            loops++;
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                break;
            }
            map.put(target - nums[i], i);
        }
        System.out.println("loops: " + loops);
        return result;
    }

    public static int[] twoSumTwoPointer(int[] nums, int target) {

        int[] result = new int[2];
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int loops = 1;
        boolean match = false;
        System.out.println("leftPointer: " + leftPointer + " rightPointer: " + rightPointer + "\n");

        while (!match) {
            System.out.println("loops: " + loops);
            twoPointerLog(leftPointer, rightPointer, nums);
            loops++;
            int sum = nums[leftPointer] + nums[rightPointer];

            if (sum < 0 && target < 0) {
                if (sum < target) {
                    rightPointer--;
                } else if (sum > target) {
                    leftPointer++;
                } else {
                    result[0] = leftPointer;
                    result[1] = rightPointer;
                    match = true;
                }
                continue;
            }

            if (sum > target) {
                rightPointer--;
            } else if (sum < target) {
                leftPointer++;
            } else {
                result[0] = leftPointer;
                result[1] = rightPointer;
                match = true;
            }
        }
        return result;
    }

    //Não funciona em todos os casos
    private static void twoPointerLog(int leftPointer, int rightPointer, int[] nums) {
        System.out.println(
                "leftPointer: " + leftPointer +
                        " rightPointer: " + rightPointer + ": "
                        + nums[leftPointer] + " + " + nums[rightPointer] + " = " + (nums[leftPointer] + nums[rightPointer]));
    }
}
public class Solution {

    private static Integer testerCounter = 1;

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;

        test(nums1, target1);

        int[] nums2 = new int[]{10, 7, -1, 15};
        int target2 = 9;

        test(nums2, target2);


        int[] nums3 = new int[]{3, 2, 4};
        int target3 = 6;

        test(nums3, target3);

        int[] nums4 = new int[]{-1, 3, 3, -3};
        int target4 = -4;

        test(nums4, target4);

        int[] nums5 = new int[]{-1, -2, -3, -4, -5};
        int target5 = -8;

        test(nums5, target5);

        int[] nums6 = new int[]{150, 24, 79, 50, 88, 345, 3};
        int target6 = 200;

        test(nums6, target6);

    }

    private static void test(int[] arr, int target) {
        System.out.println("--------------------------");
        System.out.println("Init test execution: " + testerCounter);

        System.out.println("\nCall Method: printArray(arr, target)");
        System.out.printf("input: arr = %s, target = %d\n", Arrays.toString(arr), target);
        UseFullMethods.printArray(Result.twoSum(arr, target));

        System.out.println("\nCall Method: twoSumTwoPointer(arr, target)");
        System.out.printf("input: arr = %s, target = %d\n", Arrays.toString(arr), target);
        UseFullMethods.printArray(Result.twoSumTwoPointer(arr, target));

        System.out.println("\nFinish test execution: " + testerCounter);
        testerCounter++;
    }
}
