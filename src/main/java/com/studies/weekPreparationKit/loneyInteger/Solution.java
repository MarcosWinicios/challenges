package com.studies.weekPreparationKit.loneyInteger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    //O(n)
    public static int lonelyintegerXOROperatorSolution(List<Integer> list) {
        int unique = 0;
        for (int num : list) {
            unique ^= num;
        }
        return unique;
    }

    //O(n)
    public static int lonelyintegerHashSetSolution(List<Integer> list) {
        Set<Integer> set = new HashSet<>();

        for(int number: list){
            if(set.contains(number)){
                set.remove(number);
            }else{
                set.add(number);
            }
        }
        return set.iterator().next();
    }

    //O(n²)
    public static int lonelyintegerCollectionsFrequencySolution(List<Integer> list) {
        int result = 0;
        for(int number : list){
            if(Collections.frequency(list, number) == 1){
                result = number;
                break;
            }
        }
        return result;
    }

    //O(n log n)
    public static int lonelyintegerSortSolution(List<Integer> list) {
        Collections.sort(list);

        for(int i = 0; i < list.size() - 1; i += 2){
            if(list.get(i) != list.get(i + 1)){
                return list.get(i);
            }
        }

        return list.get(list.size() -1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

//        int result = Result.lonelyinteger(a);
        int result = Result.lonelyintegerCollectionsFrequencySolution(a);
        System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
