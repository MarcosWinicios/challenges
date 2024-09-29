package com.studies.weekPreparationKit.MiniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        if(arr.size() < 1 || arr.size() > Math.pow(2, 10)){
            throw new IllegalArgumentException("Invalid input");
        }

        //O(n)
        long totalSum = 0;
        for (Integer number : arr) {
            totalSum += number;
        }

        List<Long> sumList = new ArrayList<>();
        for (Integer number : arr) {
            long sumExcluding = totalSum - number;
            sumList.add(sumExcluding);
        }

        Long min = sumList.getFirst();
        Long max = sumList.getFirst();

        for (Long number : sumList) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println(min + " " + max);

//        sumList.sort(Long::compareTo);
//        System.out.println(sumList.getFirst() + " " + sumList.getLast());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

