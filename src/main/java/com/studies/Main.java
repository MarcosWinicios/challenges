package com.studies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        printList(list);
        printListIndexes(list);
        list.remove(1);
        printList(list);
        printListIndexes(list);
    }

    private static <T> void printList(List<T> list){
        System.out.println("\n"+list.toString());
    }

    private static <T> void printListIndexes(List<T> list){

        for (int i = 0; i < list.size(); i++){
            if(i == 0 ){
                System.out.print("[");
            }else {
                System.out.print(", ");
            }
            System.out.print(list.indexOf(
                    list.get(i)
            ));

            if(i == list.size() - 1){
                System.out.print("]");
            }
        }
    }
}