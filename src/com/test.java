package com;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Николай on 02.10.2016.
 */
public class test {
    public static void main(String[] args){

        Bank<Integer> bank = new Bank(new Integer[] { 1, 2, 4, 5, 6 });
        Bank<String> bs=new Bank<>(new String[]{"1","2"});
        System.out.println(bs.c[0].equals("1"));
        try {
            bank.setOper(new ArrayList<Integer>());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread t=new Thread();

        try {
            int [] i=new int[3];
            System.out.println(i[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("..........Collections...........");
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);

        HashMap<String, Integer> m=new HashMap<>();
        m.put("1",1);
        m.put("2",2);
        m.put("4",4);
        Integer i=m.put("2",22);
        if (i!=null){
            System.out.println(i+ " is overrided by "+m.get("2"));
        }

        for (String s : m.keySet()) {
            System.out.println(m.get(s));

        }
        System.out.println("................I/O................");
        try(InputStream is = new FileInputStream("F:\\insert_delete_wsa.sql")) {
            byte[] b=new byte[is.available()];
            is.read(b,0,is.available());
            for (int j = 0; j < b.length; j++) {
                System.out.print((char)b[j]);

            }/*
            while ((i=is.read())!=-1)
            {
                System.out.print((char)i.intValue());
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        /*common_res cr =new common_res();
        for (int j = 0; j < 4; j++) {
            Thread tr = new Thread(new cur_th(cr));
            tr.setName("Поток "+j);
            tr.start();
        }*/
        System.out.println("............LAMBDA APP.............");
        op o;
        o=(x,e)->x+e.length();
        System.out.println(o.calc(4,"df"));
        System.out.println("end of app............");
    }

}
class Bank<T> {
    T[] c;

    public Bank() {
    }

    public Bank(T[] c) {
        this.c = c;
    }
    public void  setOper(List<?> l) throws Exception{
        System.out.println(l.size());
    }
}
class  common_res{
    public int x=0;
}

class cur_th implements Runnable {
    common_res r;

    public cur_th(common_res r) {
        this.r = r;
    }

    @Override
    public void run() {
        synchronized (r) {
            r.x = 1;
            for (int i = 0; i < 4; i++) {
                System.out.printf("%s %d \n", Thread.currentThread(), r.x);
                r.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}

interface  op{
    int calc(int x, String e);
}