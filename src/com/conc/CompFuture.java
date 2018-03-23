/**
 * Created by IntelliJ IDEA.
 * User: mkrasnyy
 * Date: 23.03.2018
 * Time: 14:17
 */

package com.conc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompFuture c= new CompFuture();
        long start=System.nanoTime();
        c.start();


        System.out.println("Time Elapsed, mills: "+TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start));

    }


    public void start() throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> f =
                CompletableFuture.supplyAsync(this::slowInit);
        CompletableFuture<Integer> f2 = f.thenApplyAsync(this::slowInc);
        CompletableFuture<Integer> f3 =
                f3 = f2.thenCombine(f, (x,y)->x+y);;
        for (int i = 0; i < 100; i++) {
            f2 = f2.thenApply(this::slowInc);
            f3 = f3.thenCombine(f2, (x,y)->x+y);
        }

        System.out.println("Combined res: "+f3.get());
        f2.get();
    }

    private int slowInit(){
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SLOW INIT INVOKED");
        return 1;
    }

    private int slowInc(int input){
       /* try{
        //    TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("SLOW INC INVOKED: "+input);
        return ++input;
    }

    private void supplyInt(int input){
        System.out.println("SUPPLIER INVOKED: "+input);
    }
}
