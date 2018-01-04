package com.collections;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class AgregateOperations {
    public static void main(String[] args) {
       for (int i=10; i<=1000000000; i*=10)test(i);
    }

    static void test(int max){
        List<Integer> list= new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<max;i++)
            list.add(random.nextInt(max));
        System.out.println("Testing Collection with "+max+" elements:");

        Instant start = Instant.now();
        list.stream().mapToInt(Integer::intValue).filter(i -> i >= 30).average();
        list.stream().reduce((a,b)->b/3+a/(4+8*b)+111).orElse(-1);
        long syncDur=Duration.between(start, Instant.now()).toMillis();
        System.out.println("Duration sync: "+ syncDur);

        Instant startParallel = Instant.now();
        list.parallelStream().mapToInt(Integer::intValue).filter(i -> i >= 30).average().orElse(-1);
        list.parallelStream().reduce((a,b)->b/3+a/(4+8*b)+111).orElse(-1);
        long parDur=Duration.between(startParallel, Instant.now()).toMillis();
        System.out.println("Duration parallel: "+ parDur);





    }
}
