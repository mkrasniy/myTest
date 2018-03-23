/**
 * Created by IntelliJ IDEA.
 * User: mkrasnyy
 * Date: 15.01.2018
 * Time: 9:08
 */

package com.conc;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class ExecutorExmpl {

@Immutable
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(10);

        Lock l;
        //LockSupport.parkUntil(e,10000L);
        ForkJoinPool f = new ForkJoinPool();

         Map<String, String> getenv = System.getenv();
         getenv.values().parallelStream().forEach((v)->System.out.println("v: "+v+". Th: "+Thread.currentThread().getName()));

           e.execute(()-> System.out.println("curr thread is "+Thread.currentThread().getName()));

        e.shutdown();
    AtomicInteger i = new AtomicInteger(1234);


        //Arrays
    }
}
