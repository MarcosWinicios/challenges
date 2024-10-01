package com.studies;

import com.studies.utils.UseFullMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        UseFullMethods.printList(list);
        UseFullMethods.printListIndexes(list);

        list.remove(1);

        UseFullMethods.printList(list);
        UseFullMethods.printListIndexes(list);
    }



}