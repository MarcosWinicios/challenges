package com.studies.utils;

import java.util.List;

public class UseFullMethods {

    public static <T> void printList(List<T> list){
        System.out.println("\n"+list.toString());
    }

    public static <T> void printListIndexes(List<T> list){

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
