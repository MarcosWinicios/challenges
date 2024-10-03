package com.studies.leetocde.twoSum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Result{

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0] = i;
                result[1] = map.get(nums[i]);
            }
            map.put( Math.abs(target - nums[i]), i);
        }
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        return result;
    }
}

public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,11,15};
//        int target = 9;

//        int[] nums = new int[]{3,2,4};
//        int target = 6;


        int[] nums = new int[]{-1, 3, 3, -3};
        int target = 4;

        int[] twoSum = Result.twoSum(nums, target);

        System.out.println(Arrays.toString(twoSum));
    }
}
