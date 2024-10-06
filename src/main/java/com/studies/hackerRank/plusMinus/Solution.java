package com.studies.hackerRank.plusMinus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int listSize = arr.size();
            int qntPositives = 0;
            int qntNegatives = 0;
            int qntZeros = 0;

            for(Integer number : arr){
                if(number == 0){
                    qntZeros++;
                    continue;
                }

                if(number > 0) {
                    qntPositives++;
                    continue;
                }

                qntNegatives++;
            }

            System.out.printf("%.6f\n%.6f\n%.6f",
                    (float)qntPositives/listSize,
                    (float)qntNegatives/listSize,
                    (float)qntZeros/listSize);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}