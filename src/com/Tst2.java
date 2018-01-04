package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tst2 {

    public static void main(String[] args) {
        int []i=new int[10];
        try {

            System.out.println("int[11]=" + i[11]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Oops, "+a);
        }
        try {
            int[] y = new int[-1];
        }catch (Exception e){
            System.out.println("try to new int[-1] equals: "+e);
        }

        String s="s";
       // s.concat();
        //StringBuilder
     //   List
        s="bla bla bla";
        s.chars().forEach(System.out::println);
        String s2 =  s.subSequence(1,2).toString();
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int ind=0; ind<10000;ind++){

             list.add(rand.nextInt());
        }

        /*Integer [] iii= list.toArray(new Integer[0]);
        new ArrayList<>()*/

        String ss = "chararray";
        String ss2=new String(new char[]{'c','h','a','r','a','r','r','a','y'});
        String ss3=new String("chararray");
        System.out.println("ss=ss2:"+ss==ss2);

        System.out.println("ss.equals(ss2)"+ss.equals(ss2));
        System.out.println("ss==ss3:"+ss==ss3);

      //new ArrayList<>()
    }

}
