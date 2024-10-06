package com.studies.hackerRank.compareTheTriplets;

import com.studies.utils.AbsoluteValues;
import com.studies.utils.UseFullMethods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoints = 0;
        int bPoints = 0;
        int size = a.size();

        for (int i = 0; i < size; i++) {
            if(a.get(i) == b.get(i)){
                continue;
            }
            if (a.get(i) > b.get(i)) {
                aPoints++;
                continue;
            }
            bPoints++;
        }
        return Arrays.asList(aPoints, bPoints);
    }
}
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(AbsoluteValues.OUTPUT_PATH));

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = Result.compareTriplets(a, b);

            UseFullMethods.printList(result);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
