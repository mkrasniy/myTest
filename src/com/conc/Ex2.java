/**
 * Created by IntelliJ IDEA.
 * User: mkrasnyy
 * Date: 15.01.2018
 * Time: 13:21
 */

package com.conc;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Ex2 {
    static String message;

    private static class CorrectorThread
            extends Thread {

        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            // Key statement 1:
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        Thread t = new CorrectorThread();
        t.start();
        message = "Mares do not eat oats.";
        t.join();

        new ForkJoinPool();
       //ForkJoinTask
        Thread.sleep(2000);
        // Key statement 2:
        System.out.println(message);
    }
}
