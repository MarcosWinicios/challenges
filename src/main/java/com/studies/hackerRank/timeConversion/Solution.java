package com.studies.hackerRank.timeConversion;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        DateTimeFormatter formatter12Hour = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter formatter24Hour = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time = LocalTime.parse(s, formatter12Hour);

        return time.format(formatter24Hour);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
