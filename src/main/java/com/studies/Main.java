package com.studies;

import com.studies.utils.UseFullMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        UseFullMethods.printList(list);
        UseFullMethods.printListIndexes(list);

        list.remove(1);

        UseFullMethods.printList(list);
        UseFullMethods.printListIndexes(list);*/


        List<List<Integer>> matrix = new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3, 4)),
                new ArrayList<>(Arrays.asList(5, 6, 7, 8)),
                new ArrayList<>(Arrays.asList(9, 0, 8, 6))
            )
        );

        UseFullMethods.printSquareMatrix(matrix);

        var randomMatrix = UseFullMethods.generateRandomSquareMatrix(4);
        UseFullMethods.printSquareMatrix(randomMatrix);

        var randomList = UseFullMethods.generateRandomList(10);
//        UseFullMethods.printList(randomList);

        List<Integer> diagonal = new ArrayList<>();

        for(int i = 0; i < randomMatrix.size(); i++){
            for(int j = 0; j <= i; j++){
                System.out.print(randomMatrix.get(i).get(j));
            }
        }

    }
}