/**
 * Created by IntelliJ IDEA.
 * User: mkrasnyy
 * Date: 23.03.2018
 * Time: 15:23
 */

package com.conc;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class FJPool {
    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        ForkJoinTask<String> fjTask = ForkJoinTask.adapt(()-> {System.out.println("ssss"); return "sss";});
        fjTask.fork();
        System.out.println("Join res: "+fjTask.join());
     //   RecursiveTask
    }
}
