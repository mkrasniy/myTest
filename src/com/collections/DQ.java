package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DQ {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        for (int i =0;i<10; i++) list.add(0,i);

        list.forEach(System.out::println);

        System.out.println("----------------");
        List<Integer> list2 = Arrays.asList(22,4543,231,3213);
        list2.forEach(e->list.add(0,e));
        list.forEach(System.out::println);


    }
}
