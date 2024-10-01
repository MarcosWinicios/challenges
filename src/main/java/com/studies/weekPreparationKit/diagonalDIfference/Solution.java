package com.studies.weekPreparationKit.diagonalDIfference;

import com.studies.utils.AbsoluteValues;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> leftDiagonal = new ArrayList<>();
        List<Integer> rightDiagonal = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            leftDiagonal.add(arr.get(i).get(i));
            int reverseIndex = (arr.size() - 1) - i;
            rightDiagonal.add(arr.get(i).get(reverseIndex));
        }

        int leftSum = leftDiagonal.stream()
                .reduce(Integer::sum)
                .get();

        int rightSum = rightDiagonal.stream()
                .reduce(Integer::sum)
                .get();

        int difference = 0;
        if(leftSum > rightSum){
            difference = leftSum - rightSum;
        }else{
            difference = rightSum - leftSum;
        }
        return difference;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(AbsoluteValues.OUTPUT_PATH));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
