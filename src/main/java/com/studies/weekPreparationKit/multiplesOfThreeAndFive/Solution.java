package com.studies.weekPreparationKit.multiplesOfThreeAndFive;

import java.util.Scanner;

public class Solution {

    public static long CalSum(int n, int k){        //function to calculate the sum of multiple of 3 and 5**

        long m = (long) n/k; // finding the no of terms are multiple of k in given range n...**

        long sum = k * ((m*(m+1))/2);  // later calculating the sum of those numbers ....**

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        while(t>0) {
            int n = in.nextInt();
            long ans = CalSum(n-1,3) + CalSum(n-1,5) - CalSum(n-1,15);
            System.out.println(ans);
            t--;
        }
    }


}
